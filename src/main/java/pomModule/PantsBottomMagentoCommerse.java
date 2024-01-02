package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PantsBottomMagentoCommerse {
	
	/*@FindBy(xpath="(//div[@class=\"toolbar toolbar-products\"]//strong)[2]")
	private WebElement modelistbutton*/

	@FindBy(xpath="(//select[@id=\"sorter\"])[1]")
	private WebElement sortby;
	
	@FindBy(xpath="((//li[@class=\"item product product-item\"])[1]//span)[6]")
	private WebElement productprice;


	@FindBy(xpath="((//li[@class=\"item product product-item\"])[1]//span)[2]")
	private WebElement productselect;
	
	

	public PantsBottomMagentoCommerse(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*public void clickonmodelistbutton()
	{
		modelistbutton.click();
	}*/

	public void selectfromsortdropdown()
	{
		Select s = new Select(sortby);
		s.selectByValue("price");
	}
	
	public void verifyproductprice()
	{
		System.out.println(productprice.getText());
	}
	
	public void clickonproduct()
	{
		productselect.click();
	}


	
}
