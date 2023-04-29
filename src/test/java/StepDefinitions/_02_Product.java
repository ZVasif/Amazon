package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

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
////    WebElement discount=GWD.getDriver().findElement(By.xpath("//*[text()='-22%']"));
////        System.out.println("mesaj="+discount.getText());
    }
}
