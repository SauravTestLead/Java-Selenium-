package Selenium_Automation_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinktest {
    protected WebDriver driver;

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/?zx=1757917170638&no_sw_cr=1");

        // 1 get all the link
        List<WebElement> allinks = driver.findElements(By.xpath("//a"));
        System.out.println("The link size is :" + allinks.size());

        // 2 loop
        for (WebElement element : allinks) {
            String url = element.getAttribute("href");
            System.out.println("the url is :" + url);

            // check the url is null
            if (url == null || url.isEmpty()) {
                System.out.println("the url is null and empty");
                continue;
            }

            // 3.create HTTP Connection
            try {
                HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
                connection.setRequestMethod("HEAD");
                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println(url + " is BROKEN (Code: " + responseCode + ")");
                } else {
                    System.out.println(url + " is VALID (Code: " + responseCode + ")");
                }

            } catch (Exception e) {
                System.out.println("Exception at URL: " + url);
            }
        }

        driver.quit();
    }
}

