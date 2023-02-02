package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertMethods {
    public WebDriver driver;
    public AlertMethods(WebDriver driver){
        this.driver = driver;
    }

    public void acceptAlert (){
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }
    public void closeAlert (){
        Alert closeAlert = driver.switchTo().alert();
        closeAlert.dismiss();
    }
    public void acceptFillAlert (String value){
        Alert alertText = driver.switchTo().alert();
        alertText.sendKeys(value);
        alertText.accept();
    }



}
