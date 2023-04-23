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
    @FindBy (xpath = "//*[contains(@class,'nav-sprite')]/select")
            private WebElement all;
    @FindBy(xpath = "//*[contains(@class,'nav-search-field ')]/input")
            private WebElement searchBox;
    @FindBy(xpath = "//*[contains(@class,'nav-search-submit-text')]/input")
            private WebElement searchButton;
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
    @FindBy(xpath = "//*[@data-index=\"2\" and @data-asin=\"B09N3YBXCN\"]")
    private WebElement tablet;
    @FindBy(xpath = "//*[text()='-22%']")
            private WebElement discount;




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
            case "tablet":myElement=tablet;break;


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
