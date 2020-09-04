@full-test @navigation @nav
Feature: Testing navigation on ibello.hu

Scenario: Testing navigation on ibello.hu #1
	Given navigation: test init
	And navigation: i am on homepage
	When navigation: from homepage header i navigate to product page
	Then navigation: i am on product page
	When navigation: from product page i navigate to order page
	Then navigation: i am on order page and no product is selected
	When navigation: i navigate directly to homepage using the navbar
	Then navigation: i am on homepage
	When navigation: from homepage header i navigate to services page
	Then navigation: i am on services page
	When navigation: from services page i request guotation
	Then navigation: i am on quotation page without selected service
	When navigation: i navigate directly to homepage using the navbar
	Then navigation: i am on homepage
	When navigation: from homepage i navigate to interest page
	Then navigation: i am on interest page
	When navigation: from interest page i navigate to installation documentation page
	Then navigation: i am on installation documentation page
	When navigation: i navigate directly to about page using the navbar
	Then navigation: i am on about page
	When navigation: i navigate directly to services page using the navbar
	Then navigation: i am on services page
	When navigation: i navigate directly to product page using the navbar
	Then navigation: i am on product page
	When navigation: from product page header i navigate to interest page
	Then navigation: i am on interest page
	When navigation: i navigate directly to homepage using the navbar
	Then navigation: i am on homepage
	When navigation: from homepage i navigate to support page
	Then navigation: i am on support page
	When navigation: from support page i navigate to documentations page
	Then navigation: i am on documentations page
	When navigation: from documentations page i navigate to change log page
	Then navigation: i am on changelog page
	When navigation: from changelog page i navigate to documentations page
	Then navigation: i am on documentations page
	When navigation: i navigate directly to support page using the navbar
	Then navigation: i am on support page
	When navigation: from support page i navigate to change log page
	Then navigation: i am on changelog page
	When navigation: i navigate directly to support page using the navbar
	Then navigation: i am on support page
	When navigation: i navigate directly to homepage using the navbar
	Then navigation: i am on homepage
	When navigation: from homepage i navigate to product page
	Then navigation: i am on product page
	When navigation: i navigate directly to homepage using the navbar
	Then navigation: i am on homepage
	When navigation: from homepage i navigate to services page
	Then navigation: i am on services page
	When navigation: i navigate directly to homepage using the navbar
	Then navigation: i am on homepage
	When navigation: from homepage i navigate to about page
	Then navigation: i am on about page
	When navigation: i navigate directly to homepage using the navbar
	Then navigation: i am on homepage
