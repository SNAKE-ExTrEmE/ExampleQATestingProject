package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logInPage {
    public WebDriver driver;

    public By userNameInputField = By.id("user-name");

    public By passwordInputField = By.id("password");

    public By logInButton = By.id("login-button");




    public logInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String textToEnterToUserNameInputField) {
        driver.findElement(userNameInputField).sendKeys(textToEnterToUserNameInputField);
    }

    public void enterPassword(String textToEnterToPasswordInputField) {
        driver.findElement(passwordInputField).sendKeys(textToEnterToPasswordInputField);
    }

    public void clickOnLogInButton() {
        driver.findElement(logInButton).click();
    }



}

