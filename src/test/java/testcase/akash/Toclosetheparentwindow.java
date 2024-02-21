package testcase.akash;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toclosetheparentwindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(5000);
		driver.close();
	

	}

}
