@full-test @message @negative
Feature: Decision table for sending a message test scenarios

Scenario: Sending message with invalid name
	Given Message: i want to send a new message
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

Scenario: Sending message with invalid message
	Given Message: i want to send a new message
	When Message: the message will be invalid
	When Message: i send the message
	Then Message: i see that the there is an error message
