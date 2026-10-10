package JavaFundamental.Abstaction_Java.Interface;

public interface Dog{

    void sleep();
    void Age();
    void Name();

    static void eat(){  // static method java 8+ using
        System.out.println("The dog is eating");
    }

    default  void bark(){ // Concert method java 8+ using
        this.Age();
        this.Name();
        System.out.println("the dog is barking");
    }
}
