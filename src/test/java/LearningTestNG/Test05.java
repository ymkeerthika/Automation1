package LearningTestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test05 {


    @Test(enabled = false)
    public void testone(){
        System.out.println("one");
    }


    @Test
    public void testTwo(){
        System.out.println("two");
    }


    @Test
    public void testThree(){
        System.out.println("three");
    }


    @Test
    public void testFour(){
        boolean skp = true;
        if (skp == true)
            throw new SkipException("skipping the case ");
        System.out.println("four");
    }


    @Test
    public void testFive(){
        System.out.println("five");
    }

}
