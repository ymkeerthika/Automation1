package day8;

public class Android extends Mobile implements I_Mobile,NetworkProvider{

    public static void main(String[] args) {

        Android ad = new Android();
        ad.scroll();
        ad.swipe();
        ad.tap();
        ad.click();
        ad._2G();
        ad._3G();

    }


    void swipe() {
        System.out.println("Android Swipe");
    }


    void scroll() {
        System.out.println("Android Scroll");
    }


    void tap() {
        System.out.println("Android Tap");
    }

    public void camera() {
        System.out.println("Android camera");
    }

    public void battery() {
        System.out.println("Android battery");
    }

    public void network() {
        System.out.println("Android Network");
    }

    @Override
    public void _3G() {
        System.out.println("3G");
    }

    @Override
    public void _5G() {
        System.out.println("5G");
    }

    @Override
    public void _4G() {
        System.out.println("4G");
    }

    @Override
    public void _2G() {
        System.out.println("2G");
    }
}
