package basictestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomModule.HomepageMagentoEcommerse;
import pomModule.HoodiesAndSweatshirtsTopsMenMagentoCommerse;

import pomModule.OsloTrakHoodieMagentoCommerse;

import pomModule.StarkfundamentalhoodieMagentocommerse;

public class VerifytobuyHOODIE {
	private WebDriver driver;
	
	@BeforeClass
	public void launchbrowser()
	{
		System.out.println("before class");
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\allbrowser\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void enterurlofapplication()
	{
        System.out.println("Before Method");
		driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
		
		HomepageMagentoEcommerse mentophoodie= new HomepageMagentoEcommerse(driver);
		mentophoodie.MoveOnMENoption();

		
		
		HoodiesAndSweatshirtsTopsMenMagentoCommerse choosehoodie = new HoodiesAndSweatshirtsTopsMenMagentoCommerse(driver);
		choosehoodie.ClickOnModeListSymbol();
		choosehoodie.SelectFromShortByDropdown();
	}
	
	@Test
	public void verifytoproductchoose() throws InterruptedException
	{

		
		HoodiesAndSweatshirtsTopsMenMagentoCommerse choosehoodie = new HoodiesAndSweatshirtsTopsMenMagentoCommerse(driver);
		
		choosehoodie.getProductPrice();
		choosehoodie.clickonproduct();
		
		OsloTrakHoodieMagentoCommerse orderhoodie = new OsloTrakHoodieMagentoCommerse(driver);
		
		orderhoodie.SelectSizeOfProduct();
		orderhoodie.SelectCOLOURofProduct();
		orderhoodie.AddQTY();
		orderhoodie.AddProductInCart();
		Thread.sleep(4000);
		orderhoodie.SelectCartSymbol();
		orderhoodie.ClickOnSeeDetails();
		orderhoodie.ProceedToCheckOut();
	 
	}
	
	@Test
	public void VerifySecondproductchoose() throws InterruptedException
	{
		HoodiesAndSweatshirtsTopsMenMagentoCommerse choosehoodie = new HoodiesAndSweatshirtsTopsMenMagentoCommerse(driver);

		choosehoodie.getsecondproductprice();
		choosehoodie.getsecondproductdetails();
		
		StarkfundamentalhoodieMagentocommerse secondordersecondhoodie= new StarkfundamentalhoodieMagentocommerse(driver);
		
		secondordersecondhoodie.SelectSizeOfProductsecond();
		secondordersecondhoodie.SelectCOLOURofProductsecond();
		secondordersecondhoodie.AddQTYsecond();
		secondordersecondhoodie.AddProductInCartsecond();
		Thread.sleep(4000);

		secondordersecondhoodie.SelectCartSymbolsecond();
		secondordersecondhoodie.ClickOnSeeDetailssecond();
		secondordersecondhoodie.ProceedToCheckOutsecond();

	}
	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}
	
	
	
}
