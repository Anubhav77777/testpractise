package testcase.abc;

import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class Getwindowid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        String Windowid = driver.getWindowHandle();
        System.out.println("windowid for google" +Windowid);
        driver.navigate().to("https://facebook.com");
        String Windowid2 = driver.getWindowHandle();
        System.out.println("Windowid2 for facebook " + Windowid2);

	}

}
