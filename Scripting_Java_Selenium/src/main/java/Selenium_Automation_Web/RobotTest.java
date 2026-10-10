package Selenium_Automation_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;

public class RobotTest {
    public static void main(String [] arg) throws AWTException {

        System.setProperty("Webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");
        driver.manage().window().maximize();
        
        Robot robot = new Robot();

        robot.delay(2000);

        String filepath ="/Users/sambitmishra/Downloads/Text2.pdf";

        // Read
        for(char c:filepath.toCharArray()){
            int keycode= KeyEvent.getExtendedKeyCodeForChar(c);
            if(KeyEvent.getKeyText(keycode).matches("[A-Z]")){
                robot.keyPress(KeyEvent.VK_SHIFT);
            }

            robot.keyPress(keycode);
            robot.keyRelease(keycode);

            // Write
            if(KeyEvent.getKeyText(keycode).matches("[A-Z]")){
                robot.keyPress(KeyEvent.VK_SHIFT);
            }

            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_ENTER);

        }

    }
}
