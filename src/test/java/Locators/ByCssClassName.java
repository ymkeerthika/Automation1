package Locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCssClassName extends LaunchingBrowser_new {

    @Test
    public void byName(){

        driver.get("https://www.icicibank.com/");
        /**
         * .ic-btn --> class name
         * //*[@class='ic-btn']
         * ic-btn
         */
        driver.findElement(By.cssSelector(".ic-btn")).click();

}
}
