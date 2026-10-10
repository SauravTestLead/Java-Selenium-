package JavaFundamental.Coding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AccendingOrder {
    public static void main(String [] rags){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(100);
        list.add(90);
        System.out.println("The original list is :"+list);
        Collections.sort(list);
        System.out.println("The AcendingOrder is :"+list);
    }
}
