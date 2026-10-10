package JavaFundamental.Coding;

public class MissingArray {
    public static void main(String [ ] args){
        int [ ] num ={1,2,3,5};
        int n = num.length+1;
        int expectedsum = n*(n+1)/2; // Formula
        int actualsum = 0;
        for(int i = 0; i < num.length; i++){
            actualsum+=num[i];
        }
        int missingNumber  = expectedsum - actualsum;
        System.out.println("The missing Number is :"+missingNumber);
    }
}



