package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyIspkt {
    public static void main(String[] args) {

        //https://www.etsy.com/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();

        String expectedTitle = "etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        String actualTitle = driver.getTitle();

        if(expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Yes Pass");
        }else{
            System.out.println("No it Fail");
            System.out.println(expectedTitle + " vs " + actualTitle);
        }
        driver.close();
    }
}
