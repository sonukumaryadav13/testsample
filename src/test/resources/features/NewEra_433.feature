Feature: URL change for Bill
As E.ON 
We want the URL of the bill pages to follow the agreed structure
So that links from fulfilment and external communications work 
 
	Background:
	Given user is on Testserver "http://sm10372/legacylogin"
	Given user is logged in as with these credentials, username: "kzaki1973" and password "password1"
	And My account screen is displayed
 
		Scenario: View Bill URL
    	Given there is an agreed URL structure 
    	When a customer visits the view bill page
    	Then the URL is eonenergy.com/"bill"- not eonenergy.com/ViewBill
    	

    
    

    






