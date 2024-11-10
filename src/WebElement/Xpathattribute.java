package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathattribute {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/signup?");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // implicit
		
        driver.manage().window().maximize();
        
       WebElement field=driver.findElement(By.xpath("//input[@id='email']"));
        
       
	   field.sendKeys("krishnajs101@gmail.com");
	   field.clear();
	   field.sendKeys("golu");
	
        
        
        driver.findElement(By.xpath("//button[@data-continue-to='password-container']")).click();
        
	}

}
