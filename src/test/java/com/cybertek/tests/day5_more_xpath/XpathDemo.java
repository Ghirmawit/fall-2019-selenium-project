package com.cybertek.tests.day5_more_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //open browser
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //represent an element from page
        //where the elements come from --> form the findElement methods
        //how to findElement finds elements?
        //using locators
        WebElement buttonOne = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        //start interacting with the element
        String txt = buttonOne.getText();
        System.out.println(txt);
        WebElement buttonTwo = driver.findElement(By.xpath("//h3/following-sibling::button[2]"));
        System.out.println(buttonTwo.getText());

        System.out.println(driver.findElement(By.xpath("//button[3]")).getText());

        WebElement buttonFour = driver.findElement(By.xpath("//div/button[4]"));
        String txt4 = buttonFour.getText();
        System.out.println(txt4);
        WebElement buttonFive = driver.findElement(By.xpath("//button[.='Button 5']"));// using text
        String txt5 = buttonFive.getText();
        System.out.println(txt5);
//        WebElement buttonSix = driver.findElement(By.xpath("//button[@id='disappearing_button'"));//using id
//        //element.getAtt ("value) --. Method to get text from element, used with
//        //get text of the element
//        System.out.println(buttonSix.getAttribute("innerHTML"));
//
//        //if none of the works with outerHTML
//        System.out.println(buttonSix.getAttribute("outerHTML"));

    }
}