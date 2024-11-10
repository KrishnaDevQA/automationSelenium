package TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoLogin {

    WebDriver driver;

    @Test(priority = 0)
    @Parameters("browser")
    public void setup(String browser) throws InterruptedException {
    	switch (browser.toLowerCase()) {
		case "chrome":driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		
		default : System.out.println("Invalid browser"); 
		
		return;
    	}
       
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Use explicit wait to ensure the URL loads
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://automationexercise.com/login"));
    }

    @Test(priority = 1)
    public void FullName() {
        driver.findElement(By.name("name")).sendKeys("rajesh yadav");
    }

    @Test(priority = 2)
    public void EnterEmail() {
        driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("rajeshyadav14112@gmail.com");
    }

    @Test(priority = 3)
    public void click_On_signup_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Signup']"))).click();

        // Verify the information
        String expected = "ENTER ACCOUNT INFORMATION";
        String actual = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();

        // Print both to debug
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        // Use a normal assertion
        Assert.assertEquals(actual, expected, "Text does not match!");
        System.out.println("Information is verified successfully");

        // Fill in additional information
        driver.findElement(By.id("first_name")).sendKeys("harry porter");
    }

    @AfterClass
    public void teardown() {
       
       
            driver.quit();
        }
    }

