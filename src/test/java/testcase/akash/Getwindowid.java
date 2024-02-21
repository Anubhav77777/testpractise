package testcase.akash;


import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");	
//		System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        String Windowid = driver.getWindowHandle();
        System.out.println("windowid for google" +Windowid);
        driver.navigate().to("https://facebook.com");
        String Windowid2 = driver.getWindowHandle();
        System.out.println("Windowid2 for facebook " + Windowid2);

	}

}
