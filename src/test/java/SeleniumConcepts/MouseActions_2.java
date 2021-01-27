package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import com.google.gson.Gson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions_2 extends LaunchingBrowser_new {

    @Test
    public void mouseHover() throws InterruptedException {

        driver.get("https://www.myntra.com/");

        WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));

        Genric.mouseHover(driver,women);

        Thread.sleep(2000);
        WebElement jumpsuit = driver.findElement(By.xpath("(//a[text()='Shrugs'])[1]"));
//            jumpsuit.click();
        Thread.sleep(2000);
//        Genric.mouseHover(driver,jumpsuit);
        Genric.mouseClick(driver,jumpsuit);





    }
}
