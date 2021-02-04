package Assignment.pooja;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hw1 {
    WebDriver driver;

    @BeforeTest
    public void openbrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void closebrowser() throws InterruptedException {
        driver.quit();
        Thread.sleep(5000);
    }
    //'^' symbol, represents the starting text in a string.

    @Test
    public void test(){
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input[class^='gLFyf']")).sendKeys("Pune City", Keys.ENTER);
    }
//'$' symbol represents the ending text in a string.
    @Test
    public void byhw1(){
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input[class$='gsfi']")).sendKeys("Mumbai City", Keys.ENTER);
    }
    //'*' symbol represents contains text in a string.
    @Test
    public void byhw2(){
        driver.get("https://login.yahoo.com/?.src=fpctx&.intl=in&.lang=en-IN&.done=https://in.yahoo.com&pspid=97684142");
        driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("Pooja", Keys.ENTER);
    }
}
