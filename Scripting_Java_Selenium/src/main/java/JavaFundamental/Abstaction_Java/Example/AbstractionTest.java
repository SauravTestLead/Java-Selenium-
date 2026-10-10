package JavaFundamental.Abstaction_Java.Example;

public class AbstractionTest {
    public static void main(String [] args){
        Dogs db = new Dogs("Tommy");
        Brid bri = new Brid("Sparrow");
        db.sound();
        db.swim();
        db.Eat();
        bri.fly();
        bri.sound();
        bri.Eat();
    }
}
