package com.course.testng;


import org.testng.annotations.Test;

/**
 * 我们期望结果为某一个异常的时候
 * 比如：我们传入了某些不合法的参数，程序抛出了异常
 **/
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaled() {
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试");
        throw new  RuntimeException();
    }
}
