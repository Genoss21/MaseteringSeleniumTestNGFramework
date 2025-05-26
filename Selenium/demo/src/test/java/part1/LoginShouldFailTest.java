package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginShouldFailTest {

    WebDriver driver;

    @BeforeClass //Is a setup code
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass 
    public void tearDown(){
        // driver.quit(); 
        //closses every window and quit the driver and this is the standard in selenium
        // driver.close();
    }

   @Test // Marks this method as a test case for the testing framework (e.g., JUnit or TestNG)
    public void testLoggingIntoApplication() throws InterruptedException{

        Thread.sleep(2000);

        // Step 1: Locate the username input field on the page
        // This uses the Selenium method findElement with the By.name locator strategy to find an element with name="username"
        WebElement username = driver.findElement(By.name("username"));

        // Step 2: Enter the username into the input field
        // The sendKeys() method simulates typing text into the element
        username.sendKeys("Admin");

        // Step 3: Locate the password input field
        // Again using By.name locator strategy to find name="password"
        var password = driver.findElement(By.name("password"));

        // Step 4: Enter the password into the input field
        password.sendKeys("admin123");

        // Step 5: Locate the login button and click it
        // Finds the first <button> tag on the page and simulates a click
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);

        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        Assert.assertNotEquals(actualResult, expectedResult);
    }
}
