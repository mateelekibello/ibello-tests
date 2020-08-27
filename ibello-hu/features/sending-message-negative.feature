@full-test @message @negative
Feature: Decision table for sending a message negative test scenarios

Scenario: Sending message with invalid name
	Given Message negative: i want to send a new message
	When Message negative: the name will be invalid
	When Message negative: i send the message
	Then Message negative: i see that the there is an error message

Scenario: Sending message with invalid email
	Given Message negative: i want to send a new message
	When Message negative: the email will be invalid
	When Message negative: i send the message
	Then Message negative: i see that the there is an error message

Scenario: Sending message with invalid subject
	Given Message negative: i want to send a new message
	When Message negative: the subject will be invalid
	When Message negative: i send the message
	Then Message negative: i see that the there is an error message

Scenario: Sending message with invalid message
	Given Message negative: i want to send a new message
	When Message negative: the message will be invalid
	When Message negative: i send the message
	Then Message negative: i see that the there is an error message
