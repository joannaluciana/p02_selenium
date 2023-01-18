package p02_pom.heroku;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import p02_pom.Pageobj;
import static org.junit.jupiter.api.Assertions.*;
public class LoginPageTest {

    private static WebDriver driver;
    private Pageobj loginPageTest;

    @BeforeAll
    public static void warmup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.home") + "/tools/webdrivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "");
        driver=new ChromeDriver();
    }

    @AfterAll
    public static void cleanup() {
        driver.quit();
    }

    @BeforeEach

    void prepareTest() {
        loginPageTest = new Pageobj(driver);
    }
    @Test

    void submit_incorrectCredentials_displaysIncorrectUsernameMsg() {
    loginPageTest.lo;
    assertTrue(loginPageTest.isUserIncorrectMsgDisplay());
    }





}
