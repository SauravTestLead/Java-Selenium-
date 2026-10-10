package JavaFundamental.Collection.List_Interface;

import java.util.ArrayList;
import java.util.Comparator;

public class Day1_Arraylist {
    public static void main(String [] args){


        /*
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Saurac");
        arr.add("Sau");
        arr.add("S");
        arr.add("c");
        arr.add("ac");

        ArrayList<Integer> arr2  = new ArrayList<Integer>();
        arr2.add(2);
        arr2.add(20);
        arr2.add(21);
        arr2.add(12);

        System.out.println("The second Array list is :"+arr2);

        System.out.println("The list of array as follow :"+arr);

        // find the size of array list
        System.out.println("The size/ length of the array list is ? :"+arr.size()+" : "+arr2.size());
*/
        // Un-order list
         ArrayList <Integer> Num = new ArrayList<Integer>();
         Num.add(23);
         Num.add(2);
         Num.add(7);
         Num.add(4);
         Num.add(1);
         System.out.println("The arrayList is :"+Num);

         // Sort the list
         Num.sort(Comparator.naturalOrder());
         System.out.println("The sort list is :"+Num);

         // Reverse list number
        System.out.println("The Reverse List of Number is :"+Num.reversed());


        // Access the element of the given list

        Num.get(3);

        System.out.println();



    }
}
