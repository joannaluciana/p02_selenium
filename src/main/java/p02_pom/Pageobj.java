package p02_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageobj {

    /***
     * Klasa modelująca stronę http://the-internet.herokuapp.com/login
     */
    private static final String LOGIN_PAGE_URL = "http://x-kom.pl";
    static final String CORRECT_USERNAME = "tomsmith";
    static final String CORRECT_PASSWORD = "SuperSecretPassword";

    static final String INCORRECT_USERNAME = "ffddff";
    static final String INCORRECT_PASSWORD = "Sdfdfdfdf";

    private static final By SELECTOR_LOGIN_BUTTON = By.cssSelector("#login > button");
    private static final By SELECTOR_USER_NAME_INPUT= By.id("username");
    private static final By SELECTOR_PASSWORD_INPUT= By.id("password");

    static final By SELECTOR_FLASH = By.id("flash");

    private WebDriver driver;

    public Pageobj(WebDriver driver) {

        this.driver = driver;
        driver.get(LOGIN_PAGE_URL);
    }

public Pageobjsecure loginWithCorrectCredentials() {
        driver.findElement(SELECTOR_LOGIN_BUTTON).sendKeys(CORRECT_USERNAME);
        driver.findElement(SELECTOR_PASSWORD_INPUT).sendKeys(CORRECT_PASSWORD);

        submitForm();

    return new Pageobjsecure(driver, false);
}

    public void loginWithInCorrectCredentials() {
        driver.findElement(SELECTOR_LOGIN_BUTTON).sendKeys(INCORRECT_USERNAME);
        driver.findElement(SELECTOR_PASSWORD_INPUT).sendKeys(INCORRECT_PASSWORD);

        submitForm();

    }

public void submitForm() {

        driver.findElement(SELECTOR_LOGIN_BUTTON).submit();
}
public boolean isPasswordIncorrectMessageDisplayed() {
    WebElement flash = driver.findElement(SELECTOR_FLASH);

    String flashText = flash.getText();
    return flash.isDisplayed() &&
            flashText
                    .toLowerCase()
                    .contains("Your password is invalid!".toLowerCase());
}

public boolean isUserIncorrectMsgDisplay() {
        WebElement flash = driver.findElement(SELECTOR_FLASH);
        String flashText = flash.getText();
        return flash.isDisplayed() &&
                flashText.toLowerCase()
                        .contains("Your username is invalid!".toLowerCase());
}

    }

