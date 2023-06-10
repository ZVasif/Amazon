package Pages;

import Utilites.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    //************************** _01_  **************************//
    @FindBy(id = "glow-ingress-line2")
    private WebElement confirm;
    @FindBy(xpath = "//*[text()='Hello, sign in']")
    private WebElement signIn;
    @FindBy(id="ap_email")
    private WebElement email;
    @FindBy(xpath = "//*[@class='a-button-inner']/input")
    private WebElement continueButton;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(id = "signInSubmit")
    private WebElement singButton;
    @FindBy(name = "rememberMe")
    private WebElement remember;

    //************************** _02_  **************************//

    @FindBy (xpath = "//*[contains(@class,'nav-sprite')]/select")
            private WebElement allMenu1;
    @FindBy(xpath = "//*[contains(@class,'nav-search-field ')]/input")
            private WebElement searchBox;
    @FindBy(xpath = "//*[contains(@class,'nav-search-submit-text')]/input")
            private WebElement searchButton;
    @FindBy(xpath = "//*[contains(@alt,'Long Las...')]")
    private WebElement tablet;
    @FindBy(xpath = "//*[contains(@class,'savingsPercentage')]")
            private WebElement discount;
    @FindBy(xpath = "//*[@id=\"submit.add-to-cart\"]")
            private WebElement addTocard;
    @FindBy(xpath = "//*[@id='attach-view-cart-button-form']//input")
            private WebElement cart;
    @FindBy(xpath = "//*[@data-action=\"delete\"]//input")
            private WebElement delete;
    @FindBy(xpath = "(//*[contains(text(),'empty')])[2]")
            private WebElement emptyMessage;

    //************************** _03_  **************************//
    @FindBy(id = "nav-hamburger-menu")
            private WebElement mainAll;
    @FindBy(xpath = "//*[@data-menu-id=\"1\"]/li")
            private WebElement allMenu2;
    @FindBy(xpath = "//*[@data-menu-id=\"5\"]")
            private WebElement electronins;
    @FindBy(xpath = "//*[text()='Television & Video']")
            private WebElement videoTV;



    WebElement myElement;
    public void findAndSend (String strElement,String value){
       switch (strElement){
           case "email":myElement=email;break;
           case "password":myElement=password;break;
           case "searchBox":myElement=searchBox;break;

       }


        sendKeysFunction(myElement,value);

    }


    public void findAndClick (String strElement){
        switch (strElement){
            case "searchButton":myElement=searchButton;break;
            case "signIn":myElement=signIn;break;
            case "continueButton":myElement=continueButton;break;
            case "singButton":myElement=singButton;break;
            case "remember":myElement=remember;break;
            case "tablet":myElement=tablet;break;
            case "addTocard":myElement=addTocard;break;
            case "cart":myElement=cart;break;
            case "delete":myElement=delete;break;
            case "mainAll":myElement=mainAll;break;
            //case "electronins":myElement=electronins;break;
            //case "videoTV":myElement=videoTV;break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText (String strElement,String text){
        switch (strElement){
            case "confirm":myElement=confirm;break;
            case "emptyMessage":myElement=emptyMessage;break;



        }
        verifyContainsText(myElement,text);
    }

    public void selectElement(String strElement,String text){
        switch (strElement){
            case "allMenu1":myElement=allMenu1;break;
            case "allMenu2":myElement=allMenu2;break;
        }
        selectElement(myElement,text);
    }

    public void selectAction(String strElement){
        switch (strElement){
            case "electronins":myElement=electronins;break;
        }
        actionFunction(myElement);
    }

}
