package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByName extends LaunchingBrowser_new {

    @Test
    public void byName(){

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium Appium Jobs in Bangalore", Keys.ENTER);

}
}
