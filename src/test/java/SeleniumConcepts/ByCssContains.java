package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCssContains extends LaunchingBrowser_new {

    @Test
    public void byName(){

        driver.get("https://www.amazon.com/");
        /**
         * $  --> endsswith
         * TAGNAME[Atribure$='value']
  v
         */
        driver.findElement(By.cssSelector("input[id*='box']")).sendKeys("iphone 12 pro max", Keys.ENTER);

}
}
