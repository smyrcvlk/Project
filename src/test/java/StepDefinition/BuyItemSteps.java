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
    @Given("^Click on list$")
    public void click_on_list() {

    }

    @Given("^click in wishlist$")
    public void click_in_wishlist() {

    }

    @Given("^click on pop up$")
    public void click_on_pop_up() {

    }


    @Given("^click on Add to cart button$")
    public void click_on_Add_to_cart_button() {

    }

    @Given("^click on proceed to check out button$")
    public void click_on_proceed_to_check_out_button() {

    }

    @Then("^remove item$")
    public void remove_item() {

    }

}
