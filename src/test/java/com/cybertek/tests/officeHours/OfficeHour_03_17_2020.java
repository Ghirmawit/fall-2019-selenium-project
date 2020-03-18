package com.cybertek.tests.officeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class OfficeHour_03_17_2020 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa3.vytrack.com");
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

        Thread.sleep(2000);
        /*
        click on contacts
        create contact
        use map to store information and use it later to enter in UI

        //tag[@attribute = 'value']

         */

        WebElement contacts_link = driver.findElement(By.xpath("//span[.='Contacts']/following-sibling::a"));
        Thread.sleep(5000);

        contacts_link.click();
        Thread.sleep(3000);

        WebElement create_contact = driver.findElement(By.linkText("Create Contact"));
        create_contact.click();

        String currentTitle = driver.getTitle();
        if(currentTitle.equalsIgnoreCase("Create Contact - Contacts - Customers")){
            System.out.println("Title is expected");
        }else{
            System.out.println("Title is not expected");

        }
        HashMap<String, String> contact1 = new HashMap<>();
        contact1.put("First Name", "John");
        contact1.put("Last Name", "Smith");
        contact1.put("Phone", "571-236-4545");
        contact1.put("Street", "400 Main Street");
        contact1.put("City", "Tyson's");
        contact1.put("State", "VA");
        contact1.put("Zip code", "22102");
        contact1.put("Sales Group", "true");
        contact1.put("Country", "United States");

        System.out.println("contact 1 = " + contact1);

        WebElement first_name = driver.findElement(By.xpath("(//input[@data-name = 'field_first-name'])"));
        WebElement last_name = driver.findElement(By.xpath("(//input[@data-name = 'field_last-name'])"));
        WebElement phone = driver.findElement(By.name("oro-contact_form[phone][0][phone]"));
        WebElement street = driver.findElement(By.name("oro-contact_form[addresses][0][street]"));
        WebElement City = driver.findElement(By.name("oro-contact_form[addresses][0][city]"));
        WebElement state = driver.findElement(By.xpath("(//input[@data-name = 'field_region-text'])"));
        WebElement zipCode = driver.findElement(By.name("oro_contact_form[address][0][postal code]"));
        WebElement salesGroup = driver.findElement(By.xpath("(//input[@data-name = 'field__1'])[2]"));
        WebElement country = driver.findElement(By.xpath(""));

                /*
                To handle dropdown in selenium we are using Select class
                to use it we have to ensure we have <select></select> tag in our dropdown
                to create Select class we are using WebElement of <select></select>

                 */



    }
}