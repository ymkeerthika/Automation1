package LearningTestNG;

import org.testng.annotations.Test;

public class Test04 {


    @Test
    public void testone(){
        System.out.println("one");
    }


    @Test(dependsOnMethods = "testone")
    public void testTwo(){
        System.out.println("two");
    }


    @Test (dependsOnMethods = "testTwo")
    public void testThree(){
        System.out.println("three");
    }


    @Test
    public void testFour(){
        System.out.println("four");
    }


    @Test
    public void testFive(){
        System.out.println("five");
    }

}
