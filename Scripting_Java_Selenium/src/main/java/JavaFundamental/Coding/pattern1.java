package JavaFundamental.Coding;

public class pattern1 {
        public static void main(String[] args) {
            String s = "a!@b#123";

            // Remove non-digit characters
            String s1 = s.replaceAll("\\D", "");

            int sum = 0;

            System.out.println("The original string is: " + s);
            System.out.println("After removing non-digit characters, the value is: " + s1);

            // Sum each digit
            for (char c : s1.toCharArray()) {
                sum += Character.getNumericValue(c);
            }

            System.out.println("The sum is: " + sum);
        }
    }
