package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCssStartsWith extends LaunchingBrowser_new {

    @Test
    public void byName(){

        driver.get("https://www.amazon.com/");
        /**
         * ^  --> startswith
         * TAGNAME[Atribure^='value']
  v
         */
        driver.findElement(By.cssSelector("input[id^='two']")).sendKeys("iphone 12", Keys.ENTER);

}
}
