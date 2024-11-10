package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FullPageScreenshot {

	public static void main(String[] args) throws IOException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
        
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("./Screenshot/FirstScreenshot.png");
		
		Files.copy(source, destination);
		
		
		//specific location screenshot
		
	    WebElement	btn=driver.findElement(By.xpath("//body/div[@class='jqm-demos ui-page ui-page-theme-a ui-page-footer-fixed ui-page-active']/div[@role='main']/form[1]/div[2]/a[1]"));
		
        File source1=btn.getScreenshotAs(OutputType.FILE);
		
		File destination1= new File("./Screenshot/SpecificScreenshot.png");
		
		Files.copy(source1, destination1);
		
		
		
	}

}
