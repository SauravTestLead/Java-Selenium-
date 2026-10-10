package JavaFundamental.Abstaction_Java.Interface;

public class Animal implements Dog{
    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }

    @Override
    public void Age() {
        System.out.println("The dog age is 20");
    }

    @Override
    public void Name() {
        System.out.println("The name dog is :Tommy ");
    }

}
