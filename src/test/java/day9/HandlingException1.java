package day9;

public class HandlingException1 {

    public static void main(String[] args) {

       System.out.println("Starting");

       try{
           String name = null ;

           System.out.println(name.length());

           int x = 10;
           int c = 0;
           System.out.println(x/c);
       }catch (ArithmeticException e){
           e.printStackTrace();
       }catch (NullPointerException n){
           n.printStackTrace();
       }catch (NumberFormatException nf){
           nf.printStackTrace();
       }



       System.out.println("Ending");

    }
}
