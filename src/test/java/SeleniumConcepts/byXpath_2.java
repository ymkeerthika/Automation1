package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class byXpath_2 extends LaunchingBrowser_new{

    @Test
    public void xpath(){

        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//input[@type='text' and @name='email' or @id='emai'] ")).sendKeys("Arvind", Keys.ENTER);
        /*
          //TAGNAME[@Atribute ='value']
          //TAGNAME[@Atribute ='value' and @attribute = value]
          //TAGNAME[@Atribute ='value' or @attribute = value]
         */

    }
}
