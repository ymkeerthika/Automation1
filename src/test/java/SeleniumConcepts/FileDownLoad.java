package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileDownLoad extends LaunchingBrowser_new {


    @Test
    public void dragnDrop(){

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("hello_world.txt")).click();

    }
}
