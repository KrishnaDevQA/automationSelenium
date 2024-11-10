package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
        WebElement drop	=driver.findElement(By.tagName("select"));
        
        Select sct= new Select(drop);
        System.out.println(sct.isMultiple());
        
     // select option from the drop down
        
			sct.selectByIndex(2);
     		Thread.sleep(4000);
     		
     		sct.selectByValue("AZE");
     		Thread.sleep(4000);
     		
     		sct.selectByVisibleText("Bhutan");
     		Thread.sleep(4000);

     		
     		List<WebElement> options=sct.getOptions();
    		
   		 System.out.println("Total no of option in drop down box: "+options.size());

           //Each for loop
		 
		 for(WebElement op:options)
		 {
			System.out.println(op.getText());
		 }
		
	}

}
