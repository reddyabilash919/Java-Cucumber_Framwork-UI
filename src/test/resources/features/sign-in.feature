Feature: Sign In

    Scenario: Verify successful sign in with valid credentials
        Given user is in homepage
        And user clicks on sign in menu
        Then the sign in page should be displayed
        When the user enters valid username and password
        And clicks the sign in button
        Then the user should be redirected to the homepage




