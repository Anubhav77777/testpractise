package testcase.akash;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyindependentanddependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.flipkart.com/mobiles/~cs-6f6pseptap/pr?sid=tyy%2C4io&collection-tab-name=Samsung%20Galaxy%20F13&param=3098&otracker=clp_banner_1_10.banner.BANNER_mobile-phones-store_CSICJ2933X4T");
       String price = driver.findElement(By.xpath("//div[text() = 'SAMSUNG Galaxy F13 (Sunrise Copper, 64 GB)']/../..//div[text() = '₹11,999']")).getText();
       System.out.println(price);	
	}

}
