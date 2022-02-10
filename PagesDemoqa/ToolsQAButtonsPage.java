package PagesDemoqa;

import BasePageDemoqa.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQAButtonsPage extends BasePage {
    public ToolsQAButtonsPage() {
        PageFactory.initElements(driver,this);
    }


    public @FindBy (className = "main-header")
    WebElement getButtonsLabel;


    public @FindBy( id = "doubleClickBtn")
    WebElement DoubleClickMe;

    public @FindBy( id = "rightClickBtn")
    WebElement RightClickMe;

    public @FindBy( xpath = "//*[text()='Click Me']")
    WebElement ClickMe;

    public @FindBy( id = "doubleClickMessage")
    WebElement DoubleClickNotification;

    public @FindBy( id = "rightClickMessage")
    WebElement RightClickNotification;

    public @FindBy( id = "dynamicClickMessage")
    WebElement ClickMeNotification;

//**methods****************************************************
    public void clickOnDoubleClickMeButton() {
        DoubleClickMe.click();
    }
    public void clickOnRightClick() {
        RightClickMe.click();
    }
    public void clickOnClickMeButton() {
        ClickMe.click();
    }
    public String doubleClickNotification() {
        return DoubleClickNotification.getText();
    }

    public void actionDoubleClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }

    public String rightClickNotification() {
        return RightClickNotification.getText();
    }

    public void actionRightClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
    }

    public String clickMeNotification() {
        return ClickMeNotification.getText();
    }


        public String getButtonsText() {
        return getButtonsLabel.getText();
        }
















}
