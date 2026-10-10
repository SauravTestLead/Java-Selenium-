package TestNG_Interview;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = -1)
    public void test1(){
        System.out.println("Hello");
    }

    @Test(priority = 0)
    public void test2(){
        System.out.println("welcome");
    }
}
