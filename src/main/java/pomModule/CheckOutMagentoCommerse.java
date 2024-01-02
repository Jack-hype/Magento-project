package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutMagentoCommerse {
	

	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement Firstname;

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Lastname;

	@FindBy(xpath="//input[@id='PAS1VMC']")
	private WebElement Street;

	@FindBy(xpath="//input[@id='T5GLOSX']")
	private WebElement City;

	@FindBy(xpath="//select[@id='DYV8PRQ']")
	private WebElement State;

	@FindBy(xpath="(//input[@type='text'])[9]")
	private WebElement ZipCode;

	@FindBy(xpath="(//select[@class=\"select\"])[2]")
	private WebElement Country;

	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement PhoneNumber;

	@FindBy(xpath="(//input[@type=\"radio\"])[1]")
	private WebElement ShippingMethod;

	@FindBy(xpath="//span[text()='Next']")
	private WebElement NextButton;
	
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement PlaceOrder;
	
	public CheckOutMagentoCommerse (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstname()
	{
		Firstname.sendKeys("jack");
	}
	
	public void enterlastname()
	{
		Lastname.sendKeys("patil");
	}
	
	public void enterStreetname()
	{
		Street.sendKeys("lanchdh");
	}
	
	public void enterCity()
	{
		City.sendKeys("Surat");
	}
	
	public void SelectState()
	{
		Select s1 = new Select(State);
	   s1.selectByVisibleText("Gujarat");
	}
	
	public void enterZipCode()
	{
		ZipCode.sendKeys("394210");
	}
	
	public void SelectCountry()
	{
		Select s2 = new Select(Country);
	    s2.selectByVisibleText("India");
	 }
	
	public void enterPhonenumber()
	{
		PhoneNumber.sendKeys("7405284954");
	}
	
	public void SelectShppingMethod()
	{
		ShippingMethod.click();
	}
	
	public void HitNextButton()
	{
		NextButton.click();
	}
	
	public void ClickOnPlaceOrderOption()
	{
		PlaceOrder.click();
	}
	
	
	
}
