package JavaFundamental.Encapulation;

// Hiding data [Method + Variable = single unit (class)]
// - using getter & setter

public class Student {
    //Portieres /feild/instance Variable & Behaviour - class


    private int rollNumber;
    private String Name;
    private int Age;
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

}
