package maven_selenium3.maven_selenium3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo5_Actions_DragandDrop 
{
	WebDriver driver=null; 	
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.07\\Downloads\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  WebElement from=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	  WebElement to=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_priceChecker\"]/div[1]"));
	  
	  Actions act1 = new Actions(driver);
	  act1.dragAndDrop(from, to).perform();
	  Thread.sleep(2000);
	  String price = driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker")).getText();
	  System.out.println(price);
	  
  }
}
