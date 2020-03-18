package com.cybertek.tests.day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {
    @Test
    public void test1(){
        String expected = "one";
        String actual = "one";

        Assert.assertEquals(actual,expected);
        Assert.assertEquals(1,1);
        Assert.assertEquals(true,true);
        System.out.println("test one complete");


    }
    @Test
    public void test2(){
        String expected = "one";
        String actual = "two";
        System.out.println("starting to compare");

        Assert.assertEquals(actual,expected);

        System.out.println("test 2 complete");
    }

}
