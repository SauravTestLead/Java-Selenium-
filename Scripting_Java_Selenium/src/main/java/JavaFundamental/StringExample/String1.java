package JavaFundamental.StringExample;

public class String1 {
    public static void main(String [] args){

        String s = "hello";
        // Strings are immutable; concat returns a new String which must be assigned
        // s.concat("  world");
        s=s.concat("World");
        System.out.println(s);
    }
}
