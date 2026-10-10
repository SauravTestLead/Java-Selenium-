package Selenium_Automation_Web.DataDrivenFramework;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseClass {

    protected static WebDriver driver;
    public static void main(String [] args){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
}
