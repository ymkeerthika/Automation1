package LearningTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleAssertions {

WebDriver driver;

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Facebook","Title mismatch!");
        System.out.println("Closing Hard Assertion");

    }
    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title,"Facebook","Title mismatch!");
        System.out.println("Closing Soft Assertion");
        softAssert.assertAll();

    }
}
