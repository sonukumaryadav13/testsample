package serenity.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.steps.serenity.EndUserSteps_NewEra;

public class DefinitionSteps_NewEra {

    @Steps
    EndUserSteps_NewEra User;
    
    @Given("^user is logged in as with these credentials, username: \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_is_logged_in_as_with_these_credentials_username_and_password(String UserName, String PassWord) throws Throwable {
    	User.login(UserName, PassWord);       
    }
    
    @Given("^user is on Testserver \"([^\"]*)\"$")
    public void user_is_on_Testserver(String arg1) throws Throwable {
        User.is_on_the_Login_page();
    }

    @Given("^My account screen is displayed$")
    public void my_account_screen_is_displayed() throws Throwable {
        User.My_Account_Screen_is_Displayed();
        
    }
    
    @Given("^there is an agreed URL structure$")
    public void there_is_an_agreed_URL_structure() throws Throwable {
       }
    
    @When("^a customer visits the view bill page$")
    public void a_customer_visits_the_view_bill_page() throws Throwable {
    	User.view_bill_page_is_displayed();
    }
    
    @Then("^the URL is eonenergy\\.com/\"([^\"]*)\"- not eonenergy\\.com/ViewBill$")
    public void the_URL_is_eonenergy_com_not_eonenergy_com_ViewBill(String URL) throws Throwable {
        User.Compare_URL(URL);
    }
 
    @Given("^As a fixed direct debit customer$")
    public void as_a_fixed_direct_debit_customer() throws Throwable  {
    }
    
    @When("^I view my next direct debit amount$")
    public void i_view_my_next_direct_debit_amount(){
    	User.is_on_View_Bill_Page();
    	
    }
    
    @Then("^show me the amount including pounds and pence$")
    public void show_me_the_amount_including_pounds_and_pence_ie_XX_XX() throws Throwable {
    	User.ViewBill_Amount_is_Shown_in_Pences();
           	
    }
    
    @Given("^that I am a \"([^\"]*)\"$")
    public void that_I_am_a(String Customer) throws Throwable {
    	System.out.println("Customer type is: "+Customer);
    	 
    }
    
    @Then("^I am shown \"([^\"]*)\" the Your Account page$")
	public void i_am_shown_the_Your_Account_page(String TileView) throws Throwable {
		System.out.println("My Account tile view is: "+TileView);
	}
    
    @Then("^Tile (\\d+) is \"([^\"]*)\"$")
    public void tile_is(int TileNumber, String TileName) throws Throwable {
    	User.Verify_tile_with_expected_value(TileNumber, TileName);

    }
    
    
}
