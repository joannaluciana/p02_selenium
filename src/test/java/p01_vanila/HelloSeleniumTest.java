package p01_vanila;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class HelloSeleniumTest {
    private static WebDriver driver;

    @BeforeAll
    public static void warmup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + "/tools/webdrivers/chromedriver");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        driver = new ChromeDriver();
    }

    @AfterAll
    public static void cleanup() {
        driver.quit();
    }

    @Test
    void homePageShouldLoad() {
        driver.get("http://the-internet.herokuapp.com");
    }

    @Test
    void homePageShouldLoadAndHaveCorrectTitle() {
    }

    /**
     * Test sprawdzający, czy po otworzeniu strony głównej http://the-internet.herokuapp.com
     * przeglądarka nie przekieruje użytkownika na inną stronę, tj. czy adres pozostanie taki sam
     */
    @Test
    void openingHomepageShouldNotRedirectAnywhere() {
    }

    /**
     * Test sprawdzający, czy na stronie głównej jest poprawny tytuł 'Welcome to the-internet'
     * tj. nagłówek na stronie o takiej zawartości
     */
    @Test
    void homePageShouldHaveProperContentTitle() {
    }

    /**
     * Test sprawdzający, czy istnieje link do "Form Authentication" i czy naciśnięcie go
     * otwiera poprawną stronę
     */
    @Test
    void formAuthenticationLink_shouldBePresentAndRouteToCorrectPage() {
    }

    /**
     * Test sprawdzający, czy istnieje na stronie wstążka z napisem 'Fork me on Github'
     * oraz czy naciśnięcie jej przenosi na stronę projektu na Githubie
     */
    @Test
    void forkMeOnGithubRibbon_shouldBePresentAndRouteToCorrectPage() {
    }


}