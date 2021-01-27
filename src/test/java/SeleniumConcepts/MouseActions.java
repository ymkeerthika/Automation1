package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions  extends LaunchingBrowser_new {

    @Test
    public void mouseHover() throws InterruptedException {

        driver.get("https://www.myntra.com/");

        WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));

        Actions act = new Actions(driver);

        act.moveToElement(women).build().perform();

        Thread.sleep(2000);
        WebElement jumpsuit = driver.findElement(By.xpath("(//a[text()='Jackets'])[1]"));

        act.click(jumpsuit).build().perform();



    }
}
