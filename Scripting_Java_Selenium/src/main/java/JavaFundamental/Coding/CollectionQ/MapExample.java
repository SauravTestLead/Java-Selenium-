package JavaFundamental.Coding.CollectionQ;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String [] args){

        Map<Integer , String> student = new HashMap<>();

        student.put(31,"Neha");
        student.put(30,"Saurav");
        student.put(20,"Prashant");
        student.put(56,"Johan");

        System.out.println(student);

        //
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println(entry.getKey()+ "-->"+entry.getValue());
        }

        System.out.println("Remove :"+student.remove(56));
        System.out.println(student);

        System.out.println(student.containsValue("saurav"));
        System.out.println(student.containsKey(56));



    }
}
