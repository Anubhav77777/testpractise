package Sadar24;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tohandledropdownhightolow {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");	
	                   ChromeDriver driver = new ChromeDriver();
	                   driver.manage().window().maximize();
	                   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	                   driver.get("https://sadar24.com/");
	                   driver.findElement(By.xpath("//a[@href='https://sadar24.com/mens'][1]")).click();
	                   Thread.sleep(9000);
	                  WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control form-control-sm aiz-selectpicker']"));
	                            Select select = new Select(dropdown);
//                                     boolean multiselect = select.isMultiple();
//                                     if(multiselect) {
//                                    	 System.out.println("multiselect");
//                                    	 
//                                     }
//                                     else
//                                    	 System.out.println(" no");

//	                            select.selectByVisibleText("Price high to low");
//	                            Thread.sleep(5000);
//	                            select.selectByValue("price-asc");
	      List<WebElement> alloption = select.getOptions();
	            System.out.println("total no of list" +alloption.size());
	for(WebElement option: alloption) {
	            
	       System.out.print(option.getText());
	      
	}
	      
	      
	      
	      
	      
	      
	      
	      
	                            
	}

}
