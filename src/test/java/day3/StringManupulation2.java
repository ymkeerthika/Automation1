package day3;

public class StringManupulation2 {

    public static void main(String[] args) {

                //    0123456789
        String name = " Arvind Bangaglore ";

        System.out.println("IS empty? "+ name.isEmpty() );
        System.out.println(name.charAt(1));
        System.out.println(name.toLowerCase().replace("a","@"));

//        System.out.println(10==20);
//        System.out.println("Arvind"=="arvind");
        String n1 = "Arvind";
        String n2 = "arvind";
        System.out.println("is equal? "+n1.equals("Arvind"));

        System.out.println(n1+"---"+n1.hashCode());
        System.out.println(n2+"---"+n2.hashCode());

        System.out.println("equalsIgnoreCase "+n1.equalsIgnoreCase(n2));

    }

}
