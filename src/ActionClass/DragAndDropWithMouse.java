package ActionClass;

import java.time.Duration;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropWithMouse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
WebElement	frame	=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		
WebElement	source	=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
WebElement	destination	=driver.findElement(By.id("trash"));
		
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(source, destination).perform();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
	String t =driver.findElement(By.cssSelector("li[id='menu-item-6898'] a")).getText();
		System.out.println(t);

	}

}
