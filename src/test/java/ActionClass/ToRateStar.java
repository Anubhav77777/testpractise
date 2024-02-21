package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToRateStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://amp.dev/documentation/examples/interactivity-dynamic-content/star_rating/?format=websites");


       WebElement star1 = driver.findElement(By.xpath("//input[@id='rating1']"));
       Actions action = new Actions(driver);
       action.moveToElement(star1,162,0).perform();

	}

}
