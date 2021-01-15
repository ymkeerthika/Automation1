package day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeleniumWithList {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");

       List<WebElement> ele =  driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));

       ArrayList<String> lang = new ArrayList<>();

       System.out.println("Count of lang "+ ele.size());
       for(WebElement el : ele){
          // System.out.println(el.getText());
           lang.add(el.getText());
       }

        System.out.println("UnSorted lang: "+ lang);

        Collections.sort(lang);

        System.out.println("Sorted lang: "+ lang);



    }
}
