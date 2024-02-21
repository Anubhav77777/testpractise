package testcase.akash;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
//              TakesScreenshot ts = (TakesScreenshot)driver;
//              File source = ts.getScreenshotAs(OutputType.FILE);
//              File destination = new File ("./errorshots/errorshots.png");              
//	                    FileUtils.copyFile(source, destination);
	                    
	   WebElement element = driver.findElement(By.xpath("//a[text() = 'Add Class']"));
   TakesScreenshot ts = (TakesScreenshot)driver;
	   File source =element.getScreenshotAs(OutputType.FILE);
	   File destination = new File (".\\errorshots\\elementerrorshots.png");
	   FileUtils.copyFile(source, destination);
	
	}
	
	

	
	}


