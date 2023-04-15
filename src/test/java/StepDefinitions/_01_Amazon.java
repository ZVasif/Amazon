package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
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


    @Then("Click to the All and select computer, then search samsung")
    public void clickToTheAllAndSelectComputerThenSearchSamsung() {

        dc.selectElement("all","Computers");
        dc.findAndSend("searchBox","samsung");
        dc.findAndClick("searchButton");
    }
}
