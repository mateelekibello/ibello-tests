@full-test @language
Feature: Test for changing language

	Scenario: Language selection
		Given Language: i open the homepage
		When Language: i select the language
		Then Language: language is changed
