package JavaFundamental.Coding;
import java.util.Random;
public class OTP {
    public static void main(String [] args){
        String Otp = "";
        Random r = new Random();
        for(int i=0;i<=4;i++){
            int digit= r.nextInt(10); // random number 0-9
            Otp+=digit;
        }
        System.out.println("the 4 digit random number is :"+Otp);
    }

}
