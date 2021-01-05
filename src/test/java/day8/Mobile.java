package day8;

public abstract class Mobile {

    // non Abstract method
    public void click(){
        System.out.println("CLick");
    }

    // Un implemented methods
    abstract void swipe();
    abstract void scroll();
    abstract void tap();
}
