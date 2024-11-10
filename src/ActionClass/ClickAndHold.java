 package ActionClass;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.howtocodeschool.com/2021/10/demo-of-simple-click-and-hold-effect.html");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		act.moveByOffset(138,288).clickAndHold().perform();
		Thread.sleep(5000);
		
		act.release().perform();
		

	}

}
