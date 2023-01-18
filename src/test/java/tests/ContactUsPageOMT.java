package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactUsPage;
import pages.TopMenuPage;

public class ContactUsPageOMT {

    private static WebDriver driver;
    private static ContactUsPage contactUsPage;
    private static TopMenuPage topMenuPage;

    @BeforeAll
    public static void setUp(){
        driver=new ChromeDriver();
        driver.navigate().to("http://automationpractice.pl/index.php");
        contactUsPage = new ContactUsPage(driver);
        topMenuPage = new TopMenuPage(driver);


    }
    @Test
    public void shouldNotAllowToSendEmptyContactUsForm(){
        topMenuPage.clickOnContactLink();
        contactUsPage.clickOnSendButton();
        Assertions.assertTrue(contactUsPage.checkThatAlertIsDisplays());

    }

    @AfterAll
    public static void tearDow(){
        driver.close();

    }
}
