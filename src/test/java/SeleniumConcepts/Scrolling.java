package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scrolling extends LaunchingBrowser_new {

    @Test
    public void scrollExaple() throws InterruptedException {

        driver.get("https://www.amazon.com");

       WebElement baclToP=  driver.findElement(By.xpath("//span[text()='Back to top']"));

       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView();",baclToP);

       Thread.sleep(6000);
       baclToP.click();

    }
}
