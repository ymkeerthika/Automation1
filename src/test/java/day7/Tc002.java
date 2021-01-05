package day7;

public class Tc002 extends BaseClass{

    public static void main(String[] args) throws InterruptedException {

        openBrowser("firefox");
        openUrl("https://www.google.com");
        Thread.sleep(3000);
        closeBrowser();

    }
}
