package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Autosuggestion {
    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Iphone");
        Thread.sleep(5000);

        List<WebElement> Search_box = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
        for(int i=0;i<Search_box.size()-1;i++){
            System.out.println(Search_box.get(i).getText());
        }

       driver.close();
    }
}
