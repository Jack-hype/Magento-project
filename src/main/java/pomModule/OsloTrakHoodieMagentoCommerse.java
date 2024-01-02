package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OsloTrakHoodieMagentoCommerse {

	
	@FindBy(xpath="(//div[@class=\"swatch-option text\"])[4]")
	private WebElement Size;
	
	@FindBy(xpath="(//main[@id='maincontent']//div)[30]")
	private WebElement Colour;
	
	@FindBy(xpath="//input[@name='qty']")
	private WebElement QTY;
	
	
	@FindBy(xpath="//button[@title='Add to Cart']")
	private WebElement AddtoCart;
	
	@FindBy(xpath="//a[@class='action showcart']")
	private WebElement CartSymbol;
	
	@FindBy(xpath="//span[text()='See Details']")
	private WebElement Seedetail;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement Checkout;
	
	
	public OsloTrakHoodieMagentoCommerse(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void SelectSizeOfProduct()
	{
	Size.click();
	}
	
	public void SelectCOLOURofProduct()
	{
		Colour.click();
	}
	
	public void AddQTY()
	{
		QTY.sendKeys("5");
	}
	public void AddProductInCart()
	{
		AddtoCart.click();
		
	}
	
	
	public void SelectCartSymbol()
	{
		CartSymbol.click();
	}
	
	public void ClickOnSeeDetails()
	{
		Seedetail.click();
	}
	
	public void ProceedToCheckOut()
	{
		Checkout.click();
	}
}
