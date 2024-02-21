package testcase.akash;


import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class Getposition {

	public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
        Point pos = driver.manage().window().getPosition();
        System.out.println(pos);
         int startx = pos.getX();
         int starty = pos.getY();
         System.out.println("x cordinate is : " + startx);
         System.out.println("x cordinate is : " + starty);
	}

}
