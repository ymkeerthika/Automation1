package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Genric {


    public static void acceptAlert(WebDriver driver){
       Alert alt = driver.switchTo().alert();
       System.out.println("Alert Title "+ alt.getText());
       alt.accept();
    }


    public static  void dismissAlert(WebDriver driver){
       Alert  alt = driver.switchTo().alert();
        System.out.println("Alert Title "+ alt.getText());
       alt.dismiss();
    }

    public static void acceptAlertWithSendKeys(WebDriver driver,String text){
        Alert alt = driver.switchTo().alert();
        System.out.println("Alert Title "+ alt.getText());
        alt.sendKeys(text);
        alt.accept();
    }

    public static void mouseHover(WebDriver driver, WebElement element){
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public static void mouseClick(WebDriver driver, WebElement element){
        Actions act = new Actions(driver);
        act.click(element).build().perform();
    }

    public static void rightClick(WebDriver driver,WebElement element){
        Actions act = new Actions(driver);
        act.contextClick(element).build().perform();

    }

    public static void dragNDrop(WebDriver driver, WebElement src, WebElement dest){

        Actions act = new Actions(driver);
        act.dragAndDrop(src,dest).build().perform();

    }


}
