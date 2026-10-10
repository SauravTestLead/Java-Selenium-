package JavaFundamental.Coding.RegexExpression;

public class Regex2 {
    public static void main(String [] args){
        String input ="Test1234";
        System.out.println(input.replaceAll("\\d","")); // Small (input.ReplaceAll("//d"," "))_ regex is use for text = output will be Test
        System.out.println(input.replaceAll("\\D","")); // Capital (input.ReplaceAll("//D"," ")) regex is used for Nunber = output 1234
    }

}
