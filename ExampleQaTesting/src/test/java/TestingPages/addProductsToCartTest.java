package TestingPages;

import Pages.mainShoppingPage;
import Pages.logInPage;
import Pages.cartPage;
import org.junit.Before;
import org.junit.Test;

public class addProductsToCartTest extends BaseClass{

    cartPage cartPage =new cartPage(driver);
    logInPage logInPage=new logInPage(driver);
    mainShoppingPage mainShoppingPage =new mainShoppingPage(driver);

    @Before
    public void setUp()  {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testOfAddingProductsToTheCart() throws InterruptedException {

        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        Thread.sleep(1000);
        mainShoppingPage.setAddBoltTshirtButtonToCart();
        Thread.sleep(1000);
        cartPage.getNameOfAddedBoltShirt();
        Thread.sleep(1000);




    }


}
