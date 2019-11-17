package com.course.testng.suite;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    public void beforeSuite(){
        System.out.println("before suite 运行啦");
    }
    public void afterSuite(){
        System.out.println("after suite 运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after testo");

    }
}
