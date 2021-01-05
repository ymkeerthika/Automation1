package day7;

public class DemoAccessPart2 {

    public static void main(String[] args) {
        DemoAccessPart1 demo = new DemoAccessPart1();
        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
        System.out.println(demo.city);
        System.out.println(demo.name);
        System.out.println(demo.state);
    }


}
