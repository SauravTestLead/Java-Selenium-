package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Attribut {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url ="https://www.tutorialspoint.com/videotutorials/subscription.php";
        driver.get(url);


    // identify element
   WebElement L=  driver.findElement(By.cssSelector("//h1"));
    // get style attribute with getAttribute()
      L.getAttribute("style");
      System.out.println("GetAttribut method():"+L);

}
}
