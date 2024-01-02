package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StarkfundamentalhoodieMagentocommerse {
	
	@FindBy(xpath="(//div[@class=\"swatch-option text\"])[2]")
	private WebElement Size;
	
	@FindBy(xpath="(//div[@aria-labelledby=\"option-label-color-93\"]//div)[1]")
	private WebElement Colour;
	
	@FindBy(xpath="//input[@title='Qty']")
	private WebElement QTY;
	
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	private WebElement AddtoCart;
	
	@FindBy(xpath="//a[@class='action showcart']")
	private WebElement CartSymbol;
	
	@FindBy(xpath="//span[text()='See Details']")
	private WebElement Seedetail;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement Checkout;
	

	public StarkfundamentalhoodieMagentocommerse(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void SelectSizeOfProductsecond()
	{
	Size.click();
	}
	
	public void SelectCOLOURofProductsecond()
	{
		Colour.click();
	}
	
	public void AddQTYsecond()
	{
		QTY.sendKeys("5");
	}
	public void AddProductInCartsecond()
	{
		AddtoCart.click();
		
	}
	
	
	public void SelectCartSymbolsecond()
	{
		CartSymbol.click();
	}
	
	public void ClickOnSeeDetailssecond()
	{
		Seedetail.click();
	}
	
	public void ProceedToCheckOutsecond()
	{
		Checkout.click();
	}

}
