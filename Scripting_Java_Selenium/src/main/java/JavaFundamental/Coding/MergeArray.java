package JavaFundamental.Coding;

import org.apache.groovy.util.Arrays;

public class MergeArray {
    public static void main(String []  args){
        int [] num1 = {1,2,3,4};
        int [] num2 = {2,3,4,5};
        int result [] = new int[num1.length];

        for(int i=0;i<num1.length;i++){
            result[i] = num1[i] + num2[i];

        }

        System.out.println("the result is :"+result);
    }
}
