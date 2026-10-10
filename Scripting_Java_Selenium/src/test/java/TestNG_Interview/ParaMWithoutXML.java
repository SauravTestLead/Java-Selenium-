package TestNG_Interview;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMWithoutXML {

    @Test
    @Parameters({"Username","Passwrod"})
    public void Login(@Optional("admin")String user,@Optional("1234")String pass){
        System.out.println("Username:"+user);
        System.out.println("Username:"+pass);
    }
}
