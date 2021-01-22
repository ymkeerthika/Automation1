package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchingBrowser_new_gecko {

    WebDriver driver;
    @BeforeTest
    public void test(){                                                                     //chromedriver.exe
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }



    @Test
    public void test1(){
        driver.get("https://www.google.com");
    }
}
