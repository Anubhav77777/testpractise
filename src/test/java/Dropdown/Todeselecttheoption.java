package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Todeselecttheoption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement element = driver.findElement(By.id("cars"));
		    
		  Select select = new Select(element);
		  select.selectByIndex(0);
		  Thread.sleep(2000);
		  select.selectByValue("audi");
		  Thread.sleep(2000);
          select.selectByVisibleText("Saab");
          Thread.sleep(2000);
          select.deselectAll();
          
          Thread.sleep(2000);
          select.selectByIndex(0);
		  Thread.sleep(2000);
		  select.selectByValue("audi");
		  Thread.sleep(2000);
          select.selectByVisibleText("Saab");
          
          Thread.sleep(2000);
          select.deselectByIndex(0);
          Thread.sleep(2000);
	      select.deselectByValue("audi");
	      Thread.sleep(2000);
	      select.deselectByVisibleText("Saab");
	
	
	
	
	
	}
	

}
