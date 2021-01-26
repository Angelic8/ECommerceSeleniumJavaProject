
package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import page.*;

import java.io.FileNotFoundException;

public class ECommerceTestCases {

    // tools
    private static WebDriver driver;
    private static WebElement element;

    // url
    private final String appURL = "https://www.amazon.com/";

    // pages
    protected static Homepage homepageObj;
    protected static Category categoryObj;
    protected static Product productObj;
    protected static Login loginObj;
    protected static SearchAndSearchResults searchAndSearchResultsObj;

    @BeforeTest
    public void setupTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().deleteAllCookies();

        homepageObj = new Homepage();
        homepageObj.setWebDriver(driver);

        categoryObj = new Category();
        categoryObj.setWebDriver(driver);

        productObj = new Product();
        productObj.setWebDriver(driver);

        loginObj = new Login();
        loginObj.setWebDriver(driver);

        searchAndSearchResultsObj = new SearchAndSearchResults();
        searchAndSearchResultsObj.setWebDriver(driver);
    } // end method setupTest()

    @Test
    public void aTestHomepage() {
        // homepage
        homepageObj.viewHomepage();
        homepageObj.clickDismissBtnHome();
        homepageObj.clickNavLinks();
        homepageObj.clickNavHamMenu();
        homepageObj.viewSections();

    } // end method aTestHomepage
/*
    @Test
    public void bTestSearchAndSearchResults(){

        searchAndSearchResultsObj.enterSearchFieldHome("Laptop");

    } // end method bTestSearchAndSearchResults()
*/
    @Test
    public void cTestCategoryPage(){

        categoryObj.clickLinkShopByCat();
        categoryObj.viewCategory();
        categoryObj.viewLeftNavBrowseBox();

    } // end method bTestCategoryPage

    @Test
    public void dTestProductPage(){

        productObj.viewProduct();
        productObj.clickProductBestSeller();
        productObj.viewProductBestSeller();
        productObj.clickAddToCartConfirmWindow();

    } // end method cTestProductPage()

    @Test
    public void eTestLoginPage() throws FileNotFoundException {

        //loginObj.clickAccountList();
        loginObj.viewLoginUsername();
        loginObj.inputUserCredentials();
        loginObj.viewLoginPassword();
        loginObj.inputPasswordCredentials();

    } // end method cTestLoginPage()

    @AfterTest
    public void quitBrowser() {

        driver.close();
        driver.quit();

    } // end method quitBrowser()

} // end method ECommerceTestCases
