package StepDefinition;

import cucumber.api.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.AbstractClass;
import pageObjectModel.AccountPage;
import pageObjectModel.personalinfopage;
import utilities.Driver;
import utilities.ReadProperties;

public class PersonalInfoSteps extends AbstractClass {


    personalinfopage ip= new personalinfopage();

    @Given("^Click on My Personal Information$")
    public void click_on_My_Personal_Information() {
       ip.clickOnMyPersonalInfoTab();
    }

    @Given("^Click on social title$")
    public void click_on_social_title() {
       ip.clickOnSocialTitle();
    }

    @Given("^type to\"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void type_to_and_and(String arg1, String arg2, String arg3) {
        ip.typeFirstName(arg1);

        ip.typeLastName(arg2);

        ip.typeNewEmail(arg3);
        waitMethod();

        scrollDown();
    }

    @Given("^type \"([^\"]*)\"and \"([^\"]*)\"$")
    public void type_and(String password, String newPassWord) {
        ip.typeOldPassWord(password);
        waitMethod();

        ip.inputnewPassWord(newPassWord);
    }

    @Given("^Click on Save button$")
    public void click_on_Save_button() {
        waitMethod();

        ip.clickOnSaveButton();
    }

}

