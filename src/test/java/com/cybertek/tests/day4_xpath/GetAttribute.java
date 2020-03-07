package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        /*
        got to forget password page

        locate signin button from bookit login page
        print out submit value
        type='submit'
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement retreievePasswordBttn = driver.findElement(By.id("form_submit"));

        // <button id="form_submit" class="radius" type="submit"><i class="icon-2x icon-signin">Retrieve password</i></button>
        System.out.println(retreievePasswordBttn.getAttribute("type"));
        System.out.println(retreievePasswordBttn.getAttribute("class"));
        System.out.println(retreievePasswordBttn.getAttribute("id"));

    }
}
