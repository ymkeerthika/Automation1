package day9;

public class Exceptions {


    public static void main(String[] args) {

System.out.println("Starting");

        try {
            String  i ="Ten";
            int z = 1;
            int x = Integer.parseInt(i);
            int sum = z+x;


        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Ending");
    }

}
