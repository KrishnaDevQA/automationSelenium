package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import io.opentelemetry.sdk.internal.JavaVersionSpecific;

public class ClickOnDisableElementPassValue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationexercise.com/test_cases");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
         
		 Thread.sleep(4000);
		 
		 js.executeScript("window.scrollBy(0,800)", "");
		 Thread.sleep(4000);
		 
		 js.executeScript("window.scrollBy(0,-500)", "");
		 
		 // scroll the page till element is visible
	        
	     WebElement ele=driver.findElement(By.xpath("//u[contains(.,'Test Case 6: Contact Us Form')]"));
	        
	     js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}

}
