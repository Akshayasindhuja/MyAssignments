package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Justtryingloginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://accounts.google.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.close();
	}	
}