package day1;

public class LogicalOperators {

    public static void main(String[] args) {

        int i =10;
        int z = 20;
        int x =49;

        System.out.println(i<z);
        System.out.println(i>z);
        System.out.println(i<=z);
        System.out.println(i>=z);

        System.out.println(i<z && x>z); // and true & true = true / true & false = false
        System.out.println(i>z || x>z);// or  true or true = true / true or false = true

        System.out.println(10!=20); // Not
        System.out.println(10==20);
        System.out.println("Arvind"=="arvind");

    }
}
