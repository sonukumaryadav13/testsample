Feature: My Account tiles
As a Sitecore user 
I want to be able to select different views of the your account page 
So that different payment types/account states have different default datasources
 
	Background:
	Given user is on Testserver "http://sm10372/legacylogin"
  
    
		Scenario: OD unmonitored card payment logged on customer 
		Given that I am a "OD unmonitored card payment customer"
		And user is logged in as with these credentials, username: "loooey-1" and password "password1" 
		And My account screen is displayed 
		Then I am shown "the OD version of" the Your Account page
		And Tile 1 is "bill"
		And Tile 2 is "meter readings"
		And Tile 3 is "I want it to Fail"
		And Tile 4 is "Check your tariff"
		And Tile 5 is "Get a smart meter"
		And Tile 6 is "Your Rewards"
		And Tile 7 is "Your energy use"		




		Scenario: PayPlus logged on customer
		Given that I am a " PayPlus logged on customer"
		And user is logged in as with these credentials, username: "jbailey3985-1" and password "password1"  
		And My account screen is displayed 
		Then I am shown "the OD version of" the Your Account page
		And Tile 1 is "bill"
		And Tile 2 is "meter readings"
		And Tile 3 is "Your payments"
		And Tile 4 is "Check your tariff"
		And Tile 5 is "Get a smart meter"
		And Tile 6 is "Your Rewards"
		And Tile 7 is "Your energy use"	
