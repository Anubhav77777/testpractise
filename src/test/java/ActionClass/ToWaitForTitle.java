package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWaitForTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	     String Titlebeforelogin = driver.getTitle();
	      System.out.println("Titlebeforelogin is"      + Titlebeforelogin);
          driver.findElement(By.id("username")).sendKeys("admin");
          WebElement element = driver.findElement(By.name("pwd"));
                     element.sendKeys("manager");
	                 element.sendKeys(Keys.ENTER); 
	                            

	       //  WebDriverWait wait = new WebDriverWait(driver,20);
	         //wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
	         String Titleafterlogin = driver.getTitle();
	         System.out.println("Title after login is "+Titleafterlogin);
	         
	}

}
