package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage extends BasePage{

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=\"text\"]")
    private WebElement singleFrame;

    @FindBy(css = "a[href=\"#Multiple\"]")
    private WebElement iFrameDuble;

    public void dealSingleFrame (FrameObject frameObject){
        frameMethods.switchToFrame("singleframe");
        elementMethods.fillElement(singleFrame,frameObject.getSingleFrame());
        frameMethods.switchToBaseFrame();
    }
    public void dealMultipleFrames (FrameObject frameObject){
        elementMethods.clickElement(iFrameDuble);
        frameMethods.switchToFrame(driver.findElement(By.cssSelector("iframe[src=\"MultipleFrames.html\"]")));
        frameMethods.switchToFrame(driver.findElement(By.cssSelector("iframe[src=\"SingleFrame.html\"]")));
        elementMethods.fillElement(singleFrame, frameObject.getMultipleFrame());
    }
}
