Feature: Contact Us Form

    As a user
    I want to submit a contact us form
    So that I can get in touch with the support team

    Scenario: Successful submission of the contact us form
        Given I am on the Contact Us page
        When I enter the following details in the contact form:
            | subject heading  | message                      |
            | Customer service | I need help with my account. |
            | Webmaster        | I need help with web master. |

        And I click the Send button
        Then I should see a confirmation message "Your message has been successfully sent to our team."

