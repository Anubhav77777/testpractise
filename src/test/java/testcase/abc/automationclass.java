package testcase.abc;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedTitle = "google";
		//System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

}
