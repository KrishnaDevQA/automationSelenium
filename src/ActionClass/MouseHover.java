package ActionClass;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		 WebElement kid = driver.findElement(By.linkText("KIDS"));
		 
		 Actions act= new Actions(driver);
		 
		// act.moveToElement(kid).perform();
		
		act.moveByOffset(438, 39).click().perform();
		

	}

}
