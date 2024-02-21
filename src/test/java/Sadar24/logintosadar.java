package Sadar24;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;



public class logintosadar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
        driver.get("https://sadar24.com/");
        driver.findElement(By.xpath("//span[@class='nav-box-text d-none d-xl-block']")).click();
        driver.findElement(By.xpath("//a[@class='google']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anubhav@mindrops.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("anu@123456");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
       String title = driver.getTitle();
        System.out.println(title);
        
	}

}
