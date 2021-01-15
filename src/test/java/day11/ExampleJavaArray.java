package day11;

public class ExampleJavaArray {

    public static void main(String[] args) {

        String [] str = {"Krishna","Arvind","Teju","Satish","Zakir","Anusha"};
        //System.out.println(str[0]);

        System.out.println("COunt of array "+str.length);


        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }


        System.out.println("******* for each loop  ******");


        for(String st: str){
            System.out.println(st);
        }

    }
}
