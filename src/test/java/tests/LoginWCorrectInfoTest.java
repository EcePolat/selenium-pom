package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.SignupLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginWCorrectInfoTest {

    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test(priority = 1)
    public void homeTest() {

        HeaderPage headerPage = new HeaderPage();

        Assert.assertTrue(headerPage.siteLogo.isDisplayed());

        headerPage.signupLoginButton.click();
    }

    @Test(priority = 2)
    public void LoginTest() {

        SignupLoginPage slpage = new SignupLoginPage();
        Assert.assertTrue(slpage.loginAccountTitle.isDisplayed());

        slpage.loginEmail.sendKeys("eece@gmail.com");
        slpage.password.sendKeys("abcde");
        slpage.loginButton.click();

        HeaderPage headerPage = new HeaderPage();
        Assert.assertTrue(headerPage.userText.isDisplayed());

    }

    @Test(priority = 3)
    public void deleteAccount() {

        HeaderPage headerPage = new HeaderPage();
        SignupLoginPage slpage = new SignupLoginPage();

        Assert.assertTrue(headerPage.userText.isDisplayed());
        headerPage.deleteAccountButton.click();

        Assert.assertTrue(slpage.accountDeletedText.isDisplayed());
    }
}
