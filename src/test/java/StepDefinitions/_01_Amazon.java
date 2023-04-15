package StepDefinitions;

import Utilites.GWD;
import io.cucumber.java.en.Given;

public class _01_Amazon {
    @Given("Open website Amazon")
    public void openWebsiteAmazon() {
        GWD.getDriver().get("https://www.amazon.com/");
        GWD.getDriver().manage().window().maximize();
    }
}
