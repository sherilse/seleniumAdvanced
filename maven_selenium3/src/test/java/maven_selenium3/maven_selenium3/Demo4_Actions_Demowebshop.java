package maven_selenium3.maven_selenium3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4_Actions_Demowebshop 
{
	WebDriver driver=null; 
  @Test
  public void f() throws InterruptedException 
  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.07\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "http://demowebshop.tricentis.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search =driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		Actions act1 = new Actions(driver);
		act1.sendKeys(search,"computer");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build().perform();
		Thread.sleep(1000);
		//Assert.assertTrue(driver.getTitle().startsWith("Build"));
  }
}
