package testcase.abc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Togetallwindowids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        Set<String> Allwindowids = driver.getWindowHandles();
        System.out.println("Allwindowids are"+Allwindowids);
	}

}
