package JavaFundamental.Collection.List_Interface;
import java.util.ArrayList;
import java.util.List;

public class Day2_Arraylist_toArray {
    public static  void main(String [] args){

        List<Integer> Num = new ArrayList<Integer>();
        Num.add(20);
        Num.add(21);
        Num.add(23);
        Num.add(24);
        Num.add(25);

        System.out.println("The list array is :"+Num);
        // Convert to Array

       //  Object [] bj = Num.toArray(); // object is used for convert ArrayList to Array
        Num.toArray();

         System.out.println("The Array is :");
         for(Object o : Num){
             System.out.println(o);
         }
        System.out.println("Check the length the Array is : "+Num.size());
    }

}

