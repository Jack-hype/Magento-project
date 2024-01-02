package megentoTestclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomModule.HomepageMagentoEcommerse;
import pomModule.HoodiesAndSweatshirtsTopsMenMagentoCommerse;
import pomModule.StarkfundamentalhoodieMagentocommerse;

public class VerifytoBuySTARKFUNDAMENTALHOODIE {
	
	public static void main(String[] args) throws InterruptedException {
		
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
			choosehoodie.getsecondproductprice();
			choosehoodie.getsecondproductdetails();
			
			String actualurlsecond=driver.getCurrentUrl();
			System.out.println(actualurlsecond);
			
			String expectedurlsecond="https://magento.softwaretestingboard.com/stark-fundamental-hoodie.html";
			System.out.println(expectedurlsecond);
			
			if(actualurlsecond.equals(expectedurlsecond)) {
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			
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
}