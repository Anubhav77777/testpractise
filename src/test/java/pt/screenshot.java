package pt;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
   Date currentdate = new Date(0);
  String  screenshotfilename = currentdate.toString().replace(" ", "-").replace(":","-");
     driver.get("https://jqueryui.com/draggable/");
     TakesScreenshot       ts = (TakesScreenshot)driver; 
        File Source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(".//errorshot//"+screenshotfilename+".png");
        FileUtils.copyFile(Source, destination);
        
	}

}
