
package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import page.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

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
    protected static Shipping shippingObj;

    @BeforeTest
    public void setupTest() {

        // Push Notifications
        // 1 - Create a map to store preferences (Chrome)
        Map<String, Object> prefs = new HashMap<String, Object>();

        // 2- Add key and value to map as follow to switch off browser notification
        // Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 1);

        // 3- Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // 4 - Set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);

        WebDriverManager.chromedriver().setup();

        // 5 - Now Pass ChromeOptions instance to ChromeDriver Constructor
        // To initialize chrome driver which will switch off this browser notification on the chrome browser
        driver = new ChromeDriver(options);

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

        shippingObj = new Shipping();
        shippingObj.setWebDriver(driver);

    } // end method setupTest()

    @Test(priority = 1)
    public void testHomepage() {

        homepageObj.viewHomepage();
        homepageObj.clickDismissBtnHome();
        homepageObj.clickNavLinks();
        homepageObj.clickNavHamMenu();
        homepageObj.viewSections();

    } // end method testHomepage

    @Test(priority = 2)
    public void testSearchAndSearchResults(){

        searchAndSearchResultsObj.enterSearchFieldHome("Laptop");
        searchAndSearchResultsObj.viewListResults();
        searchAndSearchResultsObj.clearFields();
        searchAndSearchResultsObj.enterSearchFieldHome("Mouse");
        searchAndSearchResultsObj.viewListResults();
        searchAndSearchResultsObj.clearFields();
        searchAndSearchResultsObj.enterSearchFieldHome("Keyboard");
        searchAndSearchResultsObj.viewListResults();
        searchAndSearchResultsObj.clearFields();
        searchAndSearchResultsObj.enterSearchFieldHome("PC");
        searchAndSearchResultsObj.viewListResults();
        searchAndSearchResultsObj.clearFields();
        searchAndSearchResultsObj.enterSearchFieldHome("Desktop Processor");
        searchAndSearchResultsObj.viewListResults();
        searchAndSearchResultsObj.clearFields();
        searchAndSearchResultsObj.enterSearchFieldHome("Motherboard");
        searchAndSearchResultsObj.viewListResults();
        searchAndSearchResultsObj.clearFields();
        searchAndSearchResultsObj.enterSearchFieldHome("Ram");
        searchAndSearchResultsObj.viewListResults();
        searchAndSearchResultsObj.clearFields();
        searchAndSearchResultsObj.enterSearchFieldHome("Computer Server");
        searchAndSearchResultsObj.viewListResults();
        searchAndSearchResultsObj.clearFields();
        homepageObj.clickHome();

    } // end method testSearchAndSearchResults()


    @Test(priority = 3)
    public void testCategoryPage(){

        categoryObj.clickLinkShopByCat();
        categoryObj.viewCategory();
        categoryObj.viewLeftNavBrowseBox();

    } // end method testCategoryPage

    @Test(priority = 4)
    public void testProductPage(){

        productObj.viewProduct();
        productObj.clickProductBestSeller();
        productObj.viewProductBestSeller();
        productObj.clickAddToCartConfirmWindow();

    } // end method testProductPage()

    @Test(priority = 5)
    public void testLoginPage() throws FileNotFoundException {

        //loginObj.clickAccountList();
        loginObj.viewLoginUsername();
        loginObj.inputUserCredentials();
        loginObj.viewLoginPassword();
        loginObj.inputPasswordCredentials();

    } // end method testLoginPage()

    @Test(priority = 6)
    public void testShipping() throws InterruptedException {

        shippingObj.viewShipping();
        shippingObj.addNewAddress();

    } // end method testShipping()


    @AfterTest
    public void quitBrowser() {

        driver.close();
        driver.quit();

    } // end method quitBrowser()

} // end method ECommerceTestCases
