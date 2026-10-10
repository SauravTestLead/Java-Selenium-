package TestNG_Interview;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"username","password"})
    public void Login(String user, String pass){

        System.out.println("Username is " + user);
        System.out.println("Password is " + pass);

    }
}