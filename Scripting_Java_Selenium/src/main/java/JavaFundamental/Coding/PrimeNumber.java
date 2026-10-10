package JavaFundamental.Coding;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.close();
        Boolean isPrime = true; // assume the number is prime hence use boolean flag

        // cross check
        if(num<=1){
            isPrime=false;
        }

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime= false;
            }
        }

        if(isPrime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime");
        }
    }
}
