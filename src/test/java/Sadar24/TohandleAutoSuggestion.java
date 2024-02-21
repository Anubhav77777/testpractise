package Sadar24;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//        System.setProperty("WebDriver.driver.ChromeDriver","/");
        System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
      driver.get("https://sadar24.com/");
      
      driver.findElement(By.xpath("//input[@placeholder='Search in Sadar24.com...'][1]")).sendKeys("mens");
      Thread.sleep(10000);
      List<WebElement> autosuggestion = driver.findElements(By.xpath("//input[@placeholder='Search in Sadar24.com...'][1]"));
           
      System.out.println("auto suggestion is" +autosuggestion.size());          
          
              for(WebElement sugesstion :autosuggestion) {              
              
              System.out.println( sugesstion.getText()); 
          }
        
        
        
        
        
        
              
        
	}

}
