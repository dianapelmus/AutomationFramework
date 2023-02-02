package HelpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class TabMethods {
    public WebDriver driver;
    public TabMethods(WebDriver driver){
        this.driver = driver;
    }

    public void switchSpecificTabWindow(Integer index){
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(index));
        System.out.println(driver.getTitle());
    }

    public void closeSpecificTabWindow(){
        driver.close();

    }
}
