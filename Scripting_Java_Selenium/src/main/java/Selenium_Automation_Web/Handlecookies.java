package Selenium_Automation_Web;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Handlecookies {
    public static void main(String [] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        //add Cookies
        Cookie mycookies = new Cookie("Saurasv","9rubcbf");
        driver.manage().addCookie(mycookies);
        System.out.println(mycookies);

        // all cookies
        Set<Cookie> allcookies = driver.manage().getCookies();
        System.out.println(allcookies);
        for(Cookie C:allcookies){
            System.out.println(C.getName()+""+C.getValue());
        }
  driver.quit();
    }
}
