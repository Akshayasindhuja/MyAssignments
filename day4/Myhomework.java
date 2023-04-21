package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myhomework {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	driver.findElement(By.id("username")).sendKeys("Akshayasindhuja");
	driver.findElement(By.id("label2")).sendKeys("Sindhu!1810");
	driver.findElement(By.name("loginCaptchaValue")).sendKeys("refreshImgCaptcha");
	driver.findElement(By.id("Button2")).click();
	}
}
