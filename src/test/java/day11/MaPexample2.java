package day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class MaPexample2 {


    public static void main(String[] args) {
///             KEY     VALUE
        HashMap<String, String> data = new HashMap<>();
        data.put("url", "https://www.google.com");
        data.put("search","Selenium jobs in Hyd");
        data.put("browser","chrome");


        WebDriver driver = null;
        if(data.get("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(data.get("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.get(data.get("url"));
        driver.findElement(By.name("q")).sendKeys(data.get("search"), Keys.ENTER);

        }
    }

