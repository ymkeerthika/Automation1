package day5;

public class Loops4 {

    public static void main(String[] args) {


//        String std1 = "Arvind";
//        String std2 = "Teju";

        String [] std = {"Arvind","Teju","Gyan","Pooja"};

        for(String sdref : std){
            if(sdref.equals("Teju")){
                System.out.println(sdref + " Match");
            }else {
                System.out.println(sdref + " Not Match");
            }

        }

    }
}
