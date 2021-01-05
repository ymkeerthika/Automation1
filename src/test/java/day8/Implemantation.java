package day8;

public class Implemantation {


    public static void main(String[] args) {

        RBI rbi;

        rbi = new Axis();
        System.out.println("Axis bank int rate is "+ rbi.getInterest());

        rbi = new HDFC();
        System.out.println("HDFC bank int rate is "+ rbi.getInterest());

        rbi = new SBi();
        System.out.println("SBI bank int rate is "+ rbi.getInterest());





    }
}
