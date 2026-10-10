package TestNG_Interview;

// ...existing code...
import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = {"smoke"})
    public void loginTest() {
        System.out.println("Login Test - Smoke");
    }

    @Test(groups = {"smoke"})
    public void homePageTest() {
        System.out.println("Home Page Test - Smoke");
    }

    @Test(groups = {"regression"})
    public void profileTest() {
        System.out.println("Profile Test - Regression");
    }

}

