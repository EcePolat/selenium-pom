package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HeaderPage;
import pages.SignupLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUserTest {

    @BeforeClass
    public void setUp()
    {
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
    public void signUpTest() {

        SignupLoginPage slpage = new SignupLoginPage();

        Assert.assertTrue(slpage.newUserTitle.isDisplayed());

        slpage.name.sendKeys("ece");
        slpage.signupEmail.sendKeys("eece@gmail.com");
        slpage.signupButton.click();

        Actions actions = new Actions(Driver.getDriver());
        slpage.enterAccountText.isDisplayed();
        actions.click(slpage.titleRadioButton)
                .sendKeys(Keys.TAB)
                .sendKeys("ece")
                .sendKeys(Keys.TAB)
                .sendKeys("abcde")
                .sendKeys(Keys.TAB)
                .sendKeys("29")
                .sendKeys(Keys.TAB)
                .sendKeys("January")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .click()
                .sendKeys(Keys.TAB).perform();

        slpage.checkbox.click();
        actions.click(slpage.checkbox2)
                .sendKeys(Keys.TAB)
                .sendKeys("ece")
                .sendKeys(Keys.TAB)
                .sendKeys("polat")
                .sendKeys(Keys.TAB)
                .sendKeys("kendim")
                .sendKeys(Keys.TAB)
                .sendKeys("ulu cadde no 95")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Teksas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("05100")
                .sendKeys(Keys.TAB)
                .sendKeys("5551254568")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        Assert.assertTrue(slpage.createdText.isDisplayed());
        slpage.continueButton.click();

    }

    @Test(priority = 3)
    public void deleteAccount() {

        HeaderPage headerPage = new HeaderPage();
        SignupLoginPage slpage = new SignupLoginPage();

        Assert.assertTrue(headerPage.userText.isDisplayed());
        headerPage.deleteAccountButton.click();

        Assert.assertTrue(slpage.accountDeletedText.isDisplayed());
        slpage.continueDButton.click();
    }

}
