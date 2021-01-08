package day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ReadingURLFromFileSelenium {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(Genric.getValue("url"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try{
            driver.findElement(By.xpath("(//a[@class='close'])[1]")).click();
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.linkText("CORPORATE")).click();

        driver.quit();

    }

}
