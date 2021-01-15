package day11;


import java.util.*;

public class ListExample {

    public static void main(String[] args) {



         ArrayList<String> li = new ArrayList<String>();
         li.add("Anusha");
         li.add("Apurva");
         li.add("Gyan");
         li.add("Pooja");
         li.add(0,"Arvind");

         System.out.println(li.get(3));

         System.out.println(li.size());

         for(int i=0; i<li.size();i++){
             System.out.println(li.get(i));
         }

         System.out.println("************");

         for(String st : li){
             if(st.equals("Arvind")){
                 System.out.println("Found");
             }else{
                 System.out.println("Not match");
             }
          //   System.out.println(st);
         }


    }

}
