package JavaFundamental.Collection.List;

import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); // 0
        list.add(40); // 1
        list.add(55); // 2
        
        System.out.println("Display the list of Elements :"+list);
        
        System.out.println("Display the size of the list :"+list.size());
        
        System.out.println("Get the First Element from given list :"+list.get(0));
        
        for(int i=0;i<list.size();i++){ // by using pointer in Array old way 
            System.out.println(list.get(i));
        }
        
        for(int x : list ){
            System.out.println("List display for each loop :"+x);
        }
        
        // check the element is present or not 
        
        System.out.println("Check :"+list.contains(40));
        System.out.println("Check:"+list.contains(80));

        // remove the element then display the list

        list.remove(2);
        for(int y : list ){
            System.out.println("After remove index 2 :"+y);
        }

        // Insert the element is the list
        list.add(2,90);
        list.add(3,85);

        System.out.println("after add two morw index list are");
        for(int z : list)
        {

            System.out.println(z);
        }
        
    }
}
