package JavaFundamental.ConstructorJva.This_SuperExample;

public class Parent {

    int x = 20;
}

class Child extends Parent {

    int y = 30;

    void display() {
        System.out.println(this.y + " " + super.x);
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}