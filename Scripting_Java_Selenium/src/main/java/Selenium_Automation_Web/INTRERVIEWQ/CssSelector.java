package Selenium_Automation_Web.INTRERVIEWQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedCondition.*;

public class CssSelector {
    public static void main(String [] RGS) throws Exception {
        System.setProperty("webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        final var timeouts = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();


        WebElement Upload = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        Thread.sleep(5000);
        String filepath = " /Users/sambitmishra/Downloads/Text2.pdf";

        Upload.sendKeys(filepath);

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        driver.close();

    }
}
