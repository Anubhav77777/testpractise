package Sadar24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginhomepagebottom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS );
        driver.get("https://sadar24.com/");
        driver.findElement(By.xpath("//span[@class='nav-box-text d-none d-xl-block']")).click();
        driver.findElement(By.xpath("//a[@class='google']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anubhav@mindrops.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("anu@123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);
        WebElement cartpage = driver.findElement(By.xpath("//a[@class='btn btn-dark fw-600 w-100']"));       
        if(cartpage.isDisplayed()) 
        {
        	
        System.out.println("You are on the cart page");
        }
        else
        
        	
        System.out.println("You are not on  the cart page");
        	
        		
        cartpage.click();
        Thread.sleep(3000);
	        
       boolean selected = driver.findElement(By.xpath("//span[@class='aiz-rounded-check flex-shrink-0 mt-1'][1]")).isSelected();
       if(selected) 
       {
       driver.findElement(By.xpath("//button[@class='btn btn-sm text-right btn-dark s-check text-white custom-right-text medium w-auto float-right bef-pay-hide']")).click();
    	
       }
    	else
    	driver.findElement(By.id("coupon-apply")).click();	
			
       
       
       }
	
//in this we login through google sign cart has already item verify we are on cart page (for that cart must have item)
//	then click on proceed to buy check address is selected or not if not click on apply coupon 
 
	
	
	
	
	
	
	}
	    
