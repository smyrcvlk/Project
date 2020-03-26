package StepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjectModel.AbstractClass;
import pageObjectModel.BuyItem;
import pageObjectModel.SigninPage;
import utilities.Driver;
import utilities.ReadProperties;

import java.util.concurrent.TimeUnit;

public class BuyItemSteps extends AbstractClass {

    BuyItem buyItem=new BuyItem();

    @Given("^Click on  the T-SHIRTS$")
    public void click_on_the_T_SHIRTS() {

        buyItem.clickonthsirts();
    }

    @Given("^Click on more button$")
    public void click_on_more_button() {

    }

    @Given("^choose the size$")
    public void choose_the_size() {

    }

    @Given("^choose the color$")
    public void choose_the_color() {

    }

    @Given("^click on Add to cart button$")
    public void click_on_Add_to_cart_button() {

    }

    @Then("^verify the text$")
    public void verify_the_text() {

    }
}
