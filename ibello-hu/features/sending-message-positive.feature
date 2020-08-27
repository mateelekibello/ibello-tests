@full-test @message @positive
Feature: Feature for sending a message positive test scenario

	Scenario: Sendig message with valid name, valid email, valid subject, valid message
		Given Message positive: i want to send a new message
		Given Message positive: i fill out the form with valid datas
		When Message positive: i send the message
		Then Message positive: i see that message sent successfully
