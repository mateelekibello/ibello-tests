@full-test @navigation
Feature: Feature

Scenario: Scenario #1
	Given navigation: test init
	And navigation: i am on homepage
	When navigation: i navigate to product page
	Then navigation: i am on product page
	When navigation: i navigate back to homepage
	Then navigation: i am on homepage
	When navigation: i navigate to services page
	Then navigation: i am on services page
	When navigation: i navigate back to homepage
	Then navigation: i am on homepage
	When navigation: i navigate to about page
	Then navigation: i am on about page
	When navigation: i navigate back to homepage
	Then navigation: i am on homepage
	When navigation: i navigate to support page
	Then navigation: i am on support page
	When navigation: i navigate back to homepage
	Then navigation: i am on homepage
