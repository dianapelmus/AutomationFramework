package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.LogInObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    private WebElement EmailElement;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement PasswordElement;

    @FindBy(id = "enterbtn")
    private WebElement Enter;

    @FindBy(id = "errormsg")
    private WebElement ErrorMessageEllement;

    public void logInInvalid(LogInObject logInObject){
        pageMethods.validateTitle(logInObject.getSignInTitle());
        elementMethods.fillElement(EmailElement,logInObject.getEmail());
        elementMethods.fillElement(PasswordElement,logInObject.getPassword());
        elementMethods.clickElement(Enter);
        elementMethods.validateElementMessage(ErrorMessageEllement,logInObject.getMessage());
    }
}
