package Selenium_Automation_Web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertpopup {
    public static void main(String [] args) throws Exception{
        System.setProperty("webdriver.chrome.driver","src/browserdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td/input[@name=\"cusid\"]")).sendKeys("12345");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        Alert alert= driver.switchTo().alert();

        //Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting / dismiss alert
        // driver.switchTo().alert().accept();

        driver.switchTo().alert().dismiss();
        driver.close();

    }
}
