package testcase.akash;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattribute {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");

	}

}
