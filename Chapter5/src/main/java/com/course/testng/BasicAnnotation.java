package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testcase1() {
        System.out.println("这是测试用例1");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void testcase2() {
        System.out.println("这是测试用例2");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod是在测试用例前执行的");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod是在测试用例后执行的");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass是在类之前运行的");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass是在类之后运行的");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite测试套件");

    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite测试套件");
    }
}
