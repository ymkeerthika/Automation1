package SeleniumConcepts;

import Locators.LaunchingBrowser_new;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertHandling  extends LaunchingBrowser_new {


    @Test
    public void alertsHandling() throws InterruptedException {

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.id("login1")).sendKeys("Arvind");

        Thread.sleep(2000);

        driver.findElement(By.name("proceed")).click();
        Thread.sleep(2000);

         Alert alt =  driver.switchTo().alert();
         alt.accept();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#password")).sendKeys("passsword");



    }





}
