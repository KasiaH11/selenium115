package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
    @FindBy(id = "sumitMessage")
    WebElement sendButton;

    @FindBy(id = "id_contact")
    WebElement selector;

    @FindBy(className = "alert-danger")
    WebElement alert;

    public ContactUsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickOnSendButton() {
        sendButton.click();
    }

    public void acivateSelector() {
        Select activatedSelector = new Select(selector);
    }

        public boolean checkThatAlertIsDisplays() {
        return alert.isDisplayed();
        }

}
