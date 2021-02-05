package Assignment.Amitha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Product1 extends Generic1 {
    @Test
    public void Url() {
        driver.get("https://www.amazon.in/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone 12 mini phone 64gb blue", Keys.ENTER);
//driver.findElement(By.cssSelector(".ic-btn")).click();
        String price1 = driver.findElement(By.cssSelector(".a-price-whole")).getText();
        System.out.println("Price of the phone at Amazon is " + price1);
    }
}
