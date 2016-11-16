package serenity.pages;


import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;



//@DefaultUrl("http://sm10372/legacylogin")
public class ViewBillPage extends PageObject {

    @FindBy(className="c-card__callout")
    private WebElementFacade BillAmount;
     
  
	public void Verify_View_Bill_URL(String uRL) {
		String URL = getDriver().getCurrentUrl();
    	String[] parts = URL.split("/");
    	URL = parts[3];
    	assertThat(URL).isEqualToIgnoringCase(uRL);
  
	}


	public void Verify_bill_Amount_Text() {
		BillAmount.isDisplayed();
		
	}


	public void Verify_bill_Amount_Text_is_2decimal_long() {
		 String decimal = BillAmount.getText();
	    	String[] parts = decimal.split("\\.");
	    	decimal = parts[1];
	    	assertThat(decimal.length()).isEqualTo(2);
		
	}
   
}