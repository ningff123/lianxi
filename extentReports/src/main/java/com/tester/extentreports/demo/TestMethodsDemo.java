package com.tester.extentreports.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {
    @Test
    public void  test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void  test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void  test3(){
        Assert.assertEquals(2,2);
    }
    @Test
    public void  logDemo(){
        Reporter.log("这是logDemo日志记录001");
        throw new RuntimeException("运行异常");
    }

}
