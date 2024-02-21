package testcase.akash;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toplad {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		
	}

}
