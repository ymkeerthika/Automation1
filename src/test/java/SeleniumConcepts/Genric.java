package SeleniumConcepts;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import sun.rmi.rmic.iiop.Generator;

import java.io.File;
import java.io.IOException;

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

    public  static void scrollInTOView(WebDriver driver,WebElement element){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }



    public static void selectByvisibleText(WebElement element, String text){

        Select sel= new Select(element);
        sel.selectByVisibleText(text);
    }


    public static void selectByvalue(WebElement element, String text){

        Select sel= new Select(element);
        sel.selectByValue(text);
    }

    public static void selectByindex(WebElement element, int index){

        Select sel= new Select(element);
        sel.selectByIndex(index);
    }


    public static void assertTitle(WebElement element, String text){
      String actualText=   element.getText();
        Assert.assertEquals(actualText,text,"Title mismatch");
    }

    public static void takeScreenShot(WebDriver driver) throws IOException {
        String path = System.getProperty("user.dir")+File.separator+"TestFiles"+File.separator+"Demo.png";
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File DestFile=new File(path);
//Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }

}
