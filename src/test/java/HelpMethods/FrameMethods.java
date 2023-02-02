package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMethods {
    public WebDriver driver;
    public FrameMethods(WebDriver driver){
        this.driver = driver;
    }

    public void switchToFrame(String Locator){
        driver.switchTo().frame(Locator);
    }
    public void switchToFrame(WebElement element){
        driver.switchTo().frame(element);
    }
    public void switchToBaseFrame (){
        driver.switchTo().defaultContent();
    }
}
