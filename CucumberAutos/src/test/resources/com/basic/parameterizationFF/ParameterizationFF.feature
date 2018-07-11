Feature: To create account of Facebook10
As a user you need to open Facebook homepage and do the validations

Scenario: Validate First Name Field101
Given User needs to be on Facebook login page
When User enters User "David" First Name
Then User checks if user "David" First Name is present
Then Close browser

Scenario: Validate user multiple fields102
Given User needs to be on Facebook login page
When User enters User "Ryan" First Name
And User enters User "Jones" Lastname
Then User checks if user "Ryan" First Name is present
Then User Mobile field should be blank
Then Close browser

