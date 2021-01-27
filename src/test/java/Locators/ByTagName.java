package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagName {

    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headless");
        driver = new ChromeDriver(ops);
    }


    @Test
    public void byTag(){
        driver.get("https://www.amazon.com");
       List<WebElement> links = driver.findElements(By.tagName("a"));

       System.out.println("Total Count "+ links.size());
       for(WebElement ele : links){
           System.out.println(ele.getText()+" ---> "+ele.getAttribute("href"));
       }


    }

}
