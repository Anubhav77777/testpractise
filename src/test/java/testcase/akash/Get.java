package testcase.akash;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://toplad.in/");

        driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[2]")).click();  
	}     
	

}
