package day8;

public interface I_Mobile {

    // abstract methods
    abstract void camera();
    void battery();
    void network();

    default void flashLight(){
        System.out.println("Flash light");
    }

}
