@full-test @ordering
Feature: Test to order products with existing user

	Scenario: Ordering product with invalid username
		Given Demo: i open the homepage
		And i navigate to the order page
		When the username will be invalid
		When the product will be valid
		When i send the order
		Then i see that there is an error message

	Scenario: Ordering product with invalid password
		When the password will be invalid
		When the product will be valid
		When i send the order
		Then i see that there is an error message

	Scenario: Ordering product with invalid product
		When the username and password will be valid
		When the product will be invalid
		When i send the order
		Then i see that there is an error message

	Scenario: Ordering product with valid user, valid product
		When the username and password will be valid
		When the product will be valid
		When i send the order
		Then i see that the order is successfull
