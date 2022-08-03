package com.company.util;

import com.codeborne.selenide.Configuration;
import com.company.pageobjects.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class TestRunner {

    protected final HomePage homePage = new HomePage();

    @BeforeSuite
    public void driverConfigurationAndTimeout() {
        Configuration.browser = "chrome";
        Configuration.timeout = 60 * 1000;
    }

    @BeforeMethod
    public void navigateToUrl() {
        homePage.open();
    }
}
