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
    @FindBy(id = "glow-ingress-line2")
    private WebElement confirm;
    @FindBy (xpath = "//*[contains(@class,'nav-sprite')]/select")
            private WebElement all;
    @FindBy(xpath = "//*[contains(@class,'nav-search-field ')]/input")
            private WebElement searchBox;
    @FindBy(xpath = "//*[contains(@class,'nav-search-submit-text')]/input")
            private WebElement searchButton;





    WebElement myElement;
    public void findAndSend (String strElement,String value){
       switch (strElement){
           case "searchBox":myElement=searchBox;break;

       }


        sendKeysFunction(myElement,value);

    }


    public void findAndClick (String strElement){
        switch (strElement){
            case "searchButton":myElement=searchButton;break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            case "confirm":myElement=confirm;break;



        }
        verifyContainsText(myElement,text);
    }

    public void selectElement(String strElement,String text){
        switch (strElement){
            case "all":myElement=all;break;
        }
        selectElement(myElement,text);
    }

}
