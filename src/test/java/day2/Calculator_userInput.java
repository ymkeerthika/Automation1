package day2;


import java.util.Scanner;

public class Calculator_userInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator_userInput cal = new Calculator_userInput();
        System.out.println("Enter 1st Number: ");
        int v1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int v2 = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int v3 = sc.nextInt();

        cal.addNumber(v1,v2,v3);
        int val =cal.mulNumbers(v3,v1);
        System.out.println("Mul "+ val);
        cal.addNumber(val,v3,v1);

        System.out.println(cal.div(v1,v2));


    }
//Access mofifier, return type, method name(parm)
    public void addNumber(int i, int x,int y){
        int sum = i + x +y;
        System.out.println("Addition of two numbers:"+ sum);
    }

    public int mulNumbers(int x , int y){
        int mul = x*y;
        return mul;
    }

    public int div(int x, int y){
        int d = x/y;
        return d;
    }


}
