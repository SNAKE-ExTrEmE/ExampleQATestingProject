package TestingPages;

import Pages.mainShoppingPage;
import Pages.cartPage;
import Pages.logInPage;
import org.junit.Before;
import org.junit.Test;

public class removingProductsFromCartTest extends BaseClass{

    cartPage cartPage =new cartPage(driver);
    logInPage logInPage=new logInPage(driver);
    mainShoppingPage mainShoppingPage =new mainShoppingPage(driver);

    @Before
    public void setUp()  {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testOfRemovingArticalsFromTheCart() throws InterruptedException {

        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        mainShoppingPage.setAddBoltTshirtButtonToCart();
        mainShoppingPage.setRemoveBoltTshirtButtonFromCart();
        mainShoppingPage.cartOfAddedProducts();
        Thread.sleep(3000);


    }

}
