package day9;

import java.util.Scanner;

public class HandlingException {

    public static void main(String[] args) {

       System.out.println("Starting");

       try{
           int x = 10;
           int c = 0;
           System.out.println(x/c);
       }catch (Exception e){
           e.printStackTrace();
       }



       System.out.println("Ending");

    }
}
