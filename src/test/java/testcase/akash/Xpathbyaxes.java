package testcase.akash;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyaxes {

	public static void main(String[] args) {
	 String productname="APPLE iPhone 12 Pro Max (Silver, 512 GB)";
	 String productprice="1,49,900";
        System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.flipkart.com/search?q=apple+14+pro+max&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_8_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_8_na_na_na&as-pos=1&as-type=RECENT&suggestionId=apple+14+pro+max%7CMobiles&requestId=c41d03da-e3b4-4281-afdf-a1bd3af97f4f&as-backfill=on");
       String price = driver.findElement(By.xpath("//div[text() = '"+productname+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text() = '₹"+productprice+"']")).getText();

       System.out.println(price);
	}

}
