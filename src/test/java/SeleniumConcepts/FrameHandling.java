package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class FrameHandling extends LaunchingBrowser_new {

    @Test
    public void test1() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.javadoc.io/static/org.seleniumhq.selenium/selenium-api/2.50.1/index.html?org/openqa/selenium/package-summary.html");

        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("Alert")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("classFrame");
        driver.findElement(By.partialLinkText("accept")).click();




    }
}
