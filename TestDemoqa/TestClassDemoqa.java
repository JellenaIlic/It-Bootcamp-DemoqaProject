package TestDemoqa;

import BasePageDemoqa.BasePage;
import BasePageDemoqa.ExcelReader;
import PagesDemoqa.*;
import org.apache.poi.sl.usermodel.TextBox;
import org.jsoup.select.Elements;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassDemoqa extends BasePage {




    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(homePageURL);

    }
    public void goToElements() {
        scrollTo(toolsQAHomepage.Cards.get(0));
        toolsQAHomepage.Cards.get(0).click();
    }


    @Test (priority = 10)
    public void VerifyElementsPageAddress() throws InterruptedException {
        scrollTo(toolsQAHomepage.Cards.get(0));
        toolsQAHomepage.Cards.get(0).click();

        Thread.sleep(5000);

        String actualURL= driver.getCurrentUrl();
        String expectedURL="https://demoqa.com/elements";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test(priority = 20)
    public void VerifyTextboxPageAddress() throws InterruptedException {
        goToElements();
        toolsQAElementsPage.Textbox.click();
       // toolsQAElementsPage.clickTextbox(); //test pada
        String actualURL=driver.getCurrentUrl();
        String expectedURL= "https://demoqa.com/text-box";
        Assert.assertEquals(actualURL, expectedURL);
    }
    @Test
    public void VerifyElementsCanOpen() {
        String fullName = excelReader.getStringData("Textbox", 2, 1);
        String email = excelReader.getStringData("Textbox", 2, 2);
        String currentAddress = excelReader.getStringData("Textbox", 2, 3);
        String permanentAddress = excelReader.getStringData("Textbox", 2, 4);

        toolsQAElementsPage.clickElementLabel();
        toolsQAElementsPage.clickTextbox();
        toolsQATextBox.insertFullName(fullName);
        toolsQATextBox.insertEmail(email);
        toolsQATextBox.insertCurrentAddress(currentAddress);
        toolsQATextBox.insertPermanentAddress(permanentAddress);
        toolsQATextBox.clickSubmitButton();
    }

    @Test
    public void verifyThatLinkedBoxOnElementPageButtonsIsValidAndOpensButtonsPage () throws Exception {

        scrollTo(toolsQAHomepage.Cards.get(0));
        toolsQAHomepage.Cards.get(0).click();

        Thread.sleep(5000);


        toolsQAElementsPage.clickButtons();

        String buttons = "Buttons";
        Assert.assertEquals(toolsQAButtonsPage.getButtonsText(), buttons);

    }

    }







