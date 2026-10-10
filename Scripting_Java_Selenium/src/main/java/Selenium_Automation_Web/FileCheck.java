package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class FileCheck {
    public static void main(String [] args) throws Exception{

        System.setProperty("Webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");
        driver.manage().window().maximize();


       WebElement upload = driver.findElement(By.xpath("//button[@type='submit']"));
       upload.sendKeys(" /Users/sambitmishra/Downloads/Text2.pdf");

       Thread.sleep(2000);

        driver.quit();

    }
}
