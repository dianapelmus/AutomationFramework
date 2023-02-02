package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.PageMethods;
import Objects.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FrameTest extends Hooks {

    @Test
    public void frameMethod (){
        FrameObject frameObject = new FrameObject(testData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToFramePage();

        FramePage framePage = new FramePage(driver);
        framePage.dealSingleFrame(frameObject);
        framePage.dealMultipleFrames(frameObject);
    }
}
