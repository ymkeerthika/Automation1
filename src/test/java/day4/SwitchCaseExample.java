package day4;

import java.util.Scanner;

public class SwitchCaseExample {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int day = sc.nextInt();

        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fiday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter correct number");

        }
        System.out.println("Out of case");
    }
}
