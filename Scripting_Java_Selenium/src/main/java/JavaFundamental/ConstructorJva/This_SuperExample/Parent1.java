package JavaFundamental.ConstructorJva.This_SuperExample;

public class Parent1 {

    Parent1(){
        System.out.println("Hello This method");
    }

    static class Child extends Parent1{
         Child(){
             super(); // call the parent constructor
             System.out.println("Child --> hello");
         }
    }

    public static void main(String [] args){
        Child ch = new Child();

    }

}
