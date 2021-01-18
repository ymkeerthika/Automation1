package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ExampleSet2 {

    public static void main(String[] args) {


        ArrayList<String> st = new ArrayList<>();

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

//       Iterator it=  st.iterator();
//
//       while (it.hasNext()){
//           System.out.println(it.next());
//       }

        ListIterator li = st.listIterator();

        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("**********************");


        while (li.hasPrevious()){
            System.out.println(li.previous());
        }




    }

}
