package JavaFundamental.Coding;

/*
   input =  a@1b#2Ert@
   output = 1+2= 3
 */

public class Pattern3 {
    public static void main(String [] args){
        String s = "a@1b#2Ert@";

        System.out.println("The original value is :"+s);

        StringBuilder sep = new StringBuilder();

        int sum = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
               sum+=Character.getNumericValue(c);
            }
        }
        System.out.println("the sum is :"+sum);

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                sep.append(c);
            }
        }
        System.out.println("The only char is: "+sep.toString());

    }

}
