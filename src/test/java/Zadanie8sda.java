
       // Napisz test:

       import org.junit.jupiter.api.AfterAll;
       import org.junit.jupiter.api.BeforeAll;
       import org.junit.jupiter.api.Test;
       import org.openqa.selenium.By;
       import org.openqa.selenium.WebDriver;
       import org.openqa.selenium.WebElement;
       import org.openqa.selenium.chrome.ChromeDriver;

       import java.util.List;

       //  Wejdź na stronę: https://www.bbc.com.
       // Wypisz w konsoli ilość dostępnych linków na stronie.
       // Wypisz w konsoli ilość dostępnych obrazków na stronie.
       // Wskazówka
      //  Rozwiązanie
      //  Przykładowe rozwiązanie znajdziesz tutaj.
public class Zadanie8sda {

    private static WebDriver driver;

   // @BeforeAll
    //public static void setUp(){
       // driver = new ChromeDriver();
        // driver.manage().window().maximize();
       // driver.navigate().to("https://www.bbc.com");
    }

    @Test
           public void iloscLinkowNaStronie(){
      //  driver = new ChromeDriver();
       // driver.manage().window().maximize();
       // driver.navigate().to("https://www.bbc.com");
       List <WebElement> znalezionyLinki = driver.findElements(By.tagName("a"));
       System.out.println("Ilosc linkow na stronie = "+ znalezionyLinki.size());
       //driver.close();
       // driver.findElement(By.cssSelector(""))
    }


@Test
           public void iloscObrazkowNaStronie(){
  //  driver = new ChromeDriver();
    //driver.navigate().to("https://www.bbc.com");
  //  driver.get("https://www.bbc.com");
   List<WebElement> znalezioneObrazki = driver.findElements(By.tagName("img"));
    System.out.println("Ilosc znalezionych obrazkow = "+ znalezioneObrazki.size());
   // driver.close();
}
@AfterAll
           public static void tearDawn(){
    driver.close();
}
}
