package day4;

import java.util.Scanner;

public class SwitchCaseExample_falthrough {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int day = sc.nextInt();

        switch (day){
            case 0:
                System.out.println("Sunday");

            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Fiday");

            case 6:
                System.out.println("Saturday");

            default:
                System.out.println("Enter correct number");

        }
        System.out.println("Out of case");
    }
}
