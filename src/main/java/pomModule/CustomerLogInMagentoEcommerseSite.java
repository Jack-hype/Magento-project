package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLogInMagentoEcommerseSite {
	
	@FindBy(xpath="//input[@name='login[username]']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='login[password]']")
	private WebElement Password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Signin;
	
	
	public  CustomerLogInMagentoEcommerseSite(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterEmailAndPassword()
	{
		 Email.sendKeys("jayeshd@gmail.com");
		 Password.sendKeys("Abcd@9012");
		 Signin.click();
	}

}
