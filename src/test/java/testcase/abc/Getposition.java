package testcase.abc;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
        Point pos = driver.manage().window().getPosition();
        System.out.println(pos);
         int startx = pos.getX();
         int starty = pos.getY();
         System.out.println("x cordinate is : " + startx);
         System.out.println("x cordinate is : " + startx);
	}

}
