package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickVsSubmit {
    public static void main(String[] args) {
        /*
         Click() vs submit()

        1.got to forgot password web page
        http://practice.cybertekschool.com/forgot_password
        2.enter any email
        3.click "retrieve password" bttb
        4.verify the URL is:
        http://practice.cybertekschool.com/email_sent

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        //enter any email
        //locate the email box first
        WebElement emailbox = driver.findElement(By.name("email"));
        //enter email --> sendKeys()
        emailbox.sendKeys("helu@gmail.com");
        //click "retrieve "password" bttb
        //locate the bttn first

        WebElement submitBttn = driver.findElement(By.id("form_submit"));
        //submit email by clicking the "retrieve password"
        submitBttn.submit();

        //verify --> Expected result vs Actual result
        String expectedURL = "http://practice.cybertekschool.com/email_sent";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("Yes I have it");
        }else{
            System.out.println("No I don't have it ");
        }
        driver.close();

    }
}
