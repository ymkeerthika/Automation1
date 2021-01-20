package LearningTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Start Capture reports Before suite");
    }


    @BeforeClass
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver  = new ChromeDriver();

    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("End Capture reports After suite");
    }
}
