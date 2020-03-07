package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethodOfXpath {
    public static void main(String[] args) {
        /*
        go to http://practice.cybertekschool.com/context_menu
        Verify context Menu is on the page

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get(" http://practice.cybertekschool.com/context_menu");
        driver.manage().window().maximize();
        ///html/body/div/div[2]/div/div/h3
      WebElement conMenu = driver.findElement(By.xpath("h3[text()='Context Menu']"));

    }
}
