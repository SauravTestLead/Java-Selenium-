package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorTest {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        WebElement Color = driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
        Color.getCssValue("background-color");
        System.out.println(Color.getText());


        driver.close();


    }
}
