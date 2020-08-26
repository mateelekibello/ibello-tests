@full-test @message
Feature: Decision table for sending a message test scenarios

	Background: Loading the valid test data
		Given Message: i load the valid test data

	Scenario: Sending message with invalid name
		Given Language: i open the homepage
		And Message: i want to send a new message
		When Message: the name will be invalid
		When Message: i send the message
		Then Message: i see that the there is an error message

	Scenario: Sending message with invalid email
		Given Message: i want to send a new message
		When Message: the email will be invalid
		When Message: i send the message
		Then Message: i see that the there is an error message

	Scenario: Sending message with invalid subject
		Given Message: i want to send a new message
		When Message: the subject will be invalid
		When Message: i send the message
		Then Message: i see that the there is an error message

	Scenario: Sending message with invalid massage
		Given Message: i want to send a new message
		When Message: the message will be invalid
		When Message: i send the message
		Then Message: i see that the there is an error message

	Scenario: Sendig message with valid name, valid email, valid subject, valid message
		Given Message: i fill out the form with valid datas
		When Message: i send the message
		Then Message: i see that message sent successfully
