package basebrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	
	public static WebDriver openchrome()
	{
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\allbrowser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openfirefox()
	{
		System.setProperty("webdriver.gecko.driver","src\\main\\resources\\allbrowser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver openedge()
	{
		System.setProperty("webdriver.edge.driver","src\\main\\resources\\allbrowser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}

}
