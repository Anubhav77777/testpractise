package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions action = new Actions(driver);
	action.contextClick(element).perform();
	 driver.findElement(By.xpath("//span[text()='Edit']")).click();
	
	
	
	
	}
	
	
	

}
