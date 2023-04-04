package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginpage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver login = new ChromeDriver();
		login.get("https://www.amazon.com/");
		login.manage().window().maximize();
		login.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		login.findElement(By.id("ap_email")).sendKeys("akshayasindhuja@gmail.com");
		login.findElement(By.id("continue")).click();
		login.findElement(By.name("password")).sendKeys("Sindhu!1810");
		login.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		login.close();
	}

}