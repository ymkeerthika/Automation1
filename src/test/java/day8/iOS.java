package day8;

public class iOS  extends Mobile implements I_Mobile,NetworkProvider{


    public static void main(String[] args) {

        iOS ios = new iOS();
        ios.scroll();
        ios.swipe();
        ios.tap();
        ios.click();
    }

    void swipe() {
       System.out.println("iOS SWIPE");
    }

    void scroll() {
        System.out.println("iOS Scroll");
    }

    void tap() {
        System.out.println("iOS tap");
    }

    public void camera() {

    }

    public void battery() {

    }

    public void network() {

    }

    public void _3G() {

    }

    public void _5G() {

    }

    public void _4G() {

    }

    public void _2G() {

    }
}
