package Assignment.Amitha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Set;

public class Product2 extends Generic1 {

    @Test
    public void Data1() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("iphone 12 mini phone 64gb blue", Keys.ENTER);

        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Apple iPhone 12 Mini (Blue, 64 GB)']")).click();


        Thread.sleep(3000);
        Set<String> win2 = driver.getWindowHandles();

        for(String str : win2){

            driver.switchTo().window(str);
        }

        String price2 = driver.findElement(By.xpath("(//div[text()='₹69,900'])[1]")).getText();

        System.out.println("Price of the Phone at Flipkart is "+price2);


    }

}
