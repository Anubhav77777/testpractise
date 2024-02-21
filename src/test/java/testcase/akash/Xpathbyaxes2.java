package testcase.akash;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyaxes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://sadar24.com/product/the-mini-needle-womens-fashion-wild-wide-waistband-synthetic-elastic-stretch-buckle-band-black-elasticbow015");
	//	String Price = driver.findElement(By.xpath("//h1[@class='mb-0 fs-18 fw-600 d-flex text-justify']//ancestor::div[@class='col-xl-6 col-lg-6 px-0 px-md-auto product_details_page']//descendant::span[text()='₹199.00']").getText();
		//System.out.println(Price);
	}

}
