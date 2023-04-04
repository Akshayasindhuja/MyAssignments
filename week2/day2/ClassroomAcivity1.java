package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomAcivity1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver2 = new ChromeDriver();
driver2.get("https://login.salesforce.com");
driver2.manage().window().maximize();
driver2.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
driver2.findElement(By.id("password")).sendKeys("Leaf@123");
Thread.sleep(2000);
driver2.close();
	}

}
