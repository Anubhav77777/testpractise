package Sadar24;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
       driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
       driver.switchTo().alert().accept();
       
       
	
        
	
	} 
	

}
