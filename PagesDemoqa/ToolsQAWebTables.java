package PagesDemoqa;

import BasePageDemoqa.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToolsQAWebTables extends BasePage {
    public ToolsQAWebTables() {
        PageFactory.initElements(driver, this);
    }
    public @FindBy ( id = "addNewRecordButton")
    WebElement AddButton;

    public @FindBy( id = "searchBox")
    WebElement SearchBox;

    public @FindBy( xpath = "//span[@title='Delete']")
    WebElement DeleteButton;

    public @FindBy( id = "firstName")
    WebElement FirstName;

    public @FindBy( id = "lastName")
    WebElement LastName;

    public @FindBy( id = "userEmail")
    WebElement Email;

    public @FindBy( id = "age")
    WebElement Age;

    public @FindBy( id = "submit")
    WebElement SubmitButton;

    public @FindBy( id = "salary")
    WebElement Salary;

    public @FindBy( id = "department")
    WebElement Department;

    public @FindBy (className = "-pageJump")
    WebElement Page;

    public @FindBy( id = "mr-2")
    List<WebElement> EditButtons;

    public @FindBy( className = "rt-td")
    List<WebElement> CellInfo;

    public @FindBy( className = "rt-tr-group")
    List<WebElement> RowsInfo;

    public @FindBy (css = ".select-wrap.-pageSizeOptions")
    WebElement RowsDropDown;
    //***methods-----------------------------------------------------


    public void clickOnAdd() {
        AddButton.click();
    }
    public void clickOnDelete() {
        DeleteButton.click();
    }

    public void clickOnEdit(int i) {
        EditButtons.get(i).click();
    }

    public void inputFirstName(String firstname) {
        FirstName.clear();
        FirstName.sendKeys(firstname);
    }

    public void inputLastName(String lastname) {
        LastName.clear();
        LastName.sendKeys(lastname);
    }

    public void inputEmail(String email) {
        Email.clear();
        Email.sendKeys(email);
    }

    public void inputAge(int age) {
        Age.clear();
        Age.sendKeys(String.valueOf(age));
    }

    public void inputSalary(int salary) {
        Salary.clear();
        Salary.sendKeys(String.valueOf(salary));
    }

    public void inputDepartment(String department) {
        Department.clear();
        Department.sendKeys(department);
    }

    public void clickOnSubmit() {
        SubmitButton.click();
    }

    public String cellText(int i) {
        return CellInfo.get(i).getText();
    }

    public String rowText(int i) {
        return RowsInfo.get(i).getText();
    }

    public void inputSearch(String input) {
        SearchBox.clear();
        SearchBox.sendKeys(input);
    }
    public void insertTextInSearchBox (String searchText) {
        SearchBox.clear();
       SearchBox.sendKeys(searchText);
    }
   /* public String WebtablesText() {
        return W


*/
}
