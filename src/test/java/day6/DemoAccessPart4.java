package day6;


import day7.DemoAccessPart1;

public class DemoAccessPart4 extends DemoAccessPart1{

    public static void main(String[] args) {

        DemoAccessPart4 demo = new DemoAccessPart4();
        demo.protectedMethod();
        demo.publicMethod();
        demo.childmethod();
        System.out.println(demo.city);
        System.out.println(demo.state);

    }

    public void childmethod(){
        System.out.println("child method");
    }

}
