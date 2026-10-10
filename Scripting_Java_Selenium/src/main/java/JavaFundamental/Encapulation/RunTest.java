package JavaFundamental.Encapulation;

public class RunTest {
    public static void main(String [] args){
        Student  s = new Student();

        s.setName("Saurav");
        s.setAge(56);
        s.setRollNumber(234556);
        System.out.println("Name is :"+s.getName());
        System.out.println("Name is :"+s.getAge());
        System.out.println("Name is :"+s.getRollNumber());

    }
}
