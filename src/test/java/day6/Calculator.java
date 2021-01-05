package day6;

public class Calculator {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(33,2);
        cal.add(332,22,55);
        cal.studentDetails("Arvind","Blr");
        cal.add(33f,55f);



    }

    public void add(float x, float y){
        float z = x + y;
        System.out.println("Sum of two float numbers is "+ z);
    }

    // Method over loading no of parm / diff parm
    public void add(int x, int y){
        int z = x + y;
        System.out.println("Sum of two numbers is "+ z);
    }
    public void add(int x, int y, int r){
        int z = x + y + r;
        System.out.println("Sum of three numbers is "+ z);
    }

    public void studentDetails(String name, String city){
        System.out.println("Student name is "+ name);
        System.out.println("Student  is from "+ city);
    }

    public void studentDetails(String name, String city, int roll){
        System.out.println("Student name is "+ name);
        System.out.println("Student  is from "+ city);
        System.out.println("Student  roll number is "+ roll);
    }


}
