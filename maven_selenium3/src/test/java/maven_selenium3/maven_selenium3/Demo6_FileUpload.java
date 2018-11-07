package maven_selenium3.maven_selenium3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo6_FileUpload 
{
	WebDriver driver=null; 	
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.07\\Downloads\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/upload");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  WebElement Upload = driver.findElement(By.id("uploadfile_0"));
	  Upload.sendKeys("C:\\Users\\training_b6b.00.07\\Desktop\\screen.png");
	  driver.findElement(By.id("terms")).click();
	  driver.findElement(By.name("send")).click();
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
