package AlertsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopPup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert myalert=driver.switchTo().alert();
		
		Thread.sleep(2000);
		//handle alert with ok 
		myalert.accept();
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(2000);
		//handle with cancel button
		myalert.dismiss();
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		
		// handle with send keys and ok or cancel
		myalert.sendKeys("krishna");
		Thread.sleep(2000);
		myalert.accept();
	}

}
