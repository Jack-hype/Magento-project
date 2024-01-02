package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HoodiesAndSweatshirtsTopsMenMagentoCommerse {
	
	@FindBy(xpath="(//a[@id='mode-list'])[1]")
    private WebElement ModeList;
	
	@FindBy(xpath="(//select[@id='sorter'])[1]")
    private WebElement ShortBy;
	
	@FindBy(xpath="((//div[@class='product-item-info'])[1]//span)[6]")
    private WebElement ProductPrice ;
	
	@FindBy(xpath="((//li[@class='item product product-item'])[1]//span)[2]")
    private WebElement ProductDetails;
	
	@FindBy(xpath="((//li[@class=\"item product product-item\"])[2]//div)[3]")
    private WebElement secondproductprice ;
	
	@FindBy(xpath="((//li[@class=\"item product product-item\"])[2]//span)[2]")
    private WebElement secondproductdetails;
	
	
	
	public  HoodiesAndSweatshirtsTopsMenMagentoCommerse(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnModeListSymbol()
	{
		ModeList.click();
	}
	
	public void SelectFromShortByDropdown()
	{
		Select s = new Select(ShortBy);
		s.selectByValue("price");
	}
	
	public void getProductPrice()
	{
		System.out.println(ProductPrice.getText());
		
	}
	public void clickonproduct()
	{
		ProductDetails.click();
	}
	
	public void getsecondproductprice()
	{
		System.out.println(secondproductprice.getText());
	}
	
	public void getsecondproductdetails()
	{
		secondproductdetails.click();
	}
	
	
}
