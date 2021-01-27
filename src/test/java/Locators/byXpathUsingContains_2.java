package Locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class byXpathUsingContains_2 extends LaunchingBrowser_new{

    @Test
    public void xpath() throws InterruptedException {

        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
            ////a[contains(text(),'Create New')]
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        //*[@type='text' and @name ='firstname']
        //*[contains(@name ,'first')]

    }
}
