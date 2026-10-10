package JavaFundamental.Collection.Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);

        // Display the list of element
        System.out.println("the list of element without remove duplicate  is :"+list);

        // Remove the duplicate
        Set<Integer> Original = new LinkedHashSet<>(list);

        //display the list after remove duplicate
        List<Integer> RemoveDupOri = new ArrayList<Integer>(Original);

        System.out.println("The list of element display with remove duplicate value :"+RemoveDupOri);
    }
}
