package JavaFundamental.Coding;

/*
   input = a@b!c
   ouput = c@b!a  --> reverse
 */


public class Pattern2 {
    public static void main(String [] args){
        String input = "a@b!c";
        System.out.println("The Orginal string is :"+input);

        StringBuilder res = new StringBuilder();

        // 1  Separate it
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                res.append(c);
            }
        }
        System.out.println("Reverse : "+ res.reverse());

        // 2 Insert back

        StringBuilder result = new StringBuilder();
        int Index = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(res.charAt(Index++));
            } else {
                result.append(c);
            }
        }
        System.out.println("Insert back with Reversed: " + result.toString());
        }
    }

