package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownExample  extends LaunchingBrowser_new {

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

        Select sel = new Select(searchCat);

        sel.selectByVisibleText("Electronics >> Cell phones");

        Thread.sleep(2000);

        sel.selectByValue("12");

        Thread.sleep(2000);

        sel.selectByIndex(4);

        Thread.sleep(2000);


        searchCat.sendKeys("Books");







    }
}
