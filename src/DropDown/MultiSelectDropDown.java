package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		 WebElement mltsct =driver.findElement(By.xpath("//select[@id='cars']"));
		 Select sct= new Select(mltsct);
		 
		 sct.selectByVisibleText("Volvo");
		 
		 sct.selectByVisibleText("Saab");
		 
		 sct.selectByVisibleText("Opel");
		 
	     sct.selectByVisibleText("Audi");
		 
		//  deselect method
		 
        sct.deselectByVisibleText("Volvo");
		 
		 sct.deselectByVisibleText("Saab");
		 
		 sct.deselectByVisibleText("Opel");
		 
		 sct.deselectByVisibleText("Audi");
		 
		 // deselet all
		 
		 sct.deselectAll();
		 
		 
		 sct.getFirstSelectedOption();
		 sct.getAllSelectedOptions();   
		 
		 
		 }

}
