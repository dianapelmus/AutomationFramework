package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowsPage extends BasePage {
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".nav-stacked>li>a")
    private List<WebElement> tabsList;

    @FindBy(css = "#Tabbed button")
    private WebElement newTabWindow;

    @FindBy(css = "#Seperate button")
    private WebElement newSeparateWindow;

    @FindBy(css = "#Multiple button")
    private WebElement multipleWindows;

    public void dealTab(){
        elementMethods.clickElement(tabsList.get(0));
        elementMethods.clickElement(newTabWindow);
        tabMethods.switchSpecificTabWindow(1);
        tabMethods.closeSpecificTabWindow();
        tabMethods.switchSpecificTabWindow(0);
    }

    public void dealWindow(){
        elementMethods.clickElement(tabsList.get(1));
        elementMethods.clickElement(newSeparateWindow);
        tabMethods.switchSpecificTabWindow(1);
        tabMethods.closeSpecificTabWindow();
        tabMethods.switchSpecificTabWindow(0);
    }

    public void dealMultipleTabs(){
        elementMethods.clickElement(tabsList.get(2));
        elementMethods.clickElement(multipleWindows);
        tabMethods.switchSpecificTabWindow(2);
        tabMethods.closeSpecificTabWindow();
        tabMethods.switchSpecificTabWindow(1);
        tabMethods.closeSpecificTabWindow();
        tabMethods.switchSpecificTabWindow(0);
    }
}
