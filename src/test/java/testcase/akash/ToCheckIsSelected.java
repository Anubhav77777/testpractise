package testcase.akash;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckIsSelected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
boolean selected = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).isSelected();
if(selected) {
System.out.println("PASS:The Element is selected");

}
else 
	System.out.println("Fail:The Element is not selected");	
}



	}


