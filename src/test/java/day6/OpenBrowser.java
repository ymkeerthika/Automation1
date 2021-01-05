package day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    static WebDriver driver;
    OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    public static void main(String[] args) {

        OpenBrowser op = new OpenBrowser();
        driver.findElement(By.name("q")).sendKeys("selenium jobs", Keys.ENTER);
    }
}
