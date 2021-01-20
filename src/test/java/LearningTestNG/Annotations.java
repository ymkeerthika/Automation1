package LearningTestNG;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println(" ***** Before class *****");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("****** After class ********");
    }
    @BeforeTest
    public void openBroswer(){
        System.out.println("*** Before Test ***");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("#### Before method #####");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("==== After method =====");
    }

    @Test
    public void openUrl(){
        System.out.println("Open url");
    }


    @AfterTest
    public void closeBrowser(){
        System.out.println("**  After test **");
    }

}
