package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=Cj0KCQiAsdKbBhDHARIsANJ6-jfZ-knO1wxcZAPfuFEm-1FlKpJlYFbX_DS6F7P9wvErcvuaWUVPruMaAgxjEALw_wcB");
				WebElement element = driver.findElement(By.xpath("//a[@href='/shop/kids'][1]"));
	            Actions action = new Actions(driver);
	            action.moveToElement(element, 1041, 180).click().perform();

	}

}
