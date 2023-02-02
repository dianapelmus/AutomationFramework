package HelpMethods;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.lang.model.element.Element;

public class ElementMethods {

    public WebDriver driver;
    public ElementMethods(WebDriver driver){
        this.driver = driver;
    }

    public void clickElement (WebElement element){
       element.click();
    }
    public void hoverElement (WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void fillElement (WebElement element,String value){
        element.sendKeys(value);
    }

    public void validateElementMessage (WebElement element, String message){
        String Actual = element.getText();
        Assert.assertEquals(message,Actual);
    }
    public void selectElementByValue(WebElement element, String value){
        Select YearSelected = new Select(element);
        YearSelected.selectByValue(value);
    }
    public void selectElementByText(WebElement element, String text){
        Select YearSelected = new Select(element);
        YearSelected.selectByVisibleText(text);

    }
}
