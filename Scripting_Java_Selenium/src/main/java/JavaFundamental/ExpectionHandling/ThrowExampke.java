package JavaFundamental.ExpectionHandling;

public class ThrowExampke {

    static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Invalid age. Must be 18+");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        checkAge(20); // call the method
        System.out.println("Program finished");
    }
}