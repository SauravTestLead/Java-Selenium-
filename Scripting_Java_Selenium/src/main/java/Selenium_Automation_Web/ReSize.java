package Selenium_Automation_Web;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReSize {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        int width= 500;
        int height = 500;
        Dimension D = new Dimension(width,height);
        driver.manage().window().setSize(D);
        Thread.sleep(1000);
       //  driver.close();
         driver.quit();

    }
}