package TestingPages;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Pages.logInPage;

public class logInPageTest extends BaseClass {





        logInPage LogInPage=new logInPage(driver);



    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testLogInWithWrongDataEntered() throws InterruptedException {
        LogInPage.enterUserName("Milos123");
        LogInPage.enterPassword("123456");
        LogInPage.clickOnLogInButton();
        String curentUrl=driver.getCurrentUrl();
        String newUrl="https://www.saucedemo.com/inventory.html";
        Assert.assertTrue("Epic sadface: Username and password do not match any user in this service",curentUrl.equals(newUrl));
        Thread.sleep(5000);

    }

    @Test
    public void testLogInWithValidUsernameFalsePassword() throws InterruptedException {

        LogInPage.enterUserName("standard_user");
        LogInPage.enterPassword("852741L");
        LogInPage.clickOnLogInButton();
        String c=driver.getCurrentUrl();
        String n="https://www.saucedemo.com/inventory.html";
        Assert.assertTrue("Epic sadface: Username and password do not match any user in this service",c.equals(n));
        Thread.sleep(5000);
    }

    @Test
    public void testLogInWithBadUserNameAndGoodPasswordEntered() throws InterruptedException{
        LogInPage.enterUserName("PeraPeric");
        LogInPage.enterPassword("secret_sauce");
        LogInPage.clickOnLogInButton();
        String curentURL=driver.getCurrentUrl();
        String actualURL="https://www.saucedemo.com/inventory.html";
        Assert.assertTrue("Epic sadface: Username and password do not match any user in this service",curentURL.equals(actualURL));
        Thread.sleep(5000);
    }

    @Test
    public void testLogInWithEmptyDataEntered() throws InterruptedException{
        LogInPage.enterUserName("");
        LogInPage.enterPassword("");
        LogInPage.clickOnLogInButton();
        String curentURL=driver.getCurrentUrl();
        String actualURL="https://www.saucedemo.com/inventory.html";
        Assert.assertTrue("Epic sadface: Username is required",curentURL.equals(actualURL));
        Thread.sleep(5000);
    }

    @Test
    public void testLogInWithValidUsernameAndPasswordEntered() throws InterruptedException {

        LogInPage.enterUserName("standard_user");
        LogInPage.enterPassword("secret_sauce");
        LogInPage.clickOnLogInButton();
        String curentURL=driver.getCurrentUrl();
        String actualURL="https://www.saucedemo.com/inventory.html";
        Assert.assertTrue("Epic sadface: Username and password do not match any user in this service",curentURL.equals(actualURL));
        Thread.sleep(5000);


    }

}


