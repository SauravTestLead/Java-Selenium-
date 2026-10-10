package Selenium_Automation_Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetExample {

        public static void main(String[] args) {
            System.setProperty("Webdriver.chrome.driver","src/browserdrivers/chromedriver");
            WebDriver driver = new ChromeDriver();

            // Navigate to a webpage
            driver.get("https://example.com");

            // Find an element and get its text
            WebElement textElement = driver.findElement(By.id("exampleTextId"));
            String visibleText = textElement.getText();
            System.out.println("Visible text: " + visibleText);

            // Find an element and get its attribute value
            WebElement linkElement = driver.findElement(By.id("exampleLinkId"));
            String hrefValue = linkElement.getAttribute("href");
            System.out.println("Href attribute: " + hrefValue);

            // Close the browser
            driver.quit();
        }
    }

