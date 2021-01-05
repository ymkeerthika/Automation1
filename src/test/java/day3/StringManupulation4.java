package day3;

public class StringManupulation4 {

    public static void main(String[] args) {
                   //     {  0  } 8{1}8{2}
        String details = "Arvind8904483799";

        String name = details.split("8")[0];
        String mob = details.split("8")[1];

        System.out.println("Name "+ name );
        System.out.println("Mob "+ mob );
        System.out.println(details.split("8")[2]);

    }

}
