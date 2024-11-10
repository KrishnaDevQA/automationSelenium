package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		 // Click on the "Iframe with in an Iframe" option on the page
		
        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
        
        // Switch to the first (outer) frame
        
        WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        
        driver.switchTo().frame(outerFrame);
        
        // Switch to the second (inner) frame inside the outer frame
        
        WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerFrame);
        
        // Send keys to the input field in the most inner frame
        
        WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
        inputField.sendKeys("Krishna");
		

	}

}
