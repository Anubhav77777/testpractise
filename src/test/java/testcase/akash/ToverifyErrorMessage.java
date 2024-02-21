package testcase.akash;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      String  emessage = "Username or Password";
		driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.xpath("//a [@id='loginButton']")).click();
	   Thread.sleep(2000);
	 String amessage = driver.findElement(By.xpath("//span[@class='errormsg'][1]")).getText();
	 amessage += amessage + "ok";
      System.out.println(amessage);
      
	 if(amessage.contains(emessage)) {
		 System.out.println(" pass : The error message is verified ");
	 }
	 else {
		 System.out.println(" fail : The error message is not verified ");	 
    	  
      }
	 System.out.println(amessage);
	 System.out.println(emessage);
	
	 System.out.println(amessage.contains(emessage));
	
	}
}
	

