package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlaunching {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
