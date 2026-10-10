package Selenium_Automation_Web;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class HandleScreenshot {
    public static void main(String [] args) throws InterruptedException, IOException {
        System.setProperty("Webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");
        Thread.sleep(1000);

        TakesScreenshot ts = ((TakesScreenshot) driver);
        File Src = ts.getScreenshotAs(OutputType.FILE);
        File Tar = new File("src/browserdrivers/newScreenshot123.png");
        Files.copy(Src.toPath(),Tar.toPath());

       // driver.quit()
        driver.close();

}
}


