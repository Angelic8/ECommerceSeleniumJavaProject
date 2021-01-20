
package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import page.Homepage;

public class ECommerceTestCases {

    // tools
    private static WebDriver driver;
    private static WebElement element;

    // url
    private static final String appURL = "https://www.amazon.com/";

    // pages
    protected Homepage homepageObj;

    @BeforeTest
    public void setupTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().deleteAllCookies();

        homepageObj = new Homepage();
        homepageObj.setWebDriver(driver);

    } // end method setupTest()

    @Test
    public void testAssert() {

        // Page title
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title matches");
        System.out.println("Page title: " + actualTitle);

    } // end method testAssert

    @Test
    public void testHomepage() {

        homepageObj.clickDismissBtnHome();
        homepageObj.clickNavLinks();
        homepageObj.clickNavHamMenu();
        homepageObj.viewSections();

        
        //homepageObj.enterSearchFieldHome("Laptop");


    } // end method testHomepage

    @AfterTest
    public void quitBrowser() {

        driver.close();
        driver.quit();

    } // end method quitBrowser()

} // end method ECommerceTestCases
