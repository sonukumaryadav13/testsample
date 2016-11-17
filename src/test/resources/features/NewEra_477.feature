Feature: FDD next payment amount needs to always be £XX.XX
As a FDD customer 
I want to see my next direct debit payment amount including the pence 
So I know exactly what I am paying
 
Background:
	Given user is on Testserver "http://sm10372/legacylogin"
	Given user is logged in as with these credentials, username: "kzaki1973" and password "password1"
	And My account screen is displayed
	When a customer visits the view bill page 
  
Scenario: To verify that its correct till 2 decimal point
    Given As a fixed direct debit customer  
    When I view my next direct debit amount 
	Then show me the amount including pounds and pence
	 
	
	
  






