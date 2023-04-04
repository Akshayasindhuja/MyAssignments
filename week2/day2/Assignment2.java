package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver web = new ChromeDriver();
		web.get("http://leaftaps.com/opentaps/control/login");
		web.manage().window().maximize();
		web.findElement(By.id("username")).sendKeys("DemoCsr");		
		web.findElement(By.id("password")).sendKeys("crmsfa"); 
		web.findElement(By.className("decorativeSubmit")).click();
		web.findElement(By.linkText("CRM/SFA")).click();
		web.findElement(By.linkText("Leads")).click();
		web.findElement(By.linkText("Create Lead")).click();
		web.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Org");
		web.findElement(By.id("createLeadForm_firstName")).sendKeys("Seetha");
		web.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiyagu");
		web.findElement(By.name("submitButton")).click();
		web.findElement(By.linkText("Edit")).click();
		WebElement update = web.findElement(By.id("updateLeadForm_companyName"));
		update.clear();
		update.sendKeys("Org Test Leaf");
		web.findElement(By.name("submitButton")).click();
		Thread.sleep(8000);
		web.close();
	}

}
