package crossbrowserTESTNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import basebrowsers.Browsers;
import pomModule.HomepageMagentoEcommerse;
import pomModule.HoodiesAndSweatshirtsTopsMenMagentoCommerse;
import pomModule.OsloTrakHoodieMagentoCommerse;
import pomModule.StarkfundamentalhoodieMagentocommerse;
import util.Utility;

public class Verifyhoodie extends Browsers {
	
	private HomepageMagentoEcommerse mentophoodie;
	private HoodiesAndSweatshirtsTopsMenMagentoCommerse choosehoodie;
	private OsloTrakHoodieMagentoCommerse orderhoodie;
	private StarkfundamentalhoodieMagentocommerse secondordersecondhoodie;
	private WebDriver driver;
	private String testid;
	
	private static ExtentTest test;
	private static ExtentHtmlReporter reporter;
	@Parameters("browsers")
	@BeforeTest
	public void launchbrowser(String browser)
	{
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
 
		if(browser.equals("Chrome"))
		{
			driver=openchrome();
		}
		
		if(browser.equals("firefox"))
		{
			driver=openfirefox();
		}
		
		if(browser.equals("edge"))
		{
			driver =openedge();
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void createpomobjects()
	{
		mentophoodie= new HomepageMagentoEcommerse(driver);
		choosehoodie = new HoodiesAndSweatshirtsTopsMenMagentoCommerse(driver);
		orderhoodie = new OsloTrakHoodieMagentoCommerse(driver);
		secondordersecondhoodie= new StarkfundamentalhoodieMagentocommerse(driver);
	}
	
	@BeforeMethod
	public void enterurlofapplication()
	{
        System.out.println("Before Method");
		driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
		
		
		
	}
	
	@Test(priority=0)
	public void verifytoproductchoose() throws InterruptedException
	{
		testid="TC_01";
        mentophoodie.MoveOnMENoption();
		
		String expurl="https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(expurl, acturl, "url is correct");
		
		choosehoodie.ClickOnModeListSymbol();
		choosehoodie.SelectFromShortByDropdown();
	
		choosehoodie.getProductPrice();
	    choosehoodie.clickonproduct();
		orderhoodie.SelectSizeOfProduct();
		orderhoodie.SelectCOLOURofProduct();
		orderhoodie.AddQTY();
		orderhoodie.AddProductInCart();
		
	
		Thread.sleep(4000);
		orderhoodie.SelectCartSymbol();
		orderhoodie.ClickOnSeeDetails();
		orderhoodie.ProceedToCheckOut();
		
	}
	
	@Test(priority=1)
	public void VerifySecondproductchoose() throws InterruptedException
	{

mentophoodie.MoveOnMENoption();
        testid="TC_02";
		String expurl="https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(expurl, acturl, "url is correct");
		
		choosehoodie.ClickOnModeListSymbol();
		choosehoodie.SelectFromShortByDropdown();
		
		
		choosehoodie.getsecondproductprice();
		choosehoodie.getsecondproductdetails();
			
		secondordersecondhoodie.SelectSizeOfProductsecond();
		secondordersecondhoodie.SelectCOLOURofProductsecond();
		secondordersecondhoodie.AddQTYsecond();
		secondordersecondhoodie.AddProductInCartsecond();
		Thread.sleep(4000);
		secondordersecondhoodie.SelectCartSymbolsecond();
		secondordersecondhoodie.ClickOnSeeDetailssecond();
		secondordersecondhoodie.ProceedToCheckOutsecond();

	}

	@AfterMethod
	public void failtestscreenshot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE== result.getStatus())
		{
			Utility.capturescreenshot(driver, testid);
		}
	}
	@AfterClass
	public void closewindow()
	{
		mentophoodie= null;
		choosehoodie = null;
		orderhoodie = null;
		secondordersecondhoodie = null;
	}
	
	@AfterTest
	public void  closethebrowser()
	{
		driver.close();
		driver=null;
		System.gc(); // garbage collector
	}

}
