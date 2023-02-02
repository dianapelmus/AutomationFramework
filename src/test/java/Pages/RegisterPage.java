package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.RegisterObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.audits.model.HeavyAdResolutionStatus;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement switchToDropdown;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement alertsDropsDown;

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement framesDropsDown;

    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement windowsDropsDown;

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement FirstName;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement LastName;
    @FindBy(xpath = "//textarea[@ng-model='Adress']")
    private WebElement Address;
    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    private WebElement Email;
    @FindBy(xpath = "//input[@ng-model='Phone']")
    private WebElement Phone;
    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement Sex;
    @FindBy(id = "checkbox2")
    private WebElement Hobbies;
    @FindBy(id = "yearbox")
    private WebElement YearDropDown;
    @FindBy(css = "select[placeholder='Month']")
    private WebElement Month;
    @FindBy(id = "daybox")
    private WebElement Day;
    @FindBy(id = "msdd")
    private WebElement LanguageDropDown;
    @FindBy(css = ".ui-front>li>a")
    private List<WebElement> LanguagesOptions;
    @FindBy(css = ".select2-selection")
    private WebElement selectCountry;
    @FindBy(className = "select2-search__field")
    private WebElement selectCountryInput;
    @FindBy(id = "Skills")
    private WebElement Skills;
    @FindBy(id = "firstpassword")
    private WebElement Password;
    @FindBy(id = "secondpassword")
    private WebElement confirmPassword;

    public void goToAlertPage() {
        elementMethods.hoverElement(switchToDropdown);
        elementMethods.clickElement(alertsDropsDown);
        pageMethods.navigateToURL("https://demo.automationtesting.in/Alerts.html");
    }

    public void goToFramePage() {
        elementMethods.hoverElement(switchToDropdown);
        elementMethods.clickElement(framesDropsDown);
        pageMethods.navigateToURL("https://demo.automationtesting.in/Frames.html");
    }

    public void goToWindowsPage() {
        elementMethods.hoverElement(switchToDropdown);
        elementMethods.clickElement(windowsDropsDown);
        pageMethods.navigateToURL("https://demo.automationtesting.in/Windows.html");
    }
    public void registerProcess(RegisterObject registerObject) {
        elementMethods.fillElement(FirstName, registerObject.getFirstName());
        elementMethods.fillElement(LastName, registerObject.getLastName());
        elementMethods.fillElement(Address, registerObject.getAddress());
        elementMethods.fillElement(Email, registerObject.getEmailAddress());
        elementMethods.fillElement(Phone, registerObject.getPhone());
        elementMethods.clickElement(Sex);
        elementMethods.clickElement(Hobbies);
        elementMethods.selectElementByValue(YearDropDown, registerObject.getYear());
        elementMethods.selectElementByText(Month, registerObject.getMonth());
        elementMethods.selectElementByValue(Day, registerObject.getDay());
        languageProcess(registerObject.getLanguagesOptions());
        countryProcess(registerObject.getCountry());
        elementMethods.fillElement(Skills,registerObject.getSkills());
        elementMethods.fillElement(Password,registerObject.getNewPassword());
        Password.sendKeys(Keys.ENTER);
        elementMethods.fillElement(confirmPassword,registerObject.getConfirmPassword());
        confirmPassword.sendKeys(Keys.ENTER);
    }
    public void languageProcess(String languages){
        elementMethods.clickElement(LanguageDropDown);
        for (int index = 0; index < LanguagesOptions.size(); index++) {
            if (LanguagesOptions.get(index).getText().equals(languages)) {
                LanguagesOptions.get(index).click();
            }
        }
        elementMethods.clickElement(FirstName);
        }
        public void countryProcess(String country){
            elementMethods.clickElement(selectCountry);
            elementMethods.fillElement(selectCountryInput,country);
            selectCountry.sendKeys(Keys.ENTER);
        }
}

