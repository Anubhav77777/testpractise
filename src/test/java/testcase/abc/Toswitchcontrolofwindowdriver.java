package testcase.abc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Toswitchcontrolofwindowdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        String Parentwindowid = driver.getWindowHandle();
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        Set<String> Allwindowid = driver.getWindowHandles();
        for(String id:Allwindowid) {
        driver.switchTo().window(id);
        if(!id.equals(Parentwindowid)) {
        	driver.findElement(By.linkText("Try Free")).click();
        	break;
        }
        }
        driver.switchTo().window(Parentwindowid);
        driver.findElement(By.id("keepLoggedInCheckBox")).click();
        
	}

}
