package serenity.steps.serenity;


import serenity.pages.LoginPage;
import serenity.pages.MyAccountPage;
import serenity.pages.ViewBillPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps_NewEra extends ScenarioSteps {

    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ViewBillPage viewBillPage;
   


    @Step
	public void login(String UserName, String Password) {
		loginPage.login(UserName, Password);
		
		
	}
    @Step
	public void is_on_the_Login_page() {
		loginPage.open();
		
		
	}
    @Step
	public void My_Account_Screen_is_Displayed() {
		myAccountPage.MyAccountText_is_Displayed();
		
	}
    @Step
	public void view_bill_page_is_displayed() {
		myAccountPage.navigateTo_ViewBill();		
		
	}
	public void Compare_URL(String uRL) {
		viewBillPage.Verify_View_Bill_URL(uRL);
		
	}
	public void is_on_View_Bill_Page() {
		viewBillPage.Verify_bill_Amount_Text();
		
	}
	public void ViewBill_Amount_is_Shown_in_Pences() {
		viewBillPage.Verify_bill_Amount_Text_is_2decimal_long();
		
	}
	public void Verify_tile_with_expected_value(int tileNumber, String tileName) {
		myAccountPage.Verify_tile_text(tileNumber, tileName);	
		
	}
}