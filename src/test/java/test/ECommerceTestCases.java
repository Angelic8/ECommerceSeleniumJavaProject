
package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import page.Category;
import page.Homepage;
import page.Product;

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

    } // end method setupTest()

    @Test
    public void aTestHomepage() {

        // Page title
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
        System.out.println("Page title: " + actualTitle);

        homepageObj.clickDismissBtnHome();
        homepageObj.clickNavLinks();
        homepageObj.clickNavHamMenu();
        homepageObj.viewSections();
        //homepageObj.enterSearchFieldHome("Laptop");

    } // end method aTestHomepage

    @Test
    public void bTestCategoryPage(){

        categoryObj.clickLinkShopByCat();

        // Page title
        String expectedTitle = "International Best Sellers | Amazon.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match.");
        System.out.println("Page title: " + actualTitle);

        categoryObj.viewLeftNavBrowseBox();

    } // end method bTestCategoryPage

    @Test
    public void cTestProductPage(){

        // Page title
        String expectTitle = "International Shopping: Shop Computers that Ship Internationally";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectTitle, "Page title does not match!");
        System.out.println("Page title: " + actualTitle);

        productObj.clickProductBestSeller();

        // Product Page title
        String expectTitle1 = "Amazon.com: Acer Aspire 5 Slim Laptop, 15.6 inches Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, 128GB SSD, Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L, Silver: Computers & Accessories";
        String actualTitle1 = driver.getTitle();
        Assert.assertEquals(actualTitle1, expectTitle1, "Product page title does not match!");
        System.out.println("Product page title: " + actualTitle1);

        productObj.viewProductBestSeller();
        productObj.clickAddToCartConfirmWindow();

    } // end method cTestProductPage()

    @AfterTest
    public void quitBrowser() {

        driver.close();
        driver.quit();

    } // end method quitBrowser()

} // end method ECommerceTestCases
