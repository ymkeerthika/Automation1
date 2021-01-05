package day4;

public class Condition3 {

    public static void main(String[] args) {

        String browser = "opera";

        if(browser.equals( "firefox")){
            System.out.println("Firefox browser is opening");
        }else if(browser.equals( "chrome")) {
            System.out.println("Chrome browser is opening");
        }else if(browser.equals( "IE")) {
            System.out.println("IE browser is opening");
        }else{
            System.out.println("Enter correct browser name");
        }
        System.out.println("Out of condition");
    }
}
