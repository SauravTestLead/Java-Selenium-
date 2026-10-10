package JavaFundamental.Coding.CollectionQ;

import org.checkerframework.checker.units.qual.C;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String [] args){

        String input = "Saurxmmv";

        System.out.println("The original string is :"+input);

        Map<Character,Integer> mymap = new HashMap<>();

        // count
        for(char c : input.toCharArray()){
            mymap.put(c,mymap.getOrDefault(c,0)+1);
        }

        // check
        for(Map.Entry<Character,Integer> entry:mymap.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey());
            }
        }
    }
}
