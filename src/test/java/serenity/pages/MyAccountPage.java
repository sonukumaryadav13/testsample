package serenity.pages;


import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;


//@DefaultUrl("http://sm10372/legacylogin")
public class MyAccountPage extends PageObject {

    @FindBy(className="flexbox-self-align-middle")
    private WebElementFacade MyAccountText;
    			
    @FindBy(xpath="html/body/div[1]/header/div/nav[2]/button")
    private WebElementFacade YourAccountMenu;
    
    @FindBy(xpath="html/body/div[1]/header/div/nav[2]/div/ul/li[3]/a")
    private WebElementFacade Menu_ViewBill;
    
    @FindBy(xpath="html/body/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div/h2")
    private WebElementFacade Tile1Text;
    
    @FindBy(xpath="html/body/div[1]/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div/h2")
    private WebElementFacade Tile2Text;
    
    @FindBy(xpath="html/body/div[1]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/div/h2")
    private WebElementFacade Tile3Text;
    
    @FindBy(xpath="html/body/div[1]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div/div/div/h2")
    private WebElementFacade Tile4Text;
    
    @FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div[1]/div/div[2]/div/h2")
    private WebElementFacade Tile5Text;
    
    @FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[1]/div/div/div/h2")
    private WebElementFacade Tile6Text;
    
    @FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[2]/div/div/div/h2")
    private WebElementFacade Tile7Text;
    
    public void MyAccountText_is_Displayed() {
		MyAccountText.isDisplayed();
		
	}

	public void navigateTo_ViewBill() {
		YourAccountMenu.click();
		Menu_ViewBill.click();
		String s = getDriver().getCurrentUrl();
	}

	public void Verify_tile_text(int tileNumber, String tileName) {
		String ExpectedValue = null;
		if(tileNumber== 1){
			ExpectedValue = Tile1Text.getText();
					
		}else if(tileNumber== 2){
			ExpectedValue = Tile2Text.getText();
					
		}else if(tileNumber== 3){
			ExpectedValue = Tile3Text.getText();
					
		}else if(tileNumber== 4){
			ExpectedValue = Tile4Text.getText();
					
		}else if(tileNumber== 5){
			ExpectedValue = Tile5Text.getText();
					
		}else if(tileNumber== 6){
			ExpectedValue = Tile6Text.getText();
					
		}else if(tileNumber== 7){
			ExpectedValue = Tile7Text.getText();
					
		}
		else{
			System.out.println("Could not find the tile number");
		}
		
		boolean retval = ExpectedValue.contains(tileName);
		assertThat(retval).isEqualTo(true);
		
		
	}  
}