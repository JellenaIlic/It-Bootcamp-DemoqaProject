package PagesDemoqa;

import BasePageDemoqa.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQATextBox extends BasePage {
    public ToolsQATextBox () {
        PageFactory.initElements(driver,this);
    }
    public @FindBy(id= "userName")
        WebElement Fullname;

    public @FindBy(id="userEmail")
        WebElement Email;

    public @FindBy (id="currentAddress")
    WebElement CurrentAddress;

    public @FindBy (id="permanentAddress")
    WebElement PermanentAddress;

    public @FindBy(id="submit")
    WebElement ButtonSubmit;

    // methods --------------------------------------
    public void insertFullName(String fullName) {
        Fullname.clear();
        Fullname.sendKeys(fullName);
    }
    public void insertEmail(String email) {
        Email.clear();
        Email.sendKeys(email);
    }
    public void insertCurrentAddress(String currentAddress) {
        CurrentAddress.clear();
        CurrentAddress.sendKeys(currentAddress);
    }
    public void insertPermanentAddress(String permanentAddress) {
        PermanentAddress.clear();
        PermanentAddress.sendKeys(permanentAddress);
    }
    public void clickSubmitButton() {
        ButtonSubmit.click();
    }

    }







