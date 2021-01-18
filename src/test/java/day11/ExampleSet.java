package day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleSet {

    public static void main(String[] args) {


        HashSet<String> st = new HashSet<>();

        st.add("Pallavi");
        st.add("Gyan");
        st.add("Teju");
        st.add("Pallavi");
        st.add("Anusha");
        st.add("Apurva");
        st.add("Arvind");
        st.add("Pooja");
//
//        for(String std : st){
//            System.out.println(std);
//        }
//

       Iterator it=  st.iterator();

       while (it.hasNext()){
           System.out.println(it.next());
       }





    }

}
