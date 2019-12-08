package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(css = "button[onclick='jsAlert()']")
    private WebElement jsAlertButton;

    @FindBy(xpath = "//*[@id='result']")
    private WebElement resultText;

    public MainPage clickOnJsAlertButton(){
        jsAlertButton.click();
        return this;
    }

    public String getResultText(){
        return  resultText.getText();
    }

}
