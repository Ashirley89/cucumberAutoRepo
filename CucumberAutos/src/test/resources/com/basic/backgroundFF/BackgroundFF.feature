Feature: To create account of Facebook1
As a user you need to open Facebook homepage and do the validations

Background: Common login steps
Given User needs to be on Facebook login page

Scenario: Validate First Name Field11
When User enters User "David" First Name
Then User checks if user "David" First Name is present
Then Close browser

Scenario: Validate user multiple fields12
When User enters User "Ryan" First Name
And User enters User "Jones" Lastname
Then User checks if user "Ryan" First Name is present
Then User Mobile field should be blank
Then Close browser

