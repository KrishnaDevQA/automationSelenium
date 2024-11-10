package TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prescription1 {

    // Variables to avoid hardcoding
    private static final String URL = "https://dev.spiralshealth.com/";
    private static final String USER_TYPE = "Doctor";
    private static final String USER_EMAIL = "7895897606";
    private static final String USER_PASSWORD = "123";
    private static final String PATIENT_PHONE = "7238831610";
    private static final String MEDICINE_NAME = "Medicef (500mg) (BRD) (Suspension)";
    private static final String DOSE = "1-0-1";
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get(URL);

            login(driver);
            selectPatient(driver);
            fillPrescriptionDetails(driver);
        } finally {
            driver.quit(); // Ensure the browser closes at the end
        }
    }

    // Method for logging in
    private static void login(WebDriver driver) {
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

        // Select user type
        WebElement userTypeDropdown = driver.findElement(By.name("user_type_id"));
        Select select = new Select(userTypeDropdown);
        select.selectByVisibleText(USER_TYPE);

        // Enter login credentials
        driver.findElement(By.id("email")).sendKeys(USER_EMAIL);
        driver.findElement(By.name("password")).sendKeys(USER_PASSWORD);

        // Click the login button
        driver.findElement(By.id("loginBtn")).click();
    }

    // Method to search for and select a patient
    private static void selectPatient(WebDriver driver) {
        WebElement searchBox = driver.findElement(By.id("search_existing_patient"));
        searchBox.sendKeys(PATIENT_PHONE);

        // Wait for patient suggestions to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("suggestions")));

        // Click the first suggestion (you can change this as needed)
        List<WebElement> suggestions = driver.findElements(By.cssSelector("#suggestions ul li a"));
        if (!suggestions.isEmpty()) {
            suggestions.get(0).click();
        } else {
            System.out.println("No suggestions found.");
        }
    }

    // Method to fill in the prescription details
    private static void fillPrescriptionDetails(WebDriver driver) {
        // Fill in medical details
        driver.findElement(By.id("pt_complaint")).sendKeys("fever");
        driver.findElement(By.id("medical_advice")).sendKeys("Drink more water, eat green food");
        driver.findElement(By.id("special_notes")).sendKeys("fever is 110 degrees F, fatigue, tiredness");
        driver.findElement(By.id("diagnose_instructions")).sendKeys("malaria");

        // Search and select medicine
        WebElement medicineField = driver.findElement(By.id("medicine_field_id_1"));
        medicineField.sendKeys(MEDICINE_NAME);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#suggestions")));
        List<WebElement> medicineSuggestions = driver.findElements(By.cssSelector("#suggestions ul li a"));
        if (!medicineSuggestions.isEmpty()) {
            medicineSuggestions.get(0).click();
        } else {
            System.out.println("No medicine suggestions found.");
        }
         
        WebElement doseDropdown = driver.findElement(By.xpath("//select[@id='doses_id_1']"));
        
    

    }
}
