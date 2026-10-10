package JavaFundamental.Abstaction_Java.Abstract;

public class Vechile extends TataCar {
    @Override
    void size() {
        System.out.println("1603 X 3456");
    }

    public static void main(String [] args){

        TataCar T = new Vechile();

        T.color();
        T.size();
        T.Model();
    }

}


