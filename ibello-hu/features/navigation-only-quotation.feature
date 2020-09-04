@full-test @navigation @nav-quotation
Feature: Testing quotation on ibello.hu

Scenario: Testing quotation on ibello.hu #1
	Given navigation quotation: test init
	And navigation quotation: i am on homepage
	When navigation quotation: from homepage i navigate to services page
	Then navigation quotation: i am on services page
	When navigation quotation: i request quotation for online automated test
	Then navigation quotation: i am on quotation page and online automated test is selected
	When navigation quotation: i navigate directly to services page using the navbar
	Then navigation quotation: i am on services page
	When navigation quotation: i request quotation for automated tests
	Then navigation quotation: i am on quotation page and automated tests is selected
	When navigation quotation: i navigate directly to services page using the navbar
	Then navigation quotation: i am on services page
	When navigation quotation: i request quotation for test framework
	Then navigation quotation: i am on quotation page and test framework is selected
	When navigation quotation: i navigate directly to services page using the navbar
	Then navigation quotation: i am on services page
	When navigation quotation: i request quotation for consultancy
	Then navigation quotation: i am on quotation page and consultancy is selected
	When navigation quotation: i navigate directly to services page using the navbar
	Then navigation quotation: i am on services page
	When navigation quotation: i request quotation for dev and test training
	Then navigation quotation: i am on quotation page and dev and test training is selected
	When navigation quotation: i navigate directly to services page using the navbar
	Then navigation quotation: i am on services page
