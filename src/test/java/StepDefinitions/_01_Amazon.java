package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

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
        dc.findAndClick("remember");
        dc.findAndClick("singButton");


    }
}
