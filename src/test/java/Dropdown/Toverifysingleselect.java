package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Toverifysingleselect {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
//		
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
       Select Select = new Select(element);
		 boolean  multiselect =  Select.isMultiple();
if(multiselect) {
	System.out.println("Pass:the drop down is multiselect");
}
else
	System.out.println(" Fail: the drop down is not multiselect");

}
	}


