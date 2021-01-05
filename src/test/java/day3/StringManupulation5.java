package day3;

import java.util.ArrayList;

public class StringManupulation5 {

    public static void main(String[] args) {


        String name = "Hi arvind good morning your OTP is 333333 from xxx888 666666";


        ArrayList<String> otp =  new ArrayList<String>();

        for(String str : name.split(" ")){
           // System.out.println(str);
            if(str.matches("\\d{6}")){
               System.out.println("OTP is "+ str);
                otp.add(str);
            }else if(str.matches("\\d{5}")){
                System.out.println("OTP is "+ str);
                otp.add(str);
            }
        }

        System.out.println("*******************");

        System.out.println(otp.get(1));


    }

}
