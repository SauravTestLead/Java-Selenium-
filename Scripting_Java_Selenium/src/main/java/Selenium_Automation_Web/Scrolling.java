package Selenium_Automation_Web;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
    public static void main(String [] args)throws Exception{
        System.setProperty("webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(1000,500)","");

        driver.quit();

    }
}
