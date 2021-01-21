package LearningTestNG;

import org.testng.annotations.Test;

public class Test03 {


    @Test(priority = 1)
    public void testone(){
        System.out.println("one");
    }


    @Test(priority = 3)
    public void testTwo(){
        System.out.println("two");
    }


    @Test(priority = 2)
    public void testThree(){
        System.out.println("three");
    }


    @Test(priority = 4)
    public void testFour(){
        System.out.println("four");
    }


    @Test
    public void testFive(){
        System.out.println("five");
    }

}
