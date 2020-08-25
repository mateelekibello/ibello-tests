Feature: Test for changing language

	Scenario: Language selection
		Given Demo: homepage is loaded
		When Demo: select language
		Then Demo: language is changed
