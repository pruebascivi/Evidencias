package com.yourcompany.web;

import org.testng.TestNG;

public class WebLauncher {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] {WebTestSuite.class});
        testng.run();
    }
}
