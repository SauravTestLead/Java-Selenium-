package JavaFundamental.Encapulation;


class Employee {

    private int Salary=0;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }
}

public class EncapsulateTest {
    public static void main(String [] args){
        Employee e = new Employee();
        e.setSalary(700000);
        System.out.println(": "+e.getSalary());
    }
}
