package PagesDemoqa;

import BasePageDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQAElementsPage extends BasePage {
    public ToolsQAElementsPage(){
        PageFactory.initElements(driver, this);
    }


  /* public @FindBy(css =".pattern-backgound.playgound-header" )
   WebElement Elementslabel; */
    public @FindBy(className = "card-up")
    WebElement Elementslabel;

    public @FindBy( css=".btn.btn-light.active")
    WebElement Textbox;

    public @FindBy (id = "item-1")
    WebElement Checkbox;

    public @FindBy (id = "item-2")
    WebElement Radiobutton;

    public @FindBy (id = "item-3")
    WebElement Webtables;

    public @FindBy (id = "item-4")
    WebElement Buttons;

    public @FindBy (id="item-5")
    WebElement Links;

    public @FindBy (id="item-6")
    WebElement BrokenLinks;

    public @FindBy (id="item-7")
    WebElement UploadAndDownload;

    public @FindBy (id="item-8")
    WebElement DynamicProperties;

    //methods**********************************************************

    public void clickElementLabel() {
        Elementslabel.click();
    }
    /*public void clickElements () {
        Elements.click(); */

    public void clickTextbox() {
        Textbox.click();
    }
    public void clickCheckbox() {
        Checkbox.click();
    }
    public void clickRadiobutton() {
        Radiobutton.click();
    }
    public void clickWebTables() {
        Webtables.click();
    }
    public void clickButtons () {
        js.executeScript("arguments[0].scrollIntoView(true);", Buttons);
        wdwait.until(ExpectedConditions.elementToBeClickable(Buttons));
        Buttons.click();
    }
    public void clickLinks() {
    scrollTo(Links);
        js.executeScript("arguments[0].scrollIntoView(true);", Links);
        wdwait.until(ExpectedConditions.elementToBeClickable(Links));
        Links.click();
    }
    public void clickBrokenLinks() {
        js.executeScript("arguments[0].scrollIntoView(true);", BrokenLinks);
        wdwait.until(ExpectedConditions.elementToBeClickable(BrokenLinks));
        BrokenLinks.click();
    }
    public void clickUploadAndDownload () {
        js.executeScript("arguments[0].scrollIntoView(true);",UploadAndDownload);
        wdwait.until(ExpectedConditions.elementToBeClickable(UploadAndDownload));
        UploadAndDownload.click();
    }
    public void clickOnDynamicProperties() {
            js.executeScript("arguments[0].scrollIntoView(true);", DynamicProperties);
            wdwait.until(ExpectedConditions.elementToBeClickable(DynamicProperties));
            DynamicProperties.click();
        }


            public String getElementsText() {
              return Elementslabel.getText();
}

}










