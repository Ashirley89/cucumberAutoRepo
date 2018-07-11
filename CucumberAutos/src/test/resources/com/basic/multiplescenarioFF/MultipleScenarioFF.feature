Feature: To create account of Facebook9
As a user you need to open Facebook homepage and do the validations

Scenario: Validate First Name Field91
Given User needs to be on Facebook login page
When User enters User First Name
Then User checks if user First Name is present
Then Close browser

Scenario: Validate user multiple fields92
Given User needs to be on Facebook login page
When User enters User First Name
And User enters User Lastname
Then User checks if user First Name is present
Then User Mobile field should be blank
Then Close browser

