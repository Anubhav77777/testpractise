package Sadar24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");
        
          ChromeDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
          driver.get("https://www.flipkart.com/");
         
          driver.switchTo().activeElement().sendKeys("ANUBHAV");
         
          driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
        
//        HIDDEN DIVISION POPUP 
        
        
        
        
        
        
        
        
	}

}
