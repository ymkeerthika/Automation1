package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragNDrop extends LaunchingBrowser_new {


    @Test
    public void dragnDrop(){

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement src1 = driver.findElement(By.xpath("(//li[@id='fourth']/a)[1]"));
        WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

        Genric.dragNDrop(driver,src1,dest1);

    }
}
