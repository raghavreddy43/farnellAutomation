Feature:  As a user I should be navigate to Farnell Home page Successfully, and complete registration

@Automated @Regression
Scenario: 1. Verify that the user able to navigate to Farnell page Successfully and assert Hello World
Given user navigate to Farnell Home page
When user clicked on cookie accept button
Then validate Farnell Logo

Scenario: 2. Verify user able to complete registration
Given I clicked on register option
When I enter username and password
When I enter full name
When I enter email address
When I click on remember me checkbox
When user clicked on register button
Then assert user registered successfully as firstName loggedIn
Then Close the browser