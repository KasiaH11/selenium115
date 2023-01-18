import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;


    @BeforeAll
    public static void setDriver() {
    driver = new ChromeDriver();
    //driver.manage()
        driver.navigate().to("http://automationpractice.pl/index.php");
        private static WebDriver driver;


        }
    @AfterAll
    public static void tearDawn () {
        driver.close();
    }
}
