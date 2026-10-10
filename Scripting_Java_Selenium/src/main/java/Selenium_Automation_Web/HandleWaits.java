package Selenium_Automation_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class HandleWaits {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("Webdriver.chrome.driver", "src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");



    }
}

