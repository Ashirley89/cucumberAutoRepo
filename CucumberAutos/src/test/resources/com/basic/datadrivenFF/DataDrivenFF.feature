Feature: To create account of Facebook2
As a user you need to open Facebook homepage and do the validations


Scenario Outline: Validate user multiple fields21
Given User needs to be on Facebook login page
When User enters User "<user>" First Name
And User enters User "<lastname>" Lastname
Then User checks if user "<user>" First Name is present
Then User Mobile field should be blank
Then Close browser
Examples:
	|	user	|	lastname	|
	|	Tom		|	Jerry			|
	| Lauren| Hardy			|
	|Delaney| Addo			|
	| Jay 	| Z 				|
	| Snoop	| Dogg			|
	| Ru		| Paul			|
	| Harry	| Kane			|
	| Brad 	| Pitt			|
	| Will  | Smith			|
	| Shug  | Avery 		|



