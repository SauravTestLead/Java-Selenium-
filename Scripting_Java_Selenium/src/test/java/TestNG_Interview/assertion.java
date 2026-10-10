package TestNG_Interview;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class assertion {

    WebDriver driver;

    @Test
    public void checkAssertion() throws InterruptedException {

        driver = new ChromeDriver();// ✅ Initialization
        driver.get("https://www.google.com");

        Thread.sleep(5000);

        String actual = driver.getTitle();
        String expected = "Google";

        Assert.assertEquals(expected, actual);

        driver.quit();
    }
}

