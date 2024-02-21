package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToperformActiononAUTOSUGGESTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Esugesstion = "selenium python";
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
       
		
		List<WebElement> autosuggesstion = driver.findElements(By.xpath("//span[text() = 'selenium']"));
	          System.out.println("no of suggestion is"+autosuggesstion.size());   
		for(WebElement autos :autosuggesstion) {
         String	actualseggestion	=	autos.getText();
                         		
        if(actualseggestion.equals(Esugesstion)) {
        	autos.click();
        	
        }
		
		
		
		
		}
		
		
	}
}
