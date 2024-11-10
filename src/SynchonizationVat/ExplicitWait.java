package SynchonizationVat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
        WebDriver driver= new ChromeDriver();
        
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));  //declaration
        
        driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2Fsighnup&source=header");
        driver.manage().window().maximize();
        
      WebElement textbox =driver.findElement(By.id("email"));
      
      mywait.until(ExpectedConditions.visibilityOf(textbox));
      
      textbox.sendKeys("krishnajs101@gmail.com");
      
     WebElement btn=driver.findElement(By.xpath("//button[@data-continue-to='password-container']"));
     mywait.until(ExpectedConditions.elementToBeClickable(btn));
     
     btn.click();        
       
	}

}
