package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainShoppingPage {

    public WebDriver driver;

    public By addBoltTshirtButtonToCart =By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    public By removeBoltTshirtButtonFromCart=By.id("remove-sauce-labs-bolt-t-shirt");

    public By addSauceLabsBackpackToCart=By.id("add-to-cart-sauce-labs-backpack");

    public By removeSauceLabsBackpackFromCart=By.id("remove-sauce-labs-backpack");

    public By addSauceLabsBikeLightToCart=By.id("add-to-cart-sauce-labs-bike-light");

    public By removeSauceLabsBikeLightFromCart=By.id("remove-sauce-labs-bike-light");

    public By addSauceLabsFleeceJacketToCart=By.id("add-to-cart-sauce-labs-fleece-jacket");

    public By removeSauceLabsFleeceJacketFromCart=By.id("remove-sauce-labs-fleece-jacket");

    public By addSauceLabsOnesieToCart=By.id("add-to-cart-sauce-labs-onesie");

    public By removeSauceLabsOnesieFromCart=By.id("remove-sauce-labs-onesie");

    public By addTestallTheThingsTShirtRedToCart=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public By removeTestallTheThingsTShirtRedFromCart=By.id("remove-test.allthethings()-t-shirt-(red)");

    public By cartOfAddedProductsButton=By.className("shopping_cart_link");

    public By twitterLinkClick=By.xpath("//a[@href='https://twitter.com/saucelabs']");

    public By linkedInLinkClick=By.xpath("//*[@href='https://www.linkedin.com/company/sauce-labs/']");

    public By facebookLinkClick=By.xpath("//a[@href='https://www.facebook.com/saucelabs']");

    public void setFacebookLinkClick(){
        driver.findElement(facebookLinkClick).click();
        driver.navigate().to("https://www.facebook.com/saucelabs");
    }

    public void setLinkedInLinkClick(){
        driver.findElement(linkedInLinkClick).click();
        driver.navigate().to("https://www.linkedin.com/authwall?trk=bf&trkInfo=AQFyrAH4V02ylwAAAYYXNNHYirV_fx_11FlShebZtSYpkHw3ABPQrwDhpuv6UQ1PsSJXikPVAIZcxXd6yU1yk-u5618fzjvdyzX5jUHxoIfW2RC37_1P-VxYSwsjyD4ec4HwgFY=&original_referer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fsauce-labs%2F");
    }

    public void setTwitterLinkClick(){
        driver.findElement(twitterLinkClick).click();
        driver.navigate().to("https://twitter.com/saucelabs");
    }


   public mainShoppingPage(WebDriver driver){
       this.driver=driver;
   }

    public void setAddBoltTshirtButtonToCart(){

       driver.findElement(addBoltTshirtButtonToCart).click();
    }

    public void setRemoveBoltTshirtButtonFromCart(){
       driver.findElement(removeBoltTshirtButtonFromCart).click();
    }

    public void setAddSauceLabsBackpackToCart(){
       driver.findElement(addSauceLabsBackpackToCart).click();
    }

    public void setRemoveSauceLabsBackpackFromCart(){
       driver.findElement(removeSauceLabsBackpackFromCart).click();
    }

    public void setAddSauceLabsBikeLightToCart(){
       driver.findElement(addSauceLabsBikeLightToCart).click();
    }

    public void setRemoveSauceLabsBikeLightFromCart(){
       driver.findElement(removeSauceLabsBikeLightFromCart).click();
    }

    public void setAddSauceLabsFleeceJacketToCart(){
       driver.findElement(addSauceLabsFleeceJacketToCart).click();
    }

    public void setRemoveSauceLabsFleeceJacketFromCart(){
       driver.findElement(removeSauceLabsFleeceJacketFromCart).click();
    }

    public void setAddSauceLabsOnesieToCart(){
       driver.findElement(addSauceLabsOnesieToCart).click();
    }

    public void setRemoveSauceLabsOnesieFromCart(){
       driver.findElement(removeSauceLabsOnesieFromCart).click();
    }

    public void setAddTestallTheThingsTShirtRedToCart(){
       driver.findElement(addTestallTheThingsTShirtRedToCart).click();
    }

    public void setRemoveTestallTheThingsTShirtRedFromCart(){
       driver.findElement(removeTestallTheThingsTShirtRedFromCart).click();
    }

    public void cartOfAddedProducts(){
       driver.findElement(cartOfAddedProductsButton).click();
    }








}
