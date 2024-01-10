package assertionspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertionDemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String expectedLink = "Customer Serv";
		
		SoftAssert soft = new SoftAssert();
		//soft.assertEquals(actualLink, expectedLink);
		soft.assertTrue(actualLink.equals(expectedLink), "Both links are not equal...");
		
		soft.assertTrue(false, "err1");
		
		soft.assertTrue(false, "err2");
		
		soft.assertTrue(true, "err3");
		
		soft.assertTrue(false, "err4");
		
		driver.findElement(By.linkText("Customer Service")).click();
		
		soft.assertAll();
	}

}
