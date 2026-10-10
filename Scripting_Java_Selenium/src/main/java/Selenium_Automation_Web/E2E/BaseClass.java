package Selenium_Automation_Web.E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.get("https://www.amazon.in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Click on Account & Lists
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//span[@id='nav-link-accountList-nav-line-1']")));
            link.click();

            // Enter mobile number
            WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@type='email']")));
            email.sendKeys("9148378034");

            // Click continue
            WebElement cont = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@type='submit']")));
            cont.click();

            // Enter password
            WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@type='password']")));
            password.sendKeys("SauravShoppingtest#00");

            // Click sign-in
            WebElement sign = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@id='signInSubmit']")));
            sign.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
