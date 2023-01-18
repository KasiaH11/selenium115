import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest extends BaseTest {

    //private static WebDriver driver;

    // @BeforeAll
    // public static void setDriver() {
    // driver = new ChromeDriver();
    //driver.manage()

    // driver.navigate().to("http://automationpractice.pl/index.php");

}


    @Test
    public void shouldBeVisibleTextOnHomePage() {


        String textInAlert = driver.findElement(By.className("alert")).getText();
        Assertions.assertEquals("No featured products at this time.", textInAlert);


    }

    // @AfterAll
    // public static void tearDown() {
    // driver.close();
}
}
