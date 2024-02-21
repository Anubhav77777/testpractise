package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotselectTAG {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement element = driver.findElement(By.xpath("//div[@class=' css-2b097c-container'][1]"));
	                Actions action = new Actions(driver);
	                action.click(element).sendKeys("Gropu1,option1").perform();
Thread.sleep(2000);	                
	                action.click(element).sendKeys("Group2,option2").perform();

	}

}
