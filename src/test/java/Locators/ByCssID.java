package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCssID extends LaunchingBrowser_new {


    @Test
    public void byID(){

        driver.get("https://www.amazon.in");
        /**
         * # --> Represents ID
         *
         * //input[@id='twotabsearchtextbox']
         * twotabsearchtextbox
         * #twotabsearchtextbox
         */

        driver.findElement(By.cssSelector("#twotabsearchtextbox"))
                .sendKeys("Todays deal", Keys.ENTER);


    }
}
