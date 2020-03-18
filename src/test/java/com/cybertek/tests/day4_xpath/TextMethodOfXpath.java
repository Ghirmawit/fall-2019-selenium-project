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
        \
        //tagNme[text()='exact text']

         */

        WebDriver text = WebDriverFactory.getDriver("chrome");
        text.get(" http://practice.cybertekschool.com/context_menu");
        text.manage().window().maximize();
        ///html/body/div/div[2]/div/div/h3
      WebElement conMenu = text.findElement(By.xpath("h3[text()='Context Menu']"));

      //Verify --> expected vs actual

        String expectedText = "Context Menu";
        String actualText = conMenu.getText();


    }
}
