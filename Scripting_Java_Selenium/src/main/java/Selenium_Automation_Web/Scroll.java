package Selenium_Automation_Web;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
    public static void main (String [] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/browserdrivers/chromedriver" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);

        // Perform scroll down
        scrollDown(driver);
        // Perform scroll up
        scrollUp(driver);
    }

    private static void scrollDown(WebDriver driver){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down by 500 pixels vertically
        js.executeScript("window.scrollBy(0,2000)");
    }
    private static void scrollUp(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll up by 500 pixels vertically
        js.executeScript("window.scrollBy(0,-2000)");
    }

}
