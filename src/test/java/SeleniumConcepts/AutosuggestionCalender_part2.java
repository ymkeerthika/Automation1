package SeleniumConcepts;

import Locators.LaunchingBrowser_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AutosuggestionCalender_part2 extends LaunchingBrowser_new {


    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.redbus.in/");

        driver.findElement(By.id("src")).sendKeys("Bang");

        Thread.sleep(3000);
        List<WebElement> src = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));

        System.out.println("Total Pickup points: "+ src.size());

        for(WebElement ele : src){
            System.out.println(ele.getText());
            if(ele.getText().equalsIgnoreCase("White Field, Bangalore")){
                ele.click();
                break;
            }
        }

        driver.findElement(By.id("dest")).sendKeys("Hyd");

        Thread.sleep(3000);
        List<WebElement> dest = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));

        System.out.println("Total Drop points: "+ dest.size());

        for(WebElement ele : dest){
            System.out.println(ele.getText());
            if(ele.getText().equalsIgnoreCase("Uppal, Hyderabad")){
                ele.click();
                break;
            }
        }


        driver.findElement(By.id("onward_cal")).click();

        Thread.sleep(2000);
      List<WebElement> cal =  driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));

      for(WebElement ele : cal){

          if(ele.getText()!="Mar 2021"){
              driver.findElement(By.xpath("//button[text()='>']")).click();
              break;
          }

      }
        Thread.sleep(2000);
//        driver.findElement(By.id("onward_cal")).click();
        List<WebElement> cal2 =  driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));

        for(WebElement ele : cal2){

            if(ele.getText().equals("15")){
               ele.click();
                break;
            }

        }





    }

}
