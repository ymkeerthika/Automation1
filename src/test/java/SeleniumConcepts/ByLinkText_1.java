package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByLinkText_1 extends LaunchingBrowser_new {

    @Test
    public void byName(){

        driver.get("https://www.google.com");
        driver.findElement(By.linkText("తెలుగు")).click();
        driver.findElement(By.name("q")).sendKeys("NEWS", Keys.ENTER);

}
}
