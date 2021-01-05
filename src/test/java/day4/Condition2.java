package day4;

import java.util.Scanner;

public class Condition2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your percentage: ");
        float marks = sc.nextFloat();


        if(marks<35){
            System.out.println("FAIL");
        } else  if(marks>=35 && marks <45){
            System.out.println("PASS CLASS");
        }else  if(marks>=45 && marks <60){
            System.out.println("Second CLASS");
        }else  if(marks>=60 && marks <75){
            System.out.println("First CLASS");
        }else  if(marks>=75 && marks <=100){
            System.out.println("Top CLASS");
        }else{
            System.out.println("Contact Admin");
        }


        System.out.println("OUT OF CONDITION");


    }


}
