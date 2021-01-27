package Locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AbsXpath extends LaunchingBrowser_new {


    ///html/body/div[3]/div[2]/form/div[2]/div/div/div/div[2]/input
    @Test
    public void absXpath(){
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[2]/div/div/div/div[2]/input")).sendKeys("selenium jobs");
    }

}
