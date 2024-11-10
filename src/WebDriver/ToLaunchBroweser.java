package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchBroweser {

	public static void main(String[] args) {
		// TO launch webbrowser
        WebDriver driver=new EdgeDriver();
        
        // To fetch website
        driver.get("https://www.flipkart.com/");
        
        //to get title of website
        System.out.println("the title of selenium is " + driver.getTitle());
        
        //to fetch the url of the website
        System.out.println("the url of flipkart is "+ driver.getCurrentUrl());
        
        // to fetch the source code
        System.out.println(driver.getPageSource());
        
        //to fetch the window id
        System.out.println("the window id is "+ driver.getWindowHandle());
        
        //the close method
        driver.close();
        
        // quit method
        driver.quit();
        
	}

}
