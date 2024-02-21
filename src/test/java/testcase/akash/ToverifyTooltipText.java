package testcase.akash;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyTooltipText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	                   String expectedtooltiptext = "Do not select if this computer is shared";	
		driver.get("https://demo.actitime.com/login.do");
   String actualtexttooltip = driver.findElement(By.xpath("	//div[@id='keepMeLoggedInCaptionContainer']")).getAttribute("title");
   System.out.println(actualtexttooltip);
	if(actualtexttooltip.equals(expectedtooltiptext)) {
		System.out.println("Pass:+tooltip is verified");
	}
	else
		System.out.println("fail:+tooltip is not verified");
	
	
	
	
	
	
	
}	
}
	


