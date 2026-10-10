package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CheckMutipleWindow {
    public static void main(String [] args) throws Exception{
        System.setProperty("Webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/sambitmishra/Documents/Java%20&%20Selenium%20scripting/Scripting_Java_Selenium/src/Test.html");
        driver.manage().window().maximize();
        String MainWindow = driver.getWindowHandle();

        Thread.sleep(1000);

        WebElement Google=driver.findElement(By.xpath("//button[contains(text(),'Google')]"));


        Google.click();

        WebElement Youtube = driver.findElement(By.xpath("//button[contains(text(),'Wiki')]"));
        Youtube.click();

        WebElement Facebook = driver.findElement(By.xpath("//button[contains(text(),'Git')]"));
        Facebook.click();

        // print the window / browser Title
        Set<String> Allwin = driver.getWindowHandles();
        for(String handle:Allwin){
            driver.switchTo().window(handle);
            String Title = driver.getTitle();
            System.out.println(Title);

            // check youtube
            if(Title.toLowerCase().contains("Google")){
                String TitleText = driver.getTitle();
                System.out.println("Selected Google");
                System.out.println("The Title is :"+Title);
                break;
            }
        }

        driver.quit();

    }
}
