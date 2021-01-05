package day7;

public class DemoAccessPart1 {

    // Default global varibale
    String name = "Arvind";
    protected String city = "Bangalore";
    public String state = "Karnataka";
    private String country = "india";

    public static void main(String[] args) {

        DemoAccessPart1 ref = new DemoAccessPart1();
        ref.publicMethod();
        ref.privateMethod();
        ref.protectedMethod();
        ref.defaultMethod();

        System.out.println(ref.city);
        System.out.println(ref.name);
        System.out.println(ref.state);
        System.out.println(ref.country);
    }


// Methods

    public void publicMethod(){
        System.out.println("Public method");
    }

    private void privateMethod(){
        System.out.println("Private method");
    }

       void defaultMethod(){
        System.out.println("Default  method");
    }


    protected void protectedMethod(){
        System.out.println("Protected method");
    }
}
