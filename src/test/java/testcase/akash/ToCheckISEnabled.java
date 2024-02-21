package testcase.akash;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckISEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
boolean enabled = driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled();
if(enabled) {
System.out.println("PASS:The Element is enabled");

}
else 
	System.out.println("Fail:The Element is disabled");	
}


}
