package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;



public class byXpath  extends LaunchingBrowser_new{

    @Test
    public void xpath(){

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Republic day", Keys.ENTER);
        /*
          //TAGNAME[@Atribute ='value']
          //TAGNAME[@Atribute ='value' and @attribute = value]
          //TAGNAME[@Atribute ='value' or @attribute = value]
         */

    }
}
