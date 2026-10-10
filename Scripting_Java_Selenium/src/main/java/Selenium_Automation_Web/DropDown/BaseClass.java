package Selenium_Automation_Web.DropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
    protected static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.get("file:///Users/sambitmishra/Documents/Java%20&%20Selenium%20scripting/Scripting_Java_Selenium/src/main/java/HTML/MultipleDropDown.html");
            driver.quit();

        }
    }

