package day6;

public class Car {

   public Car(){
        System.out.println("I am default constructor");
    }
   protected Car(int cc, String model){
        System.out.println("Car cc is "+ cc);
        System.out.println("Car model is "+ model);

    }

    public static void main(String[] args) {
            new Car(10,"Hyudai"); // Class object
            Car c =new Car();
            c.carDeatils();
//            c.carDeatils();
    }


    public void carDeatils(){
       System.out.println("I am method");
    }


}
