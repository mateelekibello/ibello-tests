@full-test @language
Feature: Test for changing language

	Scenario: Language selection
		Given Demo: i open the homepage
		When Demo: i select the language
		Then Demo: language is changed
