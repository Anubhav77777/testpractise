package Javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeystoDisabledelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement disabled = driver.findElement(By.xpath(" //input[@class='form-control']"));
                   JavascriptExecutor js = ((JavascriptExecutor )driver);
                   js.executeScript("arguments[0].value ='anubhav'",disabled);
                   
	

	}

}
