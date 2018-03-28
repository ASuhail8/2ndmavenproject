package selenium;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test
public static void TestA() throws InterruptedException, IOException
{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://online.actitime.com/unisys/login.do");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('username').value='abc'");

}
	
}
