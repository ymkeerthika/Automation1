package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class LaunchingBrowser_new {

    WebDriver driver;
    @BeforeTest
    public void test(){                                                                     //chromedriver.exe
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }



    @Test
    public void test1(){
        driver.get("https://www.google.com");
    }
}
