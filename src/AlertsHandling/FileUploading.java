package AlertsHandling;

import java.io.IOException;
import java.sql.ResultSetMetaData;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) throws IOException {
		
        WebDriver driver=new ChromeDriver();		
		
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'container')]/div[contains(@class,'content')]/div[contains(@class,'right-container')]/div[contains(@class,'right-pane')]/div[contains(@class,'registerWrapper')]/div[contains(@class,'formWrapper')]/form[contains(@name,'register')]/div[contains(@class,'formElems')]/div[contains(@class,'formField userType')]/div[contains(@class,'radioWrap')]/div[1]")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']")).click();
		
		Runtime.getRuntime().exec("./autoIt/resume.exe");
		
		
		
	}

}
