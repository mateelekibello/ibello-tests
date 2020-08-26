Feature: Test to order products with existing user

	Scenario: Ordering product with invalid username, invalid product
		Given i navigate to the order page
		When the username will be invalid
		When the product will be invalid
		When i send the order
		Then i see that there is an error message

	Scenario: Ordering product with invalid password, invalid product
		When the password will be invalid
		When the product will be invalid
		When i send the order
		Then i see that there is an error message

	Scenario: Ordering product with invalid product
		When the product will be invalid
		When i send the order
		Then i see that there is an error message

	Scenario: Ordering product with valid user, valid product
		Given i use valid username and password
		When i send the order
		Then i see that the order is successfull
