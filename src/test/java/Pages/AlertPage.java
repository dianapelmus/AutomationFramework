package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> alertOptions;

    @FindBy(css = ".btn.btn-danger")
    private WebElement alertOkPopUp;

    @FindBy(css = ".btn.btn-primary")
    private WebElement cancelAlert;

    @FindBy(css = ".btn.btn-info")
    private WebElement alertWithText;

    public void dealAlertOk(){
        elementMethods.clickElement(alertOptions.get(0));
        elementMethods.clickElement(alertOkPopUp);
        alertMethods.acceptAlert();
    }
    public void dealAlertOkCancel(){
        elementMethods.clickElement(alertOptions.get(1));
        elementMethods.clickElement(cancelAlert);
        alertMethods.closeAlert();
    }
    public void dealAlertSendKeys(AlertObject alertObject){
        elementMethods.clickElement(alertOptions.get(2));
        elementMethods.clickElement(alertWithText);
        alertMethods.acceptFillAlert(alertObject.getAlertValue());
    }
}
