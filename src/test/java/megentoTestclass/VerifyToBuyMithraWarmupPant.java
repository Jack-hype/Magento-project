package megentoTestclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomModule.HomepageMagentoEcommerse;
import pomModule.MithraWarmupPant;
import pomModule.PantsBottomMagentoCommerse;


public class VerifyToBuyMithraWarmupPant {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\allbrowser\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			
		    driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
			
		  
		    HomepageMagentoEcommerse menbottompant= new HomepageMagentoEcommerse(driver);
		    menbottompant.MoveOnMENbottomoption();
		    
		    PantsBottomMagentoCommerse selectpant= new PantsBottomMagentoCommerse(driver);
		   // selectpant.clickonmodelistbutton();
		    selectpant.selectfromsortdropdown();
		    selectpant.verifyproductprice();
		    selectpant.clickonproduct();
		    
		    MithraWarmupPant checkout = new MithraWarmupPant(driver);
		    
		    	checkout.SelectSizeOfPant();
		    	checkout.SelectCOLOURofPant();
		    	checkout.AddQTYofPant();
		    	checkout.AddProductInCart();
		    	Thread.sleep(5000);
		    	checkout.SelectCartSymbol();
		    	checkout.ProceedToCheckOut();
		    

}
}