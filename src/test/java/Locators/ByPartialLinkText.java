package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByPartialLinkText extends LaunchingBrowser_new {

    @Test
    public void byName() throws InterruptedException {

        driver.get("https://www.google.com");
        driver.findElement(By.partialLinkText("Ima")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Bangalore city", Keys.ENTER);

}
}
