package day3;

public class StringManupulation1 {

    public static void main(String[] args) {


        String name = " Arvind Bangaglore ";

        System.out.println("Total count is "+name.length());
        System.out.println("Total count with out space: "+ name.trim().length());
        System.out.println("To upper "+ name.toUpperCase());
        System.out.println("To Lower "+ name.toLowerCase());
        System.out.println("Replace "+ name.replace(" ","_"));
        System.out.println("Replace "+ name.trim().replace(" ","_"));


    }

}
