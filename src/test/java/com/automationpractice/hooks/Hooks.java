package com.automationpractice.hooks;

import com.automationpractice.Driver.DriverManager;
import com.automationpractice.utils.Config;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    /**
     * This method is executed before each scenario.
     * It initializes the WebDriver based on the browser specified in the .env file.
     */
    @Before
    public void setup() {
       
        DriverManager.initDriver(Config.BROWSER);

    }

    @After
    public void teardown() {
        DriverManager.quitDriver();
    }
}
