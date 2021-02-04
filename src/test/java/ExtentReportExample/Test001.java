package ExtentReportExample;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.model.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Test001 {


    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest extentTest;

WebDriver driver;

    @BeforeClass
    public void beforeTest(){

        htmlReporter = new ExtentHtmlReporter("./recordings/extent.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Automation Report 2021");
        htmlReporter.config().setReportName("Smoke Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();

        extent.setSystemInfo("Author","Arvind");
        extent.setSystemInfo("OS","Mac");
        extent.setSystemInfo("Browser","Chrome");
        extent.attachReporter(htmlReporter);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



    }


    @AfterClass
    public void tearDown(){
        driver.quit();
        extent.flush();
    }


    @Test
    public void tc01(){

        driver.get("https://www.amazon.com");
        extentTest = extent.createTest("Success Test");
        extentTest.log(Status.PASS,"Test Method sucessfull");


    }

    @Test
    public void tc02(){

        driver.get("https://www.Facebook.com");
        extentTest = extent.createTest("Fail Test");
        extentTest.log(Status.FAIL,"Test Method Fail");
        Assert.fail("Fail");


    }


    @Test
    public void tc03(){

        driver.get("https://www.google.com");
        extentTest = extent.createTest("Skip Test");
        extentTest.log(Status.SKIP,"Test Method SKIP");
        throw new SkipException("Skipping");


    }

}
