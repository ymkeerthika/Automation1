package LearningTestNG;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test01 extends BaseTest{



    @BeforeMethod
    public void openUrl(){
        driver.get("https://www.google.com");


    }

    @Test
    public void testCase01()  {
        Reporter.log("Current URL "+driver.getCurrentUrl());
        String search = "Selenium and Appium job openings in bangalore";
        driver.findElement(By.name("q")).sendKeys(search, Keys.ENTER);

        Reporter.log("Current Page Title "+driver.getTitle());

        Reporter.log("user is searching "+ search);

    }



}
