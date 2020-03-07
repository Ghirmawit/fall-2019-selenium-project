package com.cybertek.tests.Day3_locators2;

import com.github.javafaker.Faker;

public class FakerPractice {
    public static void main(String[] args) {
        //create fake object
        Faker fakeData = new Faker();

        //I need firstName

        String name = fakeData.name().firstName();
        System.out.println(name);
    }
}
