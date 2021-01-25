package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ById extends LaunchingBrowser_new{

    @Test
    public void byID() throws InterruptedException {
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Think and grow rich book", Keys.ENTER);
        Thread.sleep(5000);
        WebElement search = driver.findElement(By.name("field-keywords"));
        search.clear();
        Thread.sleep(2000);
        search.sendKeys("Biomimicry: Innovation Inspired by Nature",Keys.ENTER);
         //Biomimicry: Innovation Inspired by Nature

    }

}
