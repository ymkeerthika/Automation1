package Locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class byXpathUsingContains extends LaunchingBrowser_new{

    @Test
    public void xpath() throws InterruptedException {

        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();


    }
}
