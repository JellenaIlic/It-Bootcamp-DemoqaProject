package PagesDemoqa;

import BasePageDemoqa.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToolsQACheckBox extends BasePage {
    public ToolsQACheckBox() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy ( css = ".rct-collapse.rct-collapse-btn")
    List<WebElement> DropdownButton;

    public @FindBy( css = ".rct-icon.rct-icon-uncheck")
    List<WebElement> UncheckedCheckbox;

    public @FindBy( css = ".rct-icon.rct-icon-check")
    List<WebElement> CheckedCheckbox;

    public @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]/svg/path")
    WebElement Notes;


    public @FindBy( className = "text-success")
    WebElement NotificationMessage;

    //****methods********************************************************************

    public void ClickOnDropDownButton(int i) {
        DropdownButton.get(i).click();
    }
    public int getUncheckedCheckboxList(int i) {
        return UncheckedCheckbox.size();
    }
    public int getCheckedboxList(int i) {
        return CheckedCheckbox.size();
    }
    public void clickOnNotes() {
        Notes.click();
    }
    public String getNotificationMessageSuccess() {
        return NotificationMessage.getText();
    }

}
