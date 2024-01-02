package pomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MithraWarmupPant {
	
	@FindBy(xpath="((//div[@aria-required='true'])//div)[1]")
	private WebElement pantsize ;
	

	@FindBy(xpath="((//div[@aria-required='true'])//div)[7]")
	private WebElement pantcolour ;
	

	@FindBy(xpath="//input[@id='qty']")
	private WebElement QTY  ;
	

	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	private WebElement addtocart  ;
	

	@FindBy(xpath="//a[@class='action showcart']")
	private WebElement cartsymbol ;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement proceedtocheckout ;
	 private WebDriver driver;
	
	public MithraWarmupPant(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void SelectSizeOfPant()
	{
	    pantsize.click();
	}
	
	public void SelectCOLOURofPant()
	{
	     pantcolour.click();
	}
	
	public void AddQTYofPant()
	{
		QTY.sendKeys("6");
	}
	
	public void AddProductInCart()
	{
		addtocart.click();
	}
	
	public void SelectCartSymbol()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(cartsymbol));
		cartsymbol.click();
	}
	
	public void ProceedToCheckOut()
	{
		proceedtocheckout.click();
    }
	
}
