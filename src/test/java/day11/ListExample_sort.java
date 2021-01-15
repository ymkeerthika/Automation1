package day11;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListExample_sort {

    public static void main(String[] args) {



         ArrayList<String> li = new ArrayList<String>();
         li.add("Anusha");
         li.add("Apurva");
         li.add("Gyan");
         li.add("Pooja");
         li.add(0,"zakir");


        Collections.sort(li);

        for(String st: li){

            System.out.println(st);


         }


    }

}
