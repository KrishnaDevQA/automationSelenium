package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkedTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		WebElement home= driver.findElement(By.partialLinkText("Home"));
		
		
		System.out.println("it is the text of the link:"+home.getText());
		//home.click();
		
		System.out.println(home.isEnabled());  //true
	
		System.out.println(home.isDisplayed());  //true
		
		System.out.println(home.isSelected());  //false
		
		Thread.sleep(3000);
		
		System.out.println("attribute value:"+home.getAttribute("style"));
		
		System.out.println("CSS value:"+home.getCssValue("color"));
		
		
		
	
	}

}
