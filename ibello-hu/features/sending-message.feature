@full-test @message
Feature: Decision table for sending a message test scenarios

Scenario: Sending message with invalid name, invalid email, valid subject, valid message
	Given Message: i want to send a new message
	When Message: the name will be invalid
	When Message: the email will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with invalid name, valid email, invalid subject, valid message
	Given Message: i want to send a new message
	When Message: the name will be invalid
	When Message: the subject will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with invalid name, valid email, valid subject, invalid message
	Given Message: i want to send a new message
	When Message: the name will be invalid
	When Message: the message will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with invalid name, valid email, valid subject, valid message
	Given Message: i want to send a new message
	When Message: the name will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with valid name, invalid email, invalid subject, valid message
	Given Message: i want to send a new message
	When Message: the email will be invalid
	When Message: the subject will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with valid name, invalid email, valid subject, invalid message
	Given Message: i want to send a new message
	When Message: the email will be invalid
	When Message: the message will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with valid name, invalid email, valid subject, valid message
	Given Message: i want to send a new message
	When Message: the email will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with valid name, valid email, invalid subject, invalid message
	Given Message: i want to send a new message
	When Message: the subject will be invalid
	When Message: the message will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with valid name, valid email, invalid subject, valid message
	Given Message: i want to send a new message
	When Message: the subject will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with valid name, valid email, valid subject, invalid message
	Given Message: i want to send a new message
	When Message: the message will be invalid
	When Message: i fill out the form and send the message
	Then Message: i see that the there is an error message

Scenario: Sending message with valid data
	Given Message: i want to send a new message
	When Message: i fill out the form and send the message
	Then Message: i see that there is no error message
