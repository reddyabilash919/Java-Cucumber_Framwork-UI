package com.automationpractice.hooks;

import com.automationpractice.driver.DriverManager;
import com.automationpractice.utils.Config;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    /**
     * This method is executed before each scenario. It initializes the
     * WebDriver based on the browser specified in the .env file.
     */
    @Before
    public void setup() {
        System.err.println("Browser: " + Config.BROWSER);
        System.err.println("URL: " + Config.URL);
        System.err.println("Email: " + Config.EMAIL);
        System.err.println("Password: " + Config.PASSWORD);
        DriverManager.initDriver(Config.BROWSER);

    }

    @After
    public void teardown() {
        // DriverManager.quitDriver();
    }
}
