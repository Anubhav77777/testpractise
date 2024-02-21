package testcase.akash;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tocopytextandpastethenenter {

//	private static final CharSequence A = null;
//	private static final CharSequence C = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://demo.actitime.com/login.do");
		WebElement elementusername = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement elementpassword  =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("trainee");
		elementusername.sendKeys(Keys.CONTROL,"A");
		elementusername.sendKeys(Keys.CONTROL,"C");
		elementpassword.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);
		elementpassword.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
//        driver.findElement(By.xpath("//div[text()='Login ']")).click();		
//		elementpassword.sendKeys(Keys.ENTER);
	}

}
