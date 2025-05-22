Feature: Contact Us Form

    As a user
    I want to submit a contact us form
    So that I can get in touch with the support team

    Scenario: Successful submission of the contact us form
        Given user is in homepage
        And user clicks on sign in menu
        Then the sign in page should be displayed
        When the user enters valid username and password
        And clicks the sign in button
        Then the user should be redirected to the homepage
        When I am on the Contact Us page
        And I enter the following details in the contact form:
            | subject heading | Customer service             |
            | message         | I need help with my account. |

        And I click the Send button
        Then I should see a confirmation message "Your message has been successfully sent to our team."

