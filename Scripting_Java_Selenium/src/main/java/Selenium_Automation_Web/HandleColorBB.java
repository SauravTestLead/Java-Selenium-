package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class HandleColorBB {
    public static void main(String [] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        Thread.sleep(5000);

        WebElement T= driver.findElement(By.xpath("//center/input[1]"));
        String RGBA = T.getCssValue("background-color");
        String Colorcode= Color.fromString(RGBA).asHex();

        System.out.println(Colorcode);

        //driver.close();
        driver.quit();


    }
}
