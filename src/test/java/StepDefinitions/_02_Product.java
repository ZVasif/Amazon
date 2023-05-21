package StepDefinitions;

import Pages.DialogContent;
import Utilites.GWD;
import io.cucumber.java.en.And;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class _02_Product {
    DialogContent dc=new DialogContent();
    @And("Click to the All and select computer, then search samsung")
    public void clickToTheAllAndSelectComputerThenSearchSamsung() {
        dc.selectElement("all","Computers");
        dc.findAndSend("searchBox","samsung");
        dc.findAndClick("searchButton");
    }

    @And("Select Samsung tablet, check discount price and add to card, then delete product")
    public void selectSamsungTabletCheckDiscountPriceAndAddToCardThenDeleteProduct() throws IOException {

        dc.findAndClick("tablet");
        WebElement discount= GWD.getDriver().findElement(By.xpath("//*[contains(@class,'savingsPercentage')]"));
        System.out.println("discount = " + discount.getText());

        XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet sh=wb.createSheet("Sheet");
        Row newRow= sh.createRow(0);
        Cell newCell= newRow.createCell(0);
        newCell.setCellValue(discount.getText());

        for (int i = 1; i <10 ; i++) {
            newRow.createCell(i).setCellValue(i);
        }

        String newExcellPath="src/test/java/ApachePOI/resource/List_Discount.xlsx";
        FileOutputStream outputStream=new FileOutputStream(newExcellPath);
        wb.write(outputStream);
        wb.close();
        outputStream.close();


        WebElement listPrice=GWD.getDriver().findElement(By.xpath("//*[contains(@class,'basisPrice')]"));
        System.out.println("listPrice="+listPrice.getText());
        double reg1=Double.parseDouble(listPrice.getText().replaceAll("[A-Za-z,:$]",""));

        System.out.println("reg1 = " + reg1);

        WebElement currentPrice=GWD.getDriver().findElement(By.xpath("(//*[@data-a-size=\"xl\"]/span)[3]"));
        System.out.println("currentPrice = " + currentPrice.getText());
//        double reg2=Double.parseDouble(currentPrice.getText().replaceAll("[$]",""));
//        System.out.println("reg2 = " + reg2);

//        double rebate=reg1-reg2;
//
//        System.out.println("There was a "+discount.getText()+"discount on the product."+rebate+" $ has been rebate");




    }
}

