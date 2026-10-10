package JavaFundamental.Abstaction_Java.Example;

abstract public class Animal {
    String name="";
    Animal(String name){ // Constructor
        this.name= name;
    }
    abstract void sound(); // abstact method

    void Eat(){
        System.out.println("The Eating");
    }
}

//🔹 Interface 1
interface Flyable {
    void fly();
}

// 🔹 Interface 2
interface Swimmable {
    void swim();
}

// Child 1

class Dogs extends Animal implements Swimmable{

    Dogs(String name){
        super(name);
    }
    @Override
    void sound() {
        System.out.println("The dog sound as Zzzzz"+name);
    }

    @Override
    public void swim() {
       System.out.println("The dog swim well");
    }
}

// child 2

class Brid extends Animal implements Flyable{

    Brid(String name) {
        super(name);
    }

    @Override
    void sound() {
        super.Eat();
        System.out.println("The bird chirp");
    }

    @Override
    public void fly() {
        System.out.println("The bird fly well");

    }
}





