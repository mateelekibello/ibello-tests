@negative
Feature: Decision table for sending a message test scenarios

	Background: Home page is loaded
		Given Demo: homepage is loaded

	@test1
	Scenario: Sending message with invalid name, invalid email
		Given i want to send a new message
		When the name will be invalid
		When the name will be invalid
		When i send the message
		Then i see that the there is an error message

	Scenario: Sending message with invalid name, invalid subject
		Given i want to send a new message
		When the name will be invalid
		When the subject will be invalid
		When i send the message
		Then i see that the there is an error message

	Scenario: Sending message with invalid name, invalid massage
		Given i want to send a new message
		When the name will be invalid
		When the message will be invalid
		When i send the message
		Then i see that the there is an error message

	Scenario: Sending message with invalid name
		Given i want to send a new message
		When the name will be invalid
		When i send the message
		Then i see that the there is an error message

	Scenario: Sending message with invalid email, invalid subject
		Given i want to send a new message
		When the name will be invalid
		When the subject will be invalid
		When i send the message
		Then i see that the there is an error message

	Scenario: Sending message with invalid email, invalid massage
		Given i want to send a new message
		When the name will be invalid
		When the message will be invalid
		When i send the message
		Then i see that the there is an error message

	Scenario: Sending message with invalid email
		Given i want to send a new message
		When the name will be invalid
		When i send the message
		Then i see that the there is an error message

	Scenario: Sending message with invalid subject, invalid massage
		Given i want to send a new message
		When the subject will be invalid
		When the message will be invalid
		When i send the message
		Then i see that the there is an error message

	Scenario: Sending message with invalid subject
		Given i want to send a new message
		When the subject will be invalid
		When i send the message
		Then i see that the there is an error message

	Scenario: Sending message with invalid massage
		Given i want to send a new message
		When the message will be invalid
		When i send the message
		Then i see that the there is an error message
