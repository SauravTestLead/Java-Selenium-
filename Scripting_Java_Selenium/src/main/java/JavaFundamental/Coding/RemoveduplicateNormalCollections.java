package JavaFundamental.Coding;

import java.util.HashSet;
import java.util.Set;

public class RemoveduplicateNormalCollections {
    public static void main(String [] args){
        String str = "Programing";

        System.out.println("The original value is :"+str);

        Set<Character> res = new HashSet<>();
        StringBuilder stringtest = new StringBuilder();
        for(char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                res.add(c);
                stringtest.append(c);
            }
        }

        System.out.println(" the remove duplicate :"+stringtest.toString());
    }
}
