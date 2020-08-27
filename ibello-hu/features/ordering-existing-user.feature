@full-test @ordering
Feature: Test to order products with existing user

	Scenario: Ordering product with invalid username
		Given Existing user order: i want to take an order
		And Existing user order: i navigate to the order page
		When Existing user order: the username will be invalid
		When Existing user order: the product will be valid
		When Existing user order: i send the order
		Then Existing user order: i see that there is an error message

	Scenario: Ordering product with invalid password
		Given Existing user order: i want to take an order
		When Existing user order: the password will be invalid
		When Existing user order: the product will be valid
		When Existing user order: i send the order
		Then Existing user order: i see that there is an error message

	Scenario: Ordering product with invalid product
		Given Existing user order: i want to take an order
		When Existing user order: the username and password will be valid
		When Existing user order: the product will be invalid
		When Existing user order: i send the order
		Then Existing user order: i see that there is an error message

	Scenario: Ordering product with valid user, valid product
		Given Existing user order: i want to take an order
		When Existing user order: the username and password will be valid
		When Existing user order: the product will be valid
		When Existing user order: i send the order
		Then Existing user order: i see that the order is successfull
