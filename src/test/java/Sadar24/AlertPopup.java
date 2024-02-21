package Sadar24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");
	        
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        driver.findElement(By.xpath("//button[@name='alertbox']")).click();
         driver.switchTo().alert().accept();

	}

}
