package megentoTestclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pomModule.HomepageMagentoEcommerse;
import pomModule.HoodiesAndSweatshirtsTopsMenMagentoCommerse;
import pomModule.OsloTrakHoodieMagentoCommerse;

public class VerifytobuyOSLOTRACKHOODIE {public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","src\\main\\resources\\allbrowser\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	
    driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
	
	HomepageMagentoEcommerse mentophoodie= new HomepageMagentoEcommerse(driver);
	mentophoodie.MoveOnMENoption();

	String acturl=driver.getCurrentUrl();
	System.out.println(acturl);
	String expurl="https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html";
     System.out.println(expurl);
	
	if(acturl.equals(expurl))
	{
		System.out.println("pass");
	}
	
	else
	{
		System.out.println("fail");
	}
	
	
	HoodiesAndSweatshirtsTopsMenMagentoCommerse choosehoodie = new HoodiesAndSweatshirtsTopsMenMagentoCommerse(driver);
	choosehoodie.ClickOnModeListSymbol();
	choosehoodie.SelectFromShortByDropdown();
	choosehoodie.getProductPrice();
	choosehoodie.clickonproduct();
	
	String actualurl=driver.getCurrentUrl();
	System.out.println(actualurl);
	
	String expectedurl="https://magento.softwaretestingboard.com/oslo-trek-hoodie.html";
	System.out.println(expectedurl);
	
	if(actualurl.equals(expectedurl)) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	
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
}