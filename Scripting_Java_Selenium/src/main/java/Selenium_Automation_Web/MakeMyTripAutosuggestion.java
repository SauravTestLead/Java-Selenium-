package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripAutosuggestion {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1500);
        WebElement search = driver.findElement(By.xpath("//span[@class=\"lbl_input appendBottom10\"]"));
        search.click();
   
        WebElement Value = driver.findElement(By.xpath("//div/div/div/input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]"));
        Value.sendKeys("BBI");


    }

}
