package TestingPages;

import Pages.logInPage;
import Pages.mainShoppingPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class facebookLinkedInTwitterTest extends BaseClass{

    logInPage logInPage=new logInPage(driver);

    mainShoppingPage mainShoppingPage=new mainShoppingPage(driver);

    @Before
    public void setUp()  {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void facebookTestLink() {

        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        mainShoppingPage.setFacebookLinkClick();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue("Pages URL does not match",driver.getCurrentUrl().equals("https://www.facebook.com/saucelabs"));
    }

    @Test
    public void linkedInTestLink() throws InterruptedException {
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        Thread.sleep(2000);
        logInPage.clickOnLogInButton();
        Thread.sleep(2000);
        mainShoppingPage.setLinkedInLinkClick();
        Thread.sleep(2000);
        String curentURL=driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        String actualURL="https://www.linkedin.com/authwall?trk=bf&trkInfo=AQEBre1ZB1ChHQAAAYYXHZSgmvf7PV2A6sifIuusnkfdyDltcac4ae4pYLstDNRDHt7BP-I4qFIdXEYM6qIOpmqVHLyOcgrlHFEbRqlbi1mtWaVfnImeuM1xuPTAWq8XlBUJpVQ=&original_referer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fsauce-labs%2F";
        Assert.assertTrue("Pages URL does not match",curentURL.equals(actualURL));
    }

    @Test
    public void twitterLinkTest() {
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        mainShoppingPage.setTwitterLinkClick();
        System.out.println(driver.getCurrentUrl());
        String curentURL=driver.getCurrentUrl();
        String twitterURL="https://twitter.com/saucelabs";
        Assert.assertTrue("Pages URL does not match",curentURL.equals(twitterURL));
    }

}
