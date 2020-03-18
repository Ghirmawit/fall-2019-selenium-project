package com.cybertek.tests.day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeAndAfterTesting {

    @AfterClass
    public void afterClass(){
        System.out.println("\tAFTER CLASS");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("\tBEFORE CLASS");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\tBEFORE METHOD");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("\tAFTER METHOD");
    }

    @Test
    public void test1(){

        System.out.println("this is test one");
        //Assert.assertEquals(true, false);

    }
    @Test
    public void test2(){
        System.out.println("this is test two");
    }
}
