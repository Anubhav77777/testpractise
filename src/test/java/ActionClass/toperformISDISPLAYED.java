package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toperformISDISPLAYED {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://github.com/signup?user_email=&source=form-home-signup");
		Thread.sleep(5000);
		boolean bollean = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
     if(bollean) {
    	 System.out.println("pass : search bar is displayed");
     }
    	 else 
    		 System.out.println("fail : search bar is not displayed");	
     }
	

}

