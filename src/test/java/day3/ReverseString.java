package day3;

import java.util.regex.Pattern;

public class ReverseString {


    public static void main(String[] args) {

        String msg = "Hello all Good morining";

        Pattern pattern  = Pattern.compile("\\s");
        String [] temp = pattern.split(msg);
        String result ="";

        for(int i=0;i<temp.length; i++){
            if(i==temp.length-1){
                result = temp[i]+result;
            }else{
                result = " "+ temp[i] + result;
            }
        }
        System.out.println(msg);
        System.out.println(result);

    }
}
