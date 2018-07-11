Feature: To create account of Facebook4
As a user you need to open Facebook homepage and do the validations

Scenario: Validate First Name Field41
Given User needs to be on Facebook login page
When User enters User First Name
Then User checks if user First Name is present

#Scenario: Validate user multiple fields
#Given User needs to be on the Facebook login page
#When User enters User First Name
#And User enters User Lastname
#Then User checks first name is present
#But User Mobile field should be blank


