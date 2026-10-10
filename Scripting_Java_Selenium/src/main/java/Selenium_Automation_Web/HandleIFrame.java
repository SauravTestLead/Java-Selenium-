package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames"); // navigate to URL Frame
        Thread.sleep(5000);
        //switch to the iFrame
        driver.switchTo().frame(0);
        WebElement iframe =  driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        String text = iframe.getText();
        System.out.println(text);
    // driver.quit();
        driver.close();
    }
}
