package Sadar24;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/upload");
       driver.findElement(By.xpath("//input[@name='file']")).click();
           Runtime.getRuntime().exec("./Autoit/upload.exe");
      

	}

}
