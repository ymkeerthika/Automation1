package LearningTestNG;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

        driver.findElement(By.name("q")).sendKeys("Selenium and Appium job openings in bangalore", Keys.ENTER);



    }



}
