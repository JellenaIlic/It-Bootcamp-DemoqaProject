package PagesDemoqa;

import BasePageDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToolsQAHomepage extends BasePage {


    public ToolsQAHomepage() {
        PageFactory.initElements(driver, this);

    }
    public @FindBy (css = ".card.mt-4.top-card")
       List<WebElement>Cards;

   /* public @FindBy (className ="card-body")
    WebElement Elements;

    public @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5")
    WebElement Forms;

    public @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5")
     WebElement AlertsFrameWindows;

    public @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5")
    WebElement Widgets;

    public @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5")
    WebElement Interections;

    public @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5")
    WebElement BookStore; */
    public void ClickOnElements(){

       Cards.get(0).click();
    }
    public void ClickOnFormsButton() {
        Cards.get(1).click();
    }
    public void ClickOnAlertsFrameWindows() {
        Cards.get(2).click();
    }
    public void ClickOnWidgets() {
       Cards.get(3).click();
    }
    public void ClickOnInterections() {
        Cards.get(4).click();
    }
    public void ClickOnBookStoreApplication() {
        Cards.get(5).click();
    }


}


