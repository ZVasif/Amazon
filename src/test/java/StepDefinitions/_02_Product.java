package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Product {
    DialogContent dc=new DialogContent();
    @And("Click to the All and select computer, then search samsung")
    public void clickToTheAllAndSelectComputerThenSearchSamsung() {
        dc.selectElement("all","Computers");
        dc.findAndSend("searchBox","samsung");
        dc.findAndClick("searchButton");
    }

    @And("Select Samsung tablet, check discount price and add to card, then delete product")
    public void selectSamsungTabletCheckDiscountPriceAndAddToCardThenDeleteProduct() {
        dc.findAndClick("tablet");
        WebElement discount= GWD.getDriver().findElement(By.xpath("//*[contains(@class,'savingsPercentage')]"));

        WebElement listPrice=GWD.getDriver().findElement(By.xpath("//*[contains(@class,'basisPrice')]"));
        System.out.println("listPrice="+listPrice.getText());
        double reg1=Double.parseDouble(listPrice.getText().replaceAll("[A-Za-z,:$]",""));

        System.out.println("reg1 = " + reg1);

        WebElement currentPrice=GWD.getDriver().findElement(By.id("corePrice_feature_div"));
        System.out.println("currentPrice = " + currentPrice);
        double reg2=Double.parseDouble(currentPrice.getText().replaceAll("[$]",""));
        System.out.println("reg2 = " + reg2);

//        double rebate=reg1-reg2;
//
//        System.out.println("There was a "+discount.getText()+"discount on the product."+rebate+" $ has been rebate");




    }
}

