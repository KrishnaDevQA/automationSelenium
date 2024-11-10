package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInGoogle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
        
       /*
        WebElement searchbox = driver.findElement(By.id("APjFqb"));
        
        searchbox.sendKeys("Rg kar medical college");
        Thread.sleep(2000);
        searchbox.sendKeys(Keys.ENTER);
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("dimg_1")).click();*/
		
		WebElement link =driver.findElement(By.linkText("हिन्दी"));
		System.out.println("text======:"+link.getText());
		
		System.out.println("tagname======:"+link.getTagName());
		
		link.click();
		
		
	}

}
