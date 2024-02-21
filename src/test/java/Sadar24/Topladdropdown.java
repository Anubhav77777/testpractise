package Sadar24;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Topladdropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
       driver.get("https://toplad.in/scholarship");
    WebElement dropdown = driver.findElement(By.id("course_type"));
    Select s = new Select(dropdown);
                  List<WebElement> alloptons = s.getOptions();
                      System.out.println(alloptons.size());
    for(WebElement options:alloptons) {
             
    	System.out.println( options.getText());
    
    }
    
//    s.selectByValue("2");
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
