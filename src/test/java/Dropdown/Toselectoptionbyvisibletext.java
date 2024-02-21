package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Toselectoptionbyvisibletext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
	WebElement element = driver.findElement(By.id("oldSelectMenu"));
                      Select select = new Select(element);
                      select.selectByVisibleText("White");   
                      Thread.sleep(2000);   
                      select.selectByValue("1");
                      Thread.sleep(2000);  
                      select.selectByIndex(8);
                      
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         

	}

}



