package TestNG_Interview;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamerterExample2 {

    @Test(priority = -1)
    @Parameters({"val1","val2"})
    public void sum(int val1,int val2){
        int sum = val1 + val2;
        System.out.println("The result is :"+sum);
    }

    @Test (priority = 0)
    @Parameters({"val3","val4"})
    public void sum(float val3,int val4){
        int sum = (int)(val3 + val4); // casting float to int to avoid ambiguity
        System.out.println("The result is :"+sum);
    }


}
