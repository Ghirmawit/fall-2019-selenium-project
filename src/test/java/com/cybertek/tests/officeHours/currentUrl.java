package com.cybertek.tests.officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currentUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get("https://www.google.com/");//hit the url on the browser
//        System.out.println(driver.getTitle());//validate if your page title is correct
//        System.out.println(driver.getCurrentUrl());//validate if you are landed on correct url
//        System.out.println(driver.getPageSource());//print page source
//
//        driver.get("https://yahoo.com");
//        driver.navigate().back();
//       // driver.navigate().forward();
//        driver.close();//closes current browser
//        driver.quit();//closes all the browsers opened by selenium scrip

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("girma0220@yahoo.com");

        driver.findElement(By.id("pass")).sendKeys("202630");
        driver.findElement(By.id("u_0_b")).click();


    }
}
