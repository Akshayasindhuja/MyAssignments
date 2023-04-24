package week2.day5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("akshaya");
		driver.findElement(By.name("lastname")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("akjdsfjdhd@gmj");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("aksjhd!234");
		
		WebElement findElement =driver.findElement(By.id("day"));
		Select date =new Select(findElement);
		date.selectByIndex(6);
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1990");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		Thread.sleep(5000);
		
		System.out.println("The Account created successfully");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
