package Selenium_Automation_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingMultiple_GetwindowInterface {

    public static void main(String [] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver" ,"src/browserdrivers/chromedriver");

        WebDriver driver = new ChromeDriver(); // chrome browser
        driver.manage().window().maximize(); // maximize the window

        // TAB 1
        driver.get("https://www.google.com/");

        // Open New TAB
        String MainTab = driver.getWindowHandle();// provide new string for that particular window . Every window have unique identifier
        System.out.println("For single Window unique identifier is :" +MainTab);

         //OPEN NEW TAB2 WITH URL


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com/");

        /*
         driver.switchTo().newWindow(WindowType.TAB); // open new Tab (but empty no url)
         driver.get("https://www.youtube.com/");// open the tab with url
         /*

         */

        // come back to TAB 1
        driver.switchTo().window(MainTab);
        System.out.println(driver.getTitle());

        /*
        Handle two Window and provide two unique identifier,
           # System.out.println("For Multiple window unique identifier : "+driver.getWindowHandles())
         */

     driver.close();
    }
}
