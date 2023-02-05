package TestingPages;

import Pages.*;
import org.junit.Before;
import org.junit.Test;

public class shoppingPageTest extends BaseClass{
    
    mainShoppingPage mainShoppingPage=new mainShoppingPage(driver);
    logInPage logInPage=new logInPage(driver);

    cartPage cartPage=new cartPage(driver);

    checkoutPage checkoutPage =new checkoutPage(driver);

    checkoutOverviewPage checkoutOverviewPage=new checkoutOverviewPage(driver);

    checkoutCompletePage checkoutCompletePage=new checkoutCompletePage(driver);


    @Before
    public void setUp()  {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testOfShoppingProducts() throws InterruptedException {

        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        mainShoppingPage.setAddBoltTshirtButtonToCart();
        mainShoppingPage.cartOfAddedProducts();
        cartPage.setCheckoutButton();
        checkoutPage.enterFirstName("Milos");
        checkoutPage.enterLastName("Soldatovic");
        checkoutPage.enterPostZipCode("11000");
        checkoutPage.continueButtonClick();
        checkoutOverviewPage.setFinishButton();
        checkoutCompletePage.messageForSuccessfullyShopping();
        Thread.sleep(3000);



    }


}
