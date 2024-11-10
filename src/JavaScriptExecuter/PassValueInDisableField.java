package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassValueInDisableField {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		
		WebElement text=driver.findElement(By.linkText("Home"));
	    
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		
		//jsExecutor.executeScript("arguments[0].value='krishna jaiswal'", text);
		
		jsExecutor.executeScript("arguments[0].click()", text);
	}

}
