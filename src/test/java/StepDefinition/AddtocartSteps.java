package StepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjectModel.AbstractClass;
import pageObjectModel.AddtocartPage;

public class AddtocartSteps extends AbstractClass {

    AddtocartPage addtocartPage =new AddtocartPage();

    @Given("^Click on  the T-SHIRTS$")
    public void click_on_the_T_SHIRTS() {

        addtocartPage.clickonthsirts();
        scrollDown();
    }
    @Given("^Click on list$")
    public void click_on_list() {
        addtocartPage.clickOnListView();
    }

    @Given("^click in wishlist$")
    public void click_in_wishlist() {
        addtocartPage.wishlist();

    }

    @Given("^click on pop up$")
    public void click_on_pop_up() {
        addtocartPage.popup();

    }


    @Given("^click on Add to cart button$")
    public void click_on_Add_to_cart_button() {
        addtocartPage.addtocart();
    }

    @Given("^click on proceed to check out button$")
    public void click_on_proceed_to_check_out_button() {
        addtocartPage.clickOnProceedToChechout();
    }

    @Then("^remove item$")
    public void remove_item() {
       addtocartPage.remove();
    }

}
