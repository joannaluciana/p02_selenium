package p02_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static p02_pom.Pageobj.SELECTOR_FLASH;


public class Pageobjsecure {

    private static final String LOGIN_PAGE_URL = "http://the-internet.herokuapp.com/secure";
    private WebDriver driver;

    public Pageobjsecure(WebDriver driver, boolean reload) {

        this.driver = driver;


    }

    public boolean isSuccesfullLoginMsgDisplayed(){

        WebElement flash = driver.findElement(SELECTOR_FLASH);
        String flashText = flash.getText();
        if (!flash.isDisplayed()){
        return false;
        }

        String flashTextInLowerCase = flashText.toLowerCase();
        String expectedTextInElementToLowerCase = "You logged into a secure area!".toLowerCase();
        return flashTextInLowerCase.contains(expectedTextInElementToLowerCase.toLowerCase());
    }



}
