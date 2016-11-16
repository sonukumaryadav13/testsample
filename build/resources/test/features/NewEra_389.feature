Feature: My Account tiles
As a Sitecore user 
I want to be able to select different views of the Your Account page 
So that different payment types/account states have different default datasources
 
	Background:
	Given user is on Testserver "http://sm10372/legacylogin"
  
    
		Scenario: OD unmonitored card payment logged on customer 
		Given that I am a "smart OD unmonitored card payment customer"
		And user is logged in as with these credentials, username: "sarahsmithson94-3" and password "password1" 
		And My account screen is displayed 
		When the page has loaded
		Then I am shown "the smart OD version of" the Your Account page
		And Tile 1 is "bill"
		And Tile 2 is "Your payments"
		And Tile 3 is "Check your tariff"
		And Tile 4 is "Your energy use"
		And Tile 5 is "Get a smart meter"
		And Tile 6 is "Your Rewards"
		And Tile 7 is "Manage your details"		
		Then close the browser



		Scenario: smart PayPlus logged on customer
		Given that I am a "smart PayPlus customer"
		And user is logged in as with these credentials, username: "divemandy-1" and password "password1"  
		And My account screen is displayed 
		When the page has loaded
		Then I am shown "the smart OD version of" the Your Account page
		And Tile 1 is "bill"
		And Tile 2 is "Your payments"
		And Tile 3 is "Check your tariff"
		And Tile 4 is "Your energy use"
		And Tile 5 is "Get a smart meter"
		And Tile 6 is "Your Rewards"
		And Tile 7 is "Manage your details"
		Then close the browser