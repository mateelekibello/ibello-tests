@full-test @message @positive
Feature: Decision table for sending a message test scenarios

	Scenario: Sendig message with valid name, valid email, valid subject, valid message
		Given Message: i want to send a new message
		Given Message: i fill out the form with valid datas
		When Message: i send the message
		Then Message: i see that message sent successfully
