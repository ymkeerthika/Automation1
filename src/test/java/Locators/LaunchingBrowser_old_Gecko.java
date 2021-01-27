package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class LaunchingBrowser_old_Gecko {

    WebDriver driver;
    @BeforeTest
    public void test(){                                                                     //chromedriver.exe
        String path =  System.getProperty("user.dir")+ File.separator+"drivers"+File.separator+"geckodriver";
        System.setProperty("webdriver.gecko.driver",path);
        driver = new FirefoxDriver();
    }



    @Test
    public void test1(){
        driver.get("https://www.google.com");
    }
}
