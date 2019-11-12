Feature: Ibello Demo

Scenario: Scenario #1
	Given I am on the LANDING page
	When I navigate to documentations
	Then I am on the DOCUMENTATIONS page
	When I navigate to landing
	Then I am on the LANDING page
	When I navigate to login
	Then I am on the LOGIN page
	When I log in with valid credentials
	Then I am on the HOME page
	When I navigate to licenses
	Then I am on the LICENSES page
	When I navigate to home
	Then I am on the HOME page
	When I navigate to documentations
	Then I am on the DOCUMENTATIONS page
	When I navigate to home
	Then I am on the HOME page
	When I log out
	Then I am on the LANDING page
	And I am logged out
