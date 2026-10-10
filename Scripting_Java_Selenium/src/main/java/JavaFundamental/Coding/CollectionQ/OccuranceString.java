package JavaFundamental.Coding.CollectionQ;

import java.util.HashMap;
import java.util.Map;


public class OccuranceString {
    public static void main(String [] args){
        String str="aasuravn";

        System.out.println("The String is :"+str);

        Map<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println("The Occurance String is :");
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"--> "+entry.getValue());
        }
    }
}
