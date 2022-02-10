package PagesDemoqa;

import BasePageDemoqa.BasePage;
import com.sun.nio.sctp.MessageInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToolsQARadioButtonPage extends BasePage {
    public ToolsQARadioButtonPage () {
        PageFactory.initElements(driver, this);
    }
    public @FindBy( id = "yesRadio")
    WebElement Yes;

    public @FindBy( id = "noRadio")
    WebElement No;

    public @FindBy( id = "impressiveRadio")
    WebElement Impressive;

    public @FindBy( className = "text-success")
    WebElement NotificationYesOrImpressive;

    public @FindBy(className = "mt-3")
    List<WebElement> MessageInfo;

    //**methods--------------------------------------------

    public void clickYes() {
        Yes.click();
    }

    public void clickNo() {
        No.click();
    }

    public void clickImpressive() {
        Impressive.click();
    }

    public String NotificationYesOrImpressiveText() {
        return NotificationYesOrImpressive.getText();
    }
    public String MessageInfoText(int i) {
        return MessageInfo.get(i).getText();
    }


    }

