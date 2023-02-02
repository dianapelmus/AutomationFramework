package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AlertTest extends Hooks {
    @Test
    public void alertMethod() {
        AlertObject alertObject = new AlertObject(testData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToAlertPage();

        AlertPage alertPage = new AlertPage(driver);
        alertPage.dealAlertOk();
        alertPage.dealAlertOkCancel();
        alertPage.dealAlertSendKeys(alertObject);
    }
}
