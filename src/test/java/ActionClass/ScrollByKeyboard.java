package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
//		driver.findElement(By.xpath(null)
                 Actions action = new Actions(driver);
//                 action.sendKeys(Keys.PAGE_DOWN).perform();
//                 action.sendKeys(Keys.PAGE_UP).perform();
                 action.sendKeys(Keys.ARROW_DOWN).perform();
//                 action.keyDown(Keys.CONTROL).perform(); this is for pressing the key hold until u give command to key up/ release.
	}
}
