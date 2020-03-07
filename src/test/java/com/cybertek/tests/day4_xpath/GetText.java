package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        /*
        Task
        go to the forgot password page
        enter any email
        click retrieve password bttn

        verify that the confirmation text
         */
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

        //Verify that the confrmation text "Your e-mail is been sent!"
        String expectedText = "Your email's been sent!";

        WebElement message = driver.findElement(By.name("confirmation_message"));

        //getText()-->
        String ActualText = message.getText();
        if (expectedText.equals(ActualText)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }

    /*
    Ternary operator-->
     boolean var=(expectedResult.equals(actualResult)) ? true:false;
        System.out.println("Result is : "+ var);
                        OR
   boolean var = expectedResult.equals(actualResult);
        System.out.println("Result is : "+ var);
     */
}
