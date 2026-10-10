package Selenium_Automation_Web;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class
Scrollable {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.adidas.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0,1000)","");
        Thread.sleep(5000);
        driver.quit();
    }
}
