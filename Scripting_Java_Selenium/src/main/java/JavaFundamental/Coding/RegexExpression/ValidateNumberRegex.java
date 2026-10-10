package JavaFundamental.Coding.RegexExpression;

public class ValidateNumberRegex {
    public static void main(String [] args){
        String input="9876543210";
        System.out.println(input.matches("^[6-9]\\d{9}$")); // check the number is contain in the String
    }
}
