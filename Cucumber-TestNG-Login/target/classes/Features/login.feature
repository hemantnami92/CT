Feature: Sample Test Page

Scenario Outline: Sample Login Page

Given user is already on Login Page
When title of login page is Tours
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page


Examples:
	| username | password |
	| demo  | demo |
		