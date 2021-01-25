package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByClassName extends LaunchingBrowser_new {

    @Test
    public void byName(){

        driver.get("https://www.icicibank.com/");
        driver.findElement(By.className("ic-btn")).click();

}
}
