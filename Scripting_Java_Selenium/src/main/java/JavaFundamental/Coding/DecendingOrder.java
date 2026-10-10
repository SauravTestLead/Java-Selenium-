package JavaFundamental.Coding;

import java.util.ArrayList;
import java.util.Collections;

public class DecendingOrder {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(100);
        list.add(90);
        System.out.println("The original list is :"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("The decending Order is :"+list);
    }
}
