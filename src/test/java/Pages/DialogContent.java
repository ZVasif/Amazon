package Pages;

import Utilites.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    //************************** _01_ UniBank **************************//
    @FindBy(css = "[style ='line-height: 15px']")
    private WebElement tele;






    WebElement myElement;
    public void findAndSend (String strElement,String value){
       switch (strElement){
           //case "email":myElement=email;break;

       }


        sendKeysFunction(myElement,value);

    }


    public void findAndClick (String strElement){
        switch (strElement){
           // case "cards":myElement=cards;break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            //case "tele":myElement=tele;break;



        }
        verifyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText){
        findAndSend("searchBox",searchText);
        findAndClick("searchBTN");

       // WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.stalenessOf(deleteBTN));

        waitUntilLoading();
        findAndClick("deletebutton");
        findAndClick("deleteDialogbutton");

    }

}
