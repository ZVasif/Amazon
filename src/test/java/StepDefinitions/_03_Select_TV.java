package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _03_Select_TV {

    DialogContent dc=new DialogContent();
    @Then("Click to the All,select Electronics and click Television & Video")
    public void clickToTheAllSelectElectronicsAndClickTelevisionVideo(DataTable elements) {
        List<String > listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));

        }
        dc.selectAction("electronins");
        dc.selectAction("videoTV");

    }

    @And("Select TV from the department section,select LED & LCD TV and select SAMSUNG from the Featured Brands section")
    public void selectTVFromTheDepartmentSectionSelectLEDLCDTVAndSelectSAMSUNGFromTheFeaturedBrandsSection() {
        dc.findAndClick("TV");
        dc.findAndClick("LED");
        dc.selectAction("samsung");

    }


    @Then("Send min and max price press Go then select {int}K and {int} from Modul year")
    public void sendMinAndMaxPricePressGoThenSelectKAndFromModulYear(int arg0, int arg1) {
        dc.findAndSend("maxPrice","900");
        dc.findAndSend("minPrice","200");
        dc.findAndClick("go");
        dc.findAndClick("fourK");
        dc.findAndClick("year2022");
    }

    @And("Select Samsung M{int}, check discount price and add to card, then delete product")
    public void selectSamsungMCheckDiscountPriceAndAddToCardThenDeleteProduct(int arg0) {
        dc.findAndClick("TVM8");
        dc.findAndClick("addTocard");
        WebElement element=GWD.getDriver().findElement(By.id("a-page"));
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.attributeContains(element,"aria-hidden","true"));
        dc.findAndClick("cart");
        dc.findAndClick("delete");
        dc.findAndContainsText("emptyMessage","empty");
    }
}
