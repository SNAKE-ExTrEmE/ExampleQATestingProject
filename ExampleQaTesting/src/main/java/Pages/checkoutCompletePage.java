package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutCompletePage {

    public WebDriver driver;

    public By backHomeButton=By.id("back-to-products");

    public By completeHeaderMessageForSuccessfullyShopping=By.id("checkout_complete_container");

    public checkoutCompletePage(WebDriver driver) {
        this.driver=driver;
    }

    public void setBackHomeButton(){
        driver.findElement(backHomeButton).click();
    }

    public String messageForSuccessfullyShopping(){
        return driver.findElement(completeHeaderMessageForSuccessfullyShopping).getText();
    }

}
