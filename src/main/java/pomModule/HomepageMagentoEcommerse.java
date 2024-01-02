package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageMagentoEcommerse {
	
	WebDriver  driver;
	
	/*@FindBy(xpath="(//li[@class='authorization-link'])[1]")
	private WebElement SignIn;*/
	
	@FindBy(xpath="//span[text()='Men']")
	private WebElement Men ;
	
	@FindBy(xpath="//a[@id='ui-id-17']")
	private WebElement menTop ;
	
	@FindBy(xpath="//a[@id='ui-id-20']")
	private WebElement Hoodies ;
	
	@FindBy(xpath="//a[@id='ui-id-18']")
	private WebElement Bottoms  ;
	
	@FindBy(xpath="//a[@id=\"ui-id-23\"]")
	private WebElement pants  ;
	
	private Actions act;
	
	public HomepageMagentoEcommerse(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
		
		act=new Actions(driver);
	}
	
   /*	public void ClickOnSignInOption()
	{
		SignIn.click();
	}*/
	
	public void MoveOnMENoption()
	{
		//Actions act = new Actions (driver);
		act.moveToElement(Men).moveToElement(menTop).moveToElement(Hoodies).click().build().perform();
		
	}
	
	public void MoveOnMENbottomoption()
	{
		//Actions act = new Actions (driver);
		act.moveToElement(Men).moveToElement(Bottoms).moveToElement(pants).click().build().perform();
	}
	
	
	
	
}
