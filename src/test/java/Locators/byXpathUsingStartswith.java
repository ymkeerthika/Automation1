package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class byXpathUsingStartswith extends LaunchingBrowser_new{

    @Test
    public void xpath() throws InterruptedException {

        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@class,'gLFyf')]")).sendKeys("Todays weather in bangalore", Keys.ENTER);


    }
}
