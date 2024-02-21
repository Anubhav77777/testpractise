package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://github.com/signup?user_email=&source=form-home-signup");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anubhav@mindrops.com");
		WebElement element = driver.findElement(By.xpath("//button[@type='button'][1]"));
	//    WebDriverWait wait = new WebDriverWait(driver,20);
  //WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(element));
 // clickable.click();	
	
	
	
	}

}
//button[@type='button'][1]