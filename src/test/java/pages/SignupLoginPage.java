package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupLoginPage {

    public SignupLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserTitle;

    @FindBy(xpath = "//input[@name = 'name']")
    public WebElement name;

    @FindBy(xpath = "//input[@data-qa= 'signup-email']")
    public WebElement signupEmail;

    @FindBy(xpath = "//button[@data-qa= 'signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//h2[@class = 'title text-center']")
    public WebElement enterAccountText;

    @FindBy(xpath = "//input[@id = 'id_gender2']")
    public WebElement titleRadioButton;

    @FindBy(xpath = "//input[@id = 'newsletter']")
    public WebElement checkbox;

    @FindBy(xpath = "//input[@id = 'optin']")
    public WebElement checkbox2;

    @FindBy(xpath = "//h2[@data-qa = 'account-created']")
    public WebElement createdText;

    @FindBy(xpath = "//a[@data-qa = 'continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text() = 'Account Deleted!']")
    public WebElement accountDeletedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueDButton;
}
