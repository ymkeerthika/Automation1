package day9;

public class HandlingExceptionWithFinally {

    public static void main(String[] args) {

       System.out.println("Starting");

       try{
           int x = 10;
           int c = 0;
           System.out.println(x/c);
       }finally {
           System.out.println("Closing DB");
       }



       System.out.println("Ending");

    }
}
