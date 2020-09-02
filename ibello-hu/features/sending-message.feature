@full-test @message
Feature: Sending a test message on ibello.hu

Scenario: Sending message with valid name, no email, valid subject, valid message
	Given Message: i want to send a new message
	When Message: the name will be valid
	And Message: the email will be empty
	And Message: the subject will be valid
	And Message: the message will be valid
	And Message: i fill out the form
	And Message: i send the message
	Then Message: i see 1 error messages

Scenario: Sending message with valid name, invalid email, valid subject, valid message
	Given Message: i want to send a new message
	When Message: the name will be valid
	And Message: the email will be invalid
	And Message: the subject will be valid
	And Message: the message will be valid
	And Message: i fill out the form
	And Message: i send the message
	Then Message: i see 1 error messages

Scenario: Sending message with valid name, invalid email, valid subject, empty message
	Given Message: i want to send a new message
	When Message: the name will be valid
	And Message: the email will be invalid
	And Message: the subject will be valid
	And Message: the message will be empty
	And Message: i fill out the form
	And Message: i send the message
	Then Message: i see 2 error messages

Scenario: Sending message with valid name, invalid email, empty subject, valid message
	Given Message: i want to send a new message
	When Message: the name will be valid
	And Message: the email will be invalid
	And Message: the subject will be empty
	And Message: the message will be valid
	And Message: i fill out the form
	And Message: i send the message
	Then Message: i see 2 error messages

Scenario: Sending message with valid data
	Given Message: i want to send a new message
	When Message: the name will be valid
	And Message: the email will be valid
	And Message: the subject will be valid
	And Message: the message will be valid
	And Message: i fill out the form
	And Message: i send the message
	Then Message: i see that sending the message was successfull

Scenario: Sending message with valid name, valid email, valid subject, empty message
	Given Message: i want to send a new message
	When Message: the name will be valid
	And Message: the email will be valid
	And Message: the subject will be valid
	And Message: the message will be empty
	And Message: i fill out the form
	And Message: i send the message
	Then Message: i see 1 error messages

Scenario: Sending message with valid name, valid email, empty subject, valid message
	Given Message: i want to send a new message
	When Message: the name will be valid
	And Message: the email will be valid
	And Message: the subject will be empty
	And Message: the message will be valid
	And Message: i fill out the form
	And Message: i send the message
	Then Message: i see 1 error messages

Scenario: Sending message with empty name, invalid email, valid subject, valid message
	Given Message: i want to send a new message
	When Message: the name will be empty
	And Message: the email will be invalid
	And Message: the subject will be valid
	And Message: the message will be valid
	And Message: i fill out the form
	And Message: i send the message
	Then Message: i see 2 error messages

Scenario: Sending message with empty name, valid email, valid subject, valid message
	Given Message: i want to send a new message
	When Message: the name will be empty
	And Message: the email will be valid
	And Message: the subject will be valid
	And Message: the message will be valid
	And Message: i fill out the form
	And Message: i send the message
	Then Message: i see 1 error messages
