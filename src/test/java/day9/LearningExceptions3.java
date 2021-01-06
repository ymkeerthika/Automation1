package day9;

public class LearningExceptions3 {

    /**
     * Author: Arvind
     * THis class is an example for NUmberFormatException.
     * @param args
     */
    public static void main(String[] args) {

        String[] name = new String[4];
        name[0]="Arvind";
        name[1]="Srini";
        name[2]="neha";
        name[3]="pooja";
        name[4]="Kumar";

        //DataType refVar : ArrayName
        for(String str : name){
            System.out.println(str);
        }

        System.out.println("Hello");


    }
}
