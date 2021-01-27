package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import com.google.gson.Gson;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandling2  extends LaunchingBrowser_new {

    @Test
    public void alertPart2() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        Genric.acceptAlert(driver);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        Thread.sleep(2000);
        Genric.dismissAlert(driver);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Thread.sleep(2000);
        Genric.acceptAlertWithSendKeys(driver,"Hello good morning");

        String value = driver.findElement(By.cssSelector("#result")).getText();

        System.out.println(value);

        Assert.assertEquals(value,"You entered: Hello all");




    }


}
