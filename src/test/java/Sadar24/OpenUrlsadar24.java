package Sadar24;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlsadar24 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sadar24.com/");
		

	}

}
