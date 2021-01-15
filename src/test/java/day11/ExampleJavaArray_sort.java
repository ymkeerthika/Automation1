package day11;

import java.util.Arrays;

public class ExampleJavaArray_sort {

    public static void main(String[] args) {

    //    String [] str = {"Krishna","Arvind","Teju","Satish","Zakir","Anusha"};
        //System.out.println(str[0]);
        Object [] str = {22,455,44,53,353};
        Object []obj = new Object[3];
        obj[0]=2345;
        obj[1]="asdf";


        for (Object dt : str){System.out.println(dt);
        }
        Arrays.sort(str);

        System.out.println("**************");
        for (Object dt : str){System.out.println(dt);
        }



    }
}
