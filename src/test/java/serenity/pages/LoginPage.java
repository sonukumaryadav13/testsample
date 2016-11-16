package serenity.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

//@DefaultUrl("http://sm10372/legacylogin")
public class LoginPage extends PageObject {

    @FindBy(id="Username")
    private WebElementFacade UserName;

    @FindBy(id="Password")
    private WebElementFacade PassWord;
    
    @FindBy(xpath="html/body/div[1]/div/div/form/input[4]")
    private WebElementFacade LoginButton;

    
    public void login(String Username, String Password){
    //	LoginText.isDisplayed();
    	UserName.type(Username);
    	PassWord.type(Password);
    	LoginButton.click();    	
    }
    
 

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}