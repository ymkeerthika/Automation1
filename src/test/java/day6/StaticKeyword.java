package day6;

public class StaticKeyword {

    String city = "hyd"; // non static Global variable
    static String country = "India";

    public void studentCity(String name){
        int roll = 543; // Local variable
        System.out.println("Student name is "+ name);
        System.out.println("Student is from "+ city);
    }

    public void demo(){
        System.out.println("I am from "+ city);
    }


    public static void main(String[] args) {
        StaticKeyword sk = new StaticKeyword();
        sk.studentCity("Arvind");
        sk.demo();

        System.out.println(sk.city);
        System.out.println(country);
        statMethod();

    }

    public  static  void statMethod(){
        System.out.println("I am static method!");
    }


}
