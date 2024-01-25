package org.example.testcases;


import org.example.base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class JenkinB extends TestBase {
    public SoftAssert softAssert;
    @BeforeMethod
    public void predefineData() throws InterruptedException {
        setupDriver();
    }
    @AfterMethod
    public void postExecute()
    {
        driverQuit();

    }
    @Test
    public void TC1() throws InterruptedException, IOException {
        System.out.println("TC1");

    }
    @Test
    public void TC2() throws InterruptedException {
        System.out.println("TC2");
    }

}
