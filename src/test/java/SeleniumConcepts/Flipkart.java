package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Flipkart extends LaunchingBrowser_new_gecko {


    @Test
    public void text() throws InterruptedException {

        driver.get("https://www.flipkart.com");

        driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.name("q")).clear();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("books", Keys.ENTER);
    }
}
