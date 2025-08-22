package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeaderPage {
    public HeaderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='logo pull-left']")
    public WebElement siteLogo;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//*[text() =' Logged in as ']")
    public WebElement userText;

    @FindBy(xpath = "//*[text() = ' Delete Account']")
    public WebElement deleteAccountButton;

}
