package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandling  extends LaunchingBrowser_new {

    @Test
    public void test1() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
        String win1 = driver.getWindowHandle();
        System.out.println("First window "+ win1);
        System.out.println("Title "+ driver.getTitle());
        driver.findElement(By.xpath("(//a[@title='Create an account'])[1]")).click();

        Set<String> wins = driver.getWindowHandles();

        for(String st : wins){
            System.out.println("Window ids: "+ st);
            driver.switchTo().window(st);
        }

        System.out.println("Title "+ driver.getTitle());
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Arvind");
        Thread.sleep(5000);

        driver.close();

        driver.switchTo().window(win1);
        System.out.println("Title "+ driver.getTitle());

        driver.close();

    }
}
