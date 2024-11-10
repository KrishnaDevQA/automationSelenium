package ActionClass;

import java.time.Duration;

import javax.swing.Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
		driver.manage().window().maximize();
		
	WebElement	Box =driver.findElement(By.xpath("//a[normalize-space()='Tutorial on Double Click']"));
	
		
		Actions act= new Actions(driver);
		//act.doubleClick(Box).perform();
		act.contextClick(Box).perform();
		
	   Thread.sleep(5000);

	}

}
