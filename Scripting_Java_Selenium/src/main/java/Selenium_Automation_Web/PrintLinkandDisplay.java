package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrintLinkandDisplay {

    static WebDriver driver;

    public static void main(String [] arg) throws Exception{
        System.setProperty("webdriver.chrome.driver", "src/browserdrivers/chromedriver");
        Thread.sleep(1000);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// primary screen
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@ data-v-0af708be and @href="));
    }
}
