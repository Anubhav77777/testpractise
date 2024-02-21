package testcase.abc;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class Getsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
		
		Dimension dim= new Dimension(600,100);
		driver.manage().window().setSize(dim);
		
		
	}

}
