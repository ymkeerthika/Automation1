package day9;

public class CustomException {

    public static void main(String[] args) throws Exception {

        int amout = 99;

        if(amout >=100){
            System.out.println("Withdraw amount");
        }else {
                throw new Exception("Enter only >= 100 multiples");
        }

    }
}
