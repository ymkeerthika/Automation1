package day11;

import java.util.HashMap;
import java.util.Map;

public class MaPexample {


    public static void main(String[] args) {
///             KEY     VALUE
        HashMap<Integer, String> data = new HashMap<>();
        data.put(101, "Arvind");
        data.put(102,"Teju");
        data.put(103,"Satish");
        data.put(104,"ramya");

//        System.out.println(data.get(104));

        for(Map.Entry<Integer, String> e : data.entrySet()){

            System.out.println(e.getKey() +"---> "+ e.getValue());

            System.out.println(e);
        }
    }
}
