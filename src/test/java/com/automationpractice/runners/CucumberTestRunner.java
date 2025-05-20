package com.automationpractice.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.automationpractice.hooks", "com.automationpractice.stepdefinitions"},
        plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        monochrome = true
)
public class CucumberTestRunner {

}
