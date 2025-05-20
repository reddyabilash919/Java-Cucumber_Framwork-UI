package com.automationpractice.stepdefinitions;

import com.automationpractice.driver.DriverManager;
import com.automationpractice.pages.BasePage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.utils.Config;

import io.cucumber.java.en.Given;

public class HomePageSteps {

    @Given("user is in homepage")
    public void user_is_in_homepage() {

        BasePage basePage = new BasePage(DriverManager.getDriver());
       
        basePage.navigateToHomePage(Config.URL);
    }


    @Given("user clicks on sign in menu")
    public void user_clicks_on_sign_in_menu() {
        SignInPage signInPage = new SignInPage(DriverManager.getDriver());
        signInPage.clickOnSignInMenu();

    }

}
