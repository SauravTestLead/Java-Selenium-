package JavaFundamental.ConstructorJva;

public class ParameterCostructorExample {

    String name ="";
    int age;

    ParameterCostructorExample(String name , int age){
        this.age=age;
        this.name=name;
    }

    void display(){
        System.out.println(name+"---"+age);
    }

    public static void main(String [] args){
        ParameterCostructorExample pr = new ParameterCostructorExample("saurav",34);
        pr.display();
    }
}
