package JavaFundamental.Coding.CollectionQ;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String [] args){

        // Key - > Unique
        // Value --> Muliple
        Map<Integer,Integer> mymap = new HashMap<>();
        mymap.put(2,1);
        mymap.put(2,3);
        mymap.put(2,4);
        mymap.put(4,1);

        System.out.println("The maps value are :"+mymap);
    }
}
