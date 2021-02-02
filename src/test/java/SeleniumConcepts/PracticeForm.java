package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeForm extends LaunchingBrowser_new {

    @Test
    public void dropdown() throws InterruptedException {

        driver.get("https://demoqa.com/automation-practice-form");

       WebElement header=  driver.findElement(By.xpath("//div[@class='main-header']"));

       Genric.assertTitle(header,"Practice Form");
        Thread.sleep(2000);

       driver.findElement(By.id("firstName")).sendKeys("arvind");
        Thread.sleep(2000);

       driver.findElement(By.xpath("//label[text()='Male']")).click();


        Thread.sleep(2000);
       List<WebElement> cb = driver.findElements(By.cssSelector(".custom-control.custom-checkbox.custom-control-inline"));

       System.out.println("Count "+ cb.size());
       for(WebElement ele : cb){
           ele.click();
       }

       Thread.sleep(2000);

       driver.findElement(By.cssSelector("#uploadPicture")).sendKeys("/Users/aravindanathdm/Documents/JavaSeleniumDecJan2021/src/test/java/SeleniumConcepts/Topics");


    }
}
