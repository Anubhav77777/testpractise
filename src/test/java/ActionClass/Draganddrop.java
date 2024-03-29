package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

       
	   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
       WebElement source = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
       WebElement Target = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
       Actions action = new Actions(driver);
       action.dragAndDrop(source,Target).perform();

	}

}
