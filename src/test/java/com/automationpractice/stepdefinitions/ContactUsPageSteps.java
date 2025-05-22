package com.automationpractice.stepdefinitions;

import java.util.Map;

import com.automationpractice.driver.DriverManager;
import com.automationpractice.pages.BasePage;
import com.automationpractice.pages.ContactUsPage;
import com.automationpractice.utils.Config;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsPageSteps {

    private final ContactUsPage contactUsPage = new ContactUsPage(DriverManager.getDriver());

    @Given("I am on the Contact Us page")
    public void i_am_on_the_contact_us_page() {
        BasePage basePage = new BasePage(DriverManager.getDriver());

        basePage.navigateToHomePage(Config.URL);
        basePage.clickOnContactUsMenu();
    }

    @When("I enter the following details in the contact form:")
    public void i_enter_the_following_details_in_the_contact_form(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> formData = dataTable.asMap(String.class, String.class);
        System.out.println("Form data: " + formData);
         System.out.println("Form data: " + formData.get("subject heading"));
        contactUsPage.selectSubjectHeading(formData.get("subject heading"));
        contactUsPage.enterMessage(formData.get("message"));

    }

    @When("I click the Send button")
    public void i_click_the_send_button() {

        contactUsPage.clickSendButton();
    }

    @Then("I should see a confirmation message {string}")
    public void i_should_see_a_confirmation_message(String string) {

        String actualSuccessMessage = contactUsPage.getSuccessMessage();
        String expectedSuccessMessage = "Your message has been successfully sent to our team.";
        if (actualSuccessMessage.equals(expectedSuccessMessage)) {
            System.out.println("Test passed: " + actualSuccessMessage);
        } else {
            System.out.println("Test failed: " + actualSuccessMessage);
        }
    }
}
