package JavaFundamental.ConstructorJva;

public class CopyConstructorExample {

    String name ="";
    int age;

    CopyConstructorExample(String name , int age){
        this.name=name;
        this.age=age;
    }

    CopyConstructorExample(CopyConstructorExample s){ // copy constructor
        this.name = s.name;
        this.age  = s.age;
    }

    void display(){
        System.out.println(name+" "+age);
    }

    public static void main(String [] args){
        CopyConstructorExample cp = new CopyConstructorExample("source",32);
        CopyConstructorExample cp2 = new CopyConstructorExample(cp); // copy constructor
        cp.display();
        cp2.display(); // copy
    }


}
