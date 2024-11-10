package ActionClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		String parentid = driver.getWindowHandle();
		
		Actions act= new Actions(driver);
		
		WebElement t =driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']"));
		
		t.getText();
		System.out.println(t);
		
		act.keyDown(Keys.CONTROL).perform();
	    t.click();
		
		act.keyUp(Keys.CONTROL).perform();
	     t.click();


       Set<String>allid=driver.getWindowHandles();
        
        
		for(String ids:allid) {
			
        	if(!ids.equalsIgnoreCase(parentid)) {
        		driver.switchTo().window(ids);
        		Thread.sleep(2000);
        		driver.close();
        	}
        }
	}
}

