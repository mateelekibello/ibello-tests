@full-test @navigation @nav-order
Feature: Testing order process on ibello.hu

Scenario: Testing order process on ibello.hu #1
	Given navigation order: test init
	And navigation order: i am on homepage
	When navigation order: from homepage header i navigate to product page
	Then navigation order: i am on product page
	When navigation order: from product page i order an outpost product
	Then navigation order: i am on order page and outpost is selected
	When navigation order: i navigate directly to product page using the navbar
	Then navigation order: i am on product page
	When navigation order: from product page i order a sentinel product
	Then navigation order: i am on order page and sentinel is selected
	When navigation order: i navigate directly to product page using the navbar
	Then navigation order: i am on product page
	When navigation order: from product page i order a hunter product
	Then navigation order: i am on order page and hunter is selected
	When navigation order: i navigate directly to product page using the navbar
	Then navigation order: i am on product page
	When navigation order: from product page i order a master hunter product
	Then navigation order: i am on order page and master hunter is selected
	When navigation order: i navigate directly to product page using the navbar
	Then navigation order: i am on product page
