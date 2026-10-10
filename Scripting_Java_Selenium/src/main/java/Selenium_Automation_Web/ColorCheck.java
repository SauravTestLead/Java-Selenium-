package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorCheck {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement  l = driver.findElement(By.xpath("//span[@class ='a-size-small dealBadgeTextColor a-text-bold']"));

        // Find the RGAB color code
        String Color_code = l.getCssValue("color");
        System.out.println("The color code is : "+Color_code);

        // Color Name
        String ColorName = Color.fromString(Color_code).asHex();
        System.out.println("The color name is :"+ColorName);

        driver.close();
    }
}


