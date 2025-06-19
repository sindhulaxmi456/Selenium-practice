import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Set path to your local ChromeDriver
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhargav Naidu/OneDrive/Documents/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the local HTML form file (update the path below!)
        driver.get("file:///C:/Users/Bhargav Naidu/OneDrive/Desktop/Sindhu/form.html");

        // Fill First Name
        driver.findElement(By.id("firstname")).sendKeys("Sindhu");

        // Fill Last Name
        driver.findElement(By.id("lastname")).sendKeys("Korupolu");

        // Fill Date of Birth
        driver.findElement(By.id("dob")).sendKeys("28-03-1999");  // Format: yyyy-MM-dd

        // Fill Email
        driver.findElement(By.id("email")).sendKeys("sindhumerapala@gmail.com");

        // Select Gender
        driver.findElement(By.id("female")).click();

        // Select Skills
        driver.findElement(By.id("java")).click();
        driver.findElement(By.id("selenium")).click();

        // Select Country
        driver.findElement(By.id("country")).sendKeys("India");

        // Submit the form
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Confirmation
        System.out.println("Form submitted successfully!");

        // Close browser
        //driver.quit();
    }
}
