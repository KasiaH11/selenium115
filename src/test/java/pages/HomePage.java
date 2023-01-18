package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(className = "alert-info")
    WebElement alert;

 public HomePage(WebDriver driver){
     PageFactory.initElements(driver,this);
 }

    public String getTextFromAlert(){
       return alert.getText();
    }
}
