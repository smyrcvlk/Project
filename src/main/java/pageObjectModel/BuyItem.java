package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyItem extends AbstractClass{


    @FindBy(xpath = " //*[@id=\"block_top_menu\"]/ul/li[3]")
    private WebElement Tshirts;

    public void clickonthsirts(){
     clickOnFunctionalities(Tshirts);
    }
//.sf-menu li.sfHoverForce a
}
