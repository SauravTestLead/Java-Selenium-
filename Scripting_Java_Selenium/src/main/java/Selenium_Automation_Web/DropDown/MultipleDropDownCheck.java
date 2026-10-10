package Selenium_Automation_Web.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDropDownCheck extends BaseClass {

    // [1] find all the option and inside drop down text
    public void PrintAllDropDownOption(){
       List<WebElement> listOptions = driver.findElements(By.xpath("div[@class=\"mb-3\"]//select[@class=\"form-select\"]"));
       for(WebElement Element : listOptions) {
           Select select = new Select(Element);
           System.out.println("All option are :" + select.getOptions());

           List<WebElement> alloptions = select.getOptions();
           System.out.println("The list option are" + alloptions);
           for (WebElement option : alloptions) {
               System.out.println("--->" + option.getText());
           }
       }
       }

       /*

       // [2] Find only on drop down with text inside
    public void PrintOnlyOneDropDownOption() throws InterruptedException {
        WebElement Element = driver.findElement(By.xpath("//div[1][@class=\"mb-3\"]//select[@class=\"form-select\"]"));
        Element.click();
        Select select = new Select(Element);
        System.out.println("Print Option value");
        System.out.println("---> " + select.getAllSelectedOptions());

        Thread.sleep(2000);

        List<WebElement> options = select.getOptions();
        int Index = 0;
        for (WebElement option : options) {
            System.out.println("Selecting option" + option.getText() + "(index" + Index + ")");
            select.selectByIndex(Index);
            Index++;
        }
    }

    // [3] Remove Duplicate
    public void RemoveDuplicate() throws InterruptedException {
    WebElement Element = driver.findElement(By.xpath("//div[1][@class=\"mb-3\"]//select[@class=\"form-select\"]"));
    Element.click();
    Select select = new Select(Element);
    List<WebElement> options = select.getOptions();

    Thread.sleep(2000);
        // Use a Set for unique values
        Set<String> uniqueValues = new HashSet<>();
        Set<String> duplicateValues = new HashSet<>();

        for (WebElement option : options) {
            String text = option.getText().trim();  // get visible text
            if (!uniqueValues.add(text)) {  // if already exists, it's duplicate
                duplicateValues.add(text);
            }
        }

        System.out.println(" Unique Dropdown Values: " + uniqueValues);
        System.out.println(" Duplicate Dropdown Values: " + duplicateValues);
    }

        */

public static void main(String [] args) throws InterruptedException {
    MultipleDropDownCheck mg = new MultipleDropDownCheck();
    mg.PrintAllDropDownOption();

}
}

