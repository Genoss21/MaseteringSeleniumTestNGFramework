package part3_4.com.demoqa.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.base.BasePage;
import com.demoqa.pages.HomePage;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

import java.io.File;
import java.io.IOException;


public class BaseTest {

    //variables
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage(); //Instance 
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir")
            + "/resources/screenshots/(" + java.time.LocalDate.now() + testResult.getName() + ".png"); 
            try {
                 FileHandler.copy(source, destination);
            } catch (IOException e) { 
                // TODO: handle exception
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located at: " + destination);
        }
    }

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }
}
