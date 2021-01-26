package SeleniumConcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpath_Preceeding extends LaunchingBrowser_new{

    @Test
    public void xpath(){

        driver.get("https://the-internet.herokuapp.com/tables");

      String txt =  driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[contains(text(),'Tim')]//preceding-sibling::td")).getText();

        System.out.println(txt);
    }
}
