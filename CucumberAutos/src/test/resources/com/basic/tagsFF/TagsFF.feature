@Important
Feature: To create account of Facebook12
As a user you need to open Facebook homepage and do the validations

@Smoke
Scenario: Validate First Name Field121
Given User needs to be on Facebook login page
When User enters User "David" First Name
Then User checks if user "David" First Name is present
Then Close browser

@Smoke @Regression
Scenario: Validate user multiple fields122
Given User needs to be on Facebook login page
When User enters User "Ryan" First Name
And User enters User "Jones" Lastname
Then User checks if user "Ryan" First Name is present
Then User Mobile field should be blank
Then Close browser

Scenario: Validate user multiple fields123
Given User needs to be on Facebook login page
When User enters User "Ryan" First Name
And User enters User "Jones" Lastname
Then User checks if user "Ryan" First Name is present
Then User Mobile field should be blank
Then Close browser

@Regression
Scenario: Validate First Name Field124
Given User needs to be on Facebook login page
When User enters User "David" First Name
Then User checks if user "David" First Name is present
Then Close browser

@Smoke
Scenario: Validate First Name Field125
Given User needs to be on Facebook login page
When User enters User "David" First Name
Then User checks if user "David" First Name is present
Then Close browser

