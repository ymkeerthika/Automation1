package day4;

public class Conditions1 {


    public static void main(String[] args) {

        int age = 18;
        boolean reg = true;
        String nat = "indian";

        if(age >= 18 && reg == true && nat == "indian"){
            System.out.println("You can vote");
        }else{
            System.out.println("Reg for vote");
        }

        System.out.println("out of condition");
    }
}
