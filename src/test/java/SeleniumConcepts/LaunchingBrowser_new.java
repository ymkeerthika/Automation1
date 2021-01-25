package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class LaunchingBrowser_new {

    protected WebDriver driver;
    @BeforeClass
    public void test() throws InterruptedException {
        //chromedriver.exe
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(ops);
    }



//    @Test
//    public void test1(){
//        driver.get("https://www.google.com");
//    }


    @AfterClass
    public void closeBro() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
