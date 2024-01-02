package basictestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomModule.HomepageMagentoEcommerse;
import pomModule.MithraWarmupPant;
import pomModule.PantsBottomMagentoCommerse;

public class VerifytobutPant {
	private WebDriver driver;

	
	@BeforeClass
	public void luanchingbrowser()
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
	}
	
	@Test
	public void verifytobuyMithraWarpuppant() throws InterruptedException
	{
		  HomepageMagentoEcommerse menbottompant= new HomepageMagentoEcommerse(driver);
		    menbottompant.MoveOnMENbottomoption();
		    
		    PantsBottomMagentoCommerse selectpant= new PantsBottomMagentoCommerse(driver);
		    
		    selectpant.selectfromsortdropdown();
		    selectpant.verifyproductprice();
		    selectpant.clickonproduct();
		    
		    MithraWarmupPant checkout = new MithraWarmupPant(driver);
		    
		    	checkout.SelectSizeOfPant();
		    	checkout.SelectCOLOURofPant();
		    	checkout.AddQTYofPant();
		    	checkout.AddProductInCart();
		    	//Thread.sleep(5000);
		    	checkout.SelectCartSymbol();
		    	checkout.ProceedToCheckOut();
		    
	}
	
	@AfterClass
	public void closewindow()
	{
		driver.quit();
	}
	
}
