package testcase.akash;


import org.openqa.selenium.chrome.ChromeDriver;

public class TitleofURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com"); 
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.contains("Google")) {
			System.out.println("Pass ; The Title is verified");
		}
		else
			System.out.println("Fail ; The Title is not verified");
	
	}

}
