package Assignment.Amitha;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Set;

public class Tripadvisor {
WebDriver driver;
   @BeforeMethod

    public void LaunchBrr()
   {
       WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();
   }



    @Test

    public void Learning() throws InterruptedException {
        driver.get("https://www.tripadvisor.in/");

        driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("CLUB MAHINDRA", Keys.ENTER);
        driver.findElement(By.xpath("//span[text()='Club Mahindra Madikeri, Coorg']")).click();
        Thread.sleep(3000);
        Set<String> win2 = driver.getWindowHandles();

        for(String str : win2){
            System.out.println("Window ids: "+ str);
            driver.switchTo().window(str);
        }

        WebElement reviews= driver.findElement(By.cssSelector("._11J3kRI9"));


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",reviews);

        Thread.sleep(6000);
        //reviews.click();
        driver.findElement(By.xpath("(//*[text()='Write a review'])[2]")).click();

        Set<String> win3 = driver.getWindowHandles();

        for(String str2 : win3){
            System.out.println("Window ids: "+ str2);
            driver.switchTo().window(str2);
        }
        driver.findElement(By.cssSelector("#bubble_rating")).click();
        driver.findElement(By.xpath("//input[@id='ReviewTitle']")).sendKeys("Good Experiance");
        //textarea[@id='ReviewText']
        driver.findElement(By.xpath("//textarea[@id='ReviewText']")).sendKeys("Good Hospitality, Good Food, Clean rooms......................................." +
                "........................" +
                "..............................................................fdgdflgldfglfdlgdflg" +
                "hgfjhgdhgdfjghdfgjdfkljgkldfjgkljdfkgjf" +
                "ghdfjghdfjgdfgjffsdgfsdghfdghfdghfdhgfdgdfghdfghfdghdfghdfghfdhgdfhghdfghfhhgf");
        //div[text()='Family']
        driver.findElement(By.xpath("//div[text()='Family']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#trip_date_month_year")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//option[@value='1,2021']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@class='checkbox ']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@id='SUBMIT']")).click();

        Thread.sleep(2000);

   }




    @AfterMethod
    public void CloseBrr() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
