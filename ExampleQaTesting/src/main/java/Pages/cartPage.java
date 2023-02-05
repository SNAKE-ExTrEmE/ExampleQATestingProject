package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {

    public WebDriver driver;

    public cartPage(WebDriver driver){
        this.driver=driver;
    }

    public By continueShoppingButton=By.id("continue-shopping");

    public By checkoutButton=By.id("checkout");

    public By nameOfBoldTshirtAddedInCart=By.id("item_1_title_link");

    public String getNameOfAddedBoltShirt(){
        return driver.findElement(nameOfBoldTshirtAddedInCart).getText();
    }


    public void setContinueShoppingButton(){
        driver.findElement(continueShoppingButton).click();
    }

    public void setCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }

}

