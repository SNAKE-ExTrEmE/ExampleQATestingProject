package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutOverviewPage {

    public WebDriver driver;

    public By finishButton=By.id("finish");

    public By cancelButton=By.id("cancel");

    public checkoutOverviewPage(WebDriver driver) {
        this.driver=driver;
    }

    public void setFinishButton(){
        driver.findElement(finishButton).click();
    }

    public void setCancelButton(){
        driver.findElement(cancelButton).click();
    }

}
