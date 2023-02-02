package Tests;

import Base.BaseTest;
import Base.Hooks;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest extends Hooks {

    private Alert selectCountry;

    @Test
    public void RegisterMethod() {
        RegisterObject registerObject = new RegisterObject(testData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.registerProcess(registerObject);
    }
}






      /*WebElement FirstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
      elementMethods.fillElement(FirstName,"Diana");

      WebElement LastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
      elementMethods.fillElement(LastName,"Pelmus");

      WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
      elementMethods.fillElement(Address,"Calea Bucuresti 270, brasov");

      WebElement Email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
      elementMethods.fillElement(Email,"dpelmus@gmail.com");

      WebElement Phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
      elementMethods.fillElement(Phone,"0040778899651");

      WebElement Sex = driver.findElement(By.xpath("//input[@value='FeMale']"));
      elementMethods.clickElement(Sex);

      WebElement Hobbies = driver.findElement(By.id("checkbox2"));
      elementMethods.clickElement(Hobbies);

        //interactionam cu un drop-down clasic
       WebElement YearDropDown = driver.findElement(By.id("yearbox"));
       elementMethods.selectElementByValue(YearDropDown,"1991");

       WebElement Month = driver.findElement(By.cssSelector("select[placeholder='Month']"));
       elementMethods.selectElementByText(Month,"March");

       WebElement Day = driver.findElement(By.id("daybox"));
       elementMethods.selectElementByValue(Day,"2");

       WebElement LanguageDropDown = driver.findElement(By.id("msdd"));
       elementMethods.clickElement(LanguageDropDown);

       List<WebElement> LanguagesOptions = driver.findElements(By.cssSelector(".ui-front>li>a"));
        int index;
        for (index = 0; index < LanguagesOptions.size(); index++) {
            if (LanguagesOptions.get(index).getText().equals("Dutch")) {
                LanguagesOptions.get(index).click();
            }
        }
       elementMethods.clickElement(FirstName);

       WebElement selectCountry = driver.findElement(By.cssSelector(".select2-selection"));
       elementMethods.clickElement(selectCountry);

       WebElement selectCountryInput = driver.findElement(By.className("select2-search__field"));
       elementMethods.fillElement(selectCountryInput,"Japan");
       selectCountry.sendKeys(Keys.ENTER);

       WebElement Skills = driver.findElement(By.id("Skills"));
       elementMethods.fillElement(Skills,"Android");

       WebElement Password = driver.findElement(By.id("firstpassword"));
       elementMethods.fillElement(Password,"abcd1234");
       Password.sendKeys(Keys.ENTER);

       WebElement confirmPassword = driver.findElement(By.id("secondpassword"));
       elementMethods.fillElement(confirmPassword,"abcd1234");
       confirmPassword.sendKeys(Keys.ENTER);
    }
}*/
