package JavaFundamental.HashMap;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {

        try {
            System.out.println("Enter the Roll-No & Name for the student");

            HashMap<Integer, String> list = new HashMap<>();

            list.put(101, "Savour Mishra");
            list.put(102, "Prashant Kumar");
            list.put(103, "Deepak Kumar");
            list.put(104, "Shubham Kumar");

            System.out.println("Dipslay all the Student are :" + list);

            System.out.println(list.get(101));
            System.out.println(list.get(107)); // check key is their or not

            System.out.println(list.containsKey(101));
            System.out.println(list.containsValue("Shubham Kumar"));



        }catch (NullPointerException e ){
            System.out.println(e.getMessage());
        }
    }
}
