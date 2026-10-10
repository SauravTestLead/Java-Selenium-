package JavaFundamental.Coding.CollectionQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceNumber {
    public static void main(String [] args){
        int [] x = {2,1,2,1,4,5,5,6,1,3};
        System.out.println("The Array value is:"+ Arrays.toString(x));
        Map<Integer,Integer> count = new HashMap<>();

        // count the frequecy
        for(int num :x){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        // Display the value
        System.out.println("---> Occurance of the number is <--- :");
        for(Map.Entry<Integer,Integer> entry: count.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}
