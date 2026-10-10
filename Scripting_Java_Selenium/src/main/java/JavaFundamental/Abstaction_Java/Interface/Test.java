package JavaFundamental.Abstaction_Java.Interface;


public class Test {
    public static void main(String [] args){

      Animal A = new Animal();
      A.Age();
      A.bark();// Default // concert Method of Interface

      Dog.eat(); // static method - access by Class Name

    }
}
