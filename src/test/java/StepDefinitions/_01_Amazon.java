package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _01_Amazon {
    DialogContent dc=new DialogContent();
    @Given("Open website Amazon")
    public void openWebsiteAmazon() {
        GWD.getDriver().get("https://www.amazon.com/");
        GWD.getDriver().manage().window().maximize();

    }

    @When("Confirm website Amazon")
    public void confirmWebsiteAmazon() {
        dc.findAndContainsText("confirm","Azerbaijan");
    }


    @And("Create new account and sing in")
    public void createNewAccountAndSingIn() {
        dc.findAndClick("signIn");
        dc.findAndSend("email","bond007cems@gmail.com");
        dc.findAndClick("continueButton");
        dc.findAndSend("password","00bond7c");
        dc.findAndClick("singButton");

    }


    @Then("Click to the All and select computer, then search samsung")
    public void clickToTheAllAndSelectComputerThenSearchSamsung() {

        dc.selectElement("all","Computers");
        dc.findAndSend("searchBox","samsung");
        dc.findAndClick("searchButton");
    }


    @And("Select Samsung tablet, check discount price and add to card, then delete product")
    public void selectSamsungTabletCheckDiscountPriceAndAddToCardThenDeleteProduct() {
    dc.findAndClick("tablet");
//    WebElement discount=GWD.getDriver().findElement(By.xpath("//*[text()='-22%']"));
//        System.out.println("mesaj="+discount.getText());
    }
}
