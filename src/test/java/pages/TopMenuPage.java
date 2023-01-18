package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPage {
    @FindBy(id = "contact-link")
    WebElement contactUsLink;

    @FindBy(className = "login")
    WebElement sigInLink;

    public TopMenuPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickOnContactLink(){
        contactUsLink.click();
    }
    public void clickOnSigInLink(){
        sigInLink.click();
    }
}
