@full-test @language
Feature: Test for changing language

	Scenario: Language selection
		Given Language: i am on homepage
		When Language: i select the language
		Then Language: language is changed
