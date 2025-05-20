package com.automationpractice.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.automationpractice.Driver.DriverManager;
import com.automationpractice.pages.BasePage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.utils.Config;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageSteps {

    private final SignInPage signInPage = new SignInPage(DriverManager.getDriver());
  

    @Then("the sign in page should be displayed")
    public void the_sign_in_page_should_be_displayed() {

        String pageTitle = signInPage.getSignInPageTitle();
        assertEquals("CREATE AN ACCOUNT", pageTitle);
        System.err.println("Page title: " + pageTitle);
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {

        signInPage.enterEmailAddress(Config.EMAIL);
        signInPage.enterPassword(Config.PASSWORD);

    }

    @When("clicks the sign in button")
    public void clicks_the_sign_in_button() {
        signInPage.clickSignInButton();

    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {

        BasePage basePage = new BasePage(DriverManager.getDriver());
        String actualUsename = basePage.getUserName();
        assertEquals("Abilash DJ", actualUsename);
        System.err.println("Actual username: " + actualUsename);
    }

}
