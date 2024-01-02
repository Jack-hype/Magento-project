package crossbrowserTESTNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

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
import pomModule.MithraWarmupPant;
import pomModule.PantsBottomMagentoCommerse;
import util.Utility;

public class Verifypant extends Browsers {
	
       private WebDriver driver;
       HomepageMagentoEcommerse menbottompant;
       PantsBottomMagentoCommerse selectpant;
       MithraWarmupPant checkout;
       String testid;
       private static ExtentTest test;
    	private static ExtentHtmlReporter reporter;

    @Parameters("browsers")
	@BeforeTest
	public void luanchingbrowser(String browser)
	{

    	reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browser.equals("Chrome"))
		{
            driver = openchrome();
		}
		
		if(browser.equals("firefox"))
		{
            driver = openfirefox();
		}
		if(browser.equals("edge"))
		{
			driver = openedge();
		}
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
     
	@BeforeClass
	public void objectofpom()
	{
		menbottompant= new HomepageMagentoEcommerse(driver);
		selectpant= new PantsBottomMagentoCommerse(driver);
		checkout = new MithraWarmupPant(driver);
	}

	@BeforeMethod
	public void enterurlofapplication()
	{
        System.out.println("Before Method");
		driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
		menbottompant.MoveOnMENbottomoption();

	}
	
	@Test
	public void verifytobuyMithraWarpuppant() throws InterruptedException
	{
		 testid="tc_05";
		        		    
		        selectpant.selectfromsortdropdown();
		        selectpant.verifyproductprice();
		        selectpant.clickonproduct();
		    
		        checkout.SelectSizeOfPant();
		    	checkout.SelectCOLOURofPant();
		    	checkout.AddQTYofPant();
		    	checkout.AddProductInCart();
		    	Thread.sleep(5000);
		    	checkout.SelectCartSymbol();
		    	checkout.ProceedToCheckOut();
		    
	}
	
	@AfterMethod
	public void screenshot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.capturescreenshot(driver, testid);
		}
	}
	
	@AfterClass
	public void closewindow()
	{
		menbottompant= null;
		selectpant= null;
		checkout =null;
	}

	@AfterTest
	public void closebrowser()
	{
		driver.close();
		driver=null;
		System.gc();
		
	}
}
