package HelpMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageMethods {
    public WebDriver driver;
    public PageMethods(WebDriver driver){
        this.driver = driver;
    }
        public void navigateToURL(String URL){
        driver.navigate().to(URL);
        }
     public void validateTitle (String Expected){
         String Actual = driver.getTitle();
         Assert.assertEquals(Expected, Actual);
     }
}
