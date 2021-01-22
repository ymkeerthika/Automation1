package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class LaunchingBrowser_old {

    WebDriver driver;

    @BeforeTest
    public void test() {
        String env = "mac";
        //chromedriver.exe
        if (env.equalsIgnoreCase("win")) {
            String path = System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", path);
            driver = new ChromeDriver();
        } else if (env.equalsIgnoreCase("mac")) {
            String path = System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver";
            System.setProperty("webdriver.chrome.driver", path);
            driver = new ChromeDriver();
        }
    }


    @Test
    public void test1() {
        driver.get("https://www.google.com");
        driver.quit();
    }
}
