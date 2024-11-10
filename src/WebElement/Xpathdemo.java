package WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) throws InterruptedException {
		 // xpath by attribute
		
WebDriver driver= new ChromeDriver();
		
        driver.get("https://www.myntra.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        
    
       WebElement searchbox=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
       searchbox.sendKeys("T-shirt");
       
       Thread.sleep(3000);
       
       searchbox.sendKeys(Keys.ENTER);
       
       driver.findElement(By.xpath("//span[normalize-space()='Bag']")).click();
       
       driver.findElement(By.xpath("//div[contains(@class,'button-base-textTransform')]")).click();
       
       driver.findElement(By.xpath("//a[@class='wishlistLogin-button']")).click();


        
        
       

       
	}

}
