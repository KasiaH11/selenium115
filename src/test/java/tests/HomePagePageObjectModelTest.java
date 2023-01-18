package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class HomePagePageObjectModelTest {
    private static WebDriver driver;
    private static HomePage homePage;

    @BeforeAll
    public static void setDriver(){
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.pl/index.php");
        homePage - new HomePage(driver);


    }

    @Test
    public void shouldBeVisibleTextOnHomePage() {
        Assertions.assertEquals("No featured products at this time.",homePage.getTextFromAlert());
    }




        @AfterAll
    public static void setDriver(){
        driver.close();
    }
}
