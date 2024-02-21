package testcase.akash;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowid2 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://toplad.in/");
        Thread.sleep(5000);
        String PWindowid = driver.getWindowHandle();
        System.out.println("Windowid2 for toplad " + PWindowid);
        driver.findElement(By.xpath("//a[text()='Learn more about CMA ']")).click();
        String Windowid3 = driver.getWindowHandle();
        System.out.println("Windowid3 for jobs " + Windowid3);
        Set<String> Allwindowid = driver.getWindowHandles();
        for(String id:Allwindowid) {
            driver.switchTo().window(id);
        if(!id.equals(PWindowid)) {
        	driver.findElement(By.xpath("(//a[text()='Jobs'])[2]")).click();
        	break;

        }
        }
        driver.switchTo().window(PWindowid);
//        driver.findElement(By.id("keepLoggedInCheckBox")).click();
        driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]")).click();
	}
	

}
		
	