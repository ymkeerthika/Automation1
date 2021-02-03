package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;

public class TakingScreenShot extends LaunchingBrowser_new {


    @Test
    public void dragnDrop() throws IOException {

        driver.get("https://www.expedia.co.in/");

       driver.findElement(By.xpath("//span[text()='Flights']")).click();

       driver.findElement(By.xpath("//span[text()='One-way']")).click();

       driver.findElement(By.xpath("//button[@aria-label='Leaving from']")).click();

       driver.findElement(By.cssSelector(("#location-field-leg1-origin"))).sendKeys("Bengaluru (BLR - Kempegowda Intl.)", Keys.ENTER);

       driver.findElement(By.xpath("//button[@aria-label='Going to']")).click();

       driver.findElement(By.cssSelector("#location-field-leg1-destination")).sendKeys("London (LON - All Airports)",Keys.ENTER);

       driver.findElement(By.xpath("//button[text()='Search']")).click();

      WebElement select =  driver.findElement(By.xpath("(//button[@data-test-id='select-button'])[1]"));

        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(select));
        select.click();

        Genric.takeScreenShot(driver);


        //https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver

    }
}
