package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebTable extends LaunchingBrowser_new {

    @Test
    public void dropdown() throws InterruptedException {

        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".button-1.login-button")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Catalog']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='menu-item-title' and text()='Products']")).click();

        WebElement searchCat = driver.findElement(By.xpath("//select[@id='SearchCategoryId']"));

        Genric.selectByvisibleText(searchCat,"Electronics >> Cell phones");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#search-products")).click();
        Thread.sleep(2000);
            String product ="HTC One Mini Blue";

        driver.findElement(By.xpath("(//table[@id='products-grid']/tbody/tr/td[3][contains(text(),'"+product+"')]//preceding-sibling::td)[1]")).click();

        Thread.sleep(2000);



        driver.findElement(By.xpath("//table[@id='products-grid']/tbody/tr/td[3][contains(text(),'"+product+"')]//following-sibling::td[6]/a")).click();

        Thread.sleep(2000);




    }
}
