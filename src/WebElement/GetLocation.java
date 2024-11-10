package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetLocation {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		// to find the location and size of search box with the help of getrect()

		WebElement search=driver.findElement(By.tagName("input"));
		
		Rectangle rec= search.getRect();
		
	    Dimension size= rec.getDimension();
	    
	    System.out.println(size);
	    
	    System.out.println("this is the hight of the box"+size.getHeight());
	    
	    System.out.println("this is the width of the box"+size.getWidth());
	  Point loc=rec.getPoint();
	    
	    System.out.println();
	    
	    System.out.println("this is the x distance of the box"+loc.getX());
	    System.out.println("this is the y distance of the box"+loc.getY());

	}

}
