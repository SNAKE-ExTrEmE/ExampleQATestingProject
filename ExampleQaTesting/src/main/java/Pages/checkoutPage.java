package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {

    public WebDriver driver;

    public By firstNameInputFeald=By.id("first-name");

    public By lastNameInputFeald=By.id("last-name");

    public By zipPostalCodeInputFeald=By.id("postal-code");

    public By continueButton=By.id("continue");

    public By cancelButton=By.id("cancel");


    public checkoutPage(WebDriver driver) {
        this.driver = driver;
    }


    public void enterFirstName(String textToEnterToFirstNameInputField){
        driver.findElement(firstNameInputFeald).sendKeys(textToEnterToFirstNameInputField);
    }
    public void enterLastName(String textToEnterToLastNameInputField){
        driver.findElement(lastNameInputFeald).sendKeys(textToEnterToLastNameInputField);
    }
    public void enterPostZipCode(String textToEnterToPostZipInputField){
        driver.findElement(zipPostalCodeInputFeald).sendKeys(textToEnterToPostZipInputField);
    }
    public void continueButtonClick(){
        driver.findElement(continueButton).click();
    }

    public void cancelButtonClick(){
        driver.findElement(cancelButton).click();
    }



}
