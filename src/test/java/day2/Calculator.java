package day2;

public class Calculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.addNumber(20,40,66);
        cal.addNumber(75,345,876);
        int value = cal.mulNumbers(40,44);
        int v1 = value /20;
        System.out.println(v1);
        double dec = v1/22.33;
        System.out.println(dec);


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



}
