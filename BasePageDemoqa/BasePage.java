package BasePageDemoqa;


import PagesDemoqa.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public JavascriptExecutor js;
    public ExcelReader excelReader;
    public ToolsQAHomepage toolsQAHomepage;
    public ToolsQAButtonsPage toolsQAButtonsPage;
    public ToolsQACheckBox toolsQACheckBox;
    public ToolsQAElementsPage toolsQAElementsPage;
    public ToolsQARadioButtonPage toolsQARadioButtonPage;
    public ToolsQATextBox toolsQATextBox;
    public ToolsQAWebTables toolsQAWebTables;
    public String homePageURL;
    public String elementsPageURL;
    public String textboxPageURL;
    public String checkboxPageURL;
    public String radiobuttonsPageURL;
    public String webtablesPageURL;
    public String buttonsPageURL;

    @BeforeClass
    public void SetUpPage() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        js = (JavascriptExecutor) driver;
        excelReader = new ExcelReader("C:\\Users\\pc\\Desktop\\TextBookDemoqa.xlsx");
        homePageURL=excelReader.getStringData("URL" , 1,2);
        elementsPageURL=excelReader.getStringData("URL", 2,2);
        textboxPageURL=excelReader.getStringData("URL", 3,2);
        checkboxPageURL=excelReader.getStringData("URL", 4,2);
        radiobuttonsPageURL=excelReader.getStringData("URL",5,2 );
        webtablesPageURL=excelReader.getStringData("URL", 6,2);
        buttonsPageURL=excelReader.getStringData("URL",7,2);
        toolsQAHomepage= new ToolsQAHomepage();
    }

    public void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clickElementJS(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    }
    public void wait(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }





    @AfterClass
    public void TearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}