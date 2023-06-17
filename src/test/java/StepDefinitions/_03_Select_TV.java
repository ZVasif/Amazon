package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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


        GWD.Bekle(5);


    }

//    @And("Select TV from the department section,select LED & LCD TV and select SAMSUNG from the Featured Brands section")
//    public void selectTVFromTheDepartmentSectionSelectLEDLCDTVAndSelectSAMSUNGFromTheFeaturedBrandsSection(DataTable elements) {
//        List<String>listElement=elements.asList(String.class);
////        for (int i = 0; i < listElement.size() ; i++) {
////            dc.findAndClick(listElement.get(i));
////        }
//        dc.findAndClick("TV");
//    }


}
