package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

public class Homepage {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static WebElement element;
    protected JavascriptExecutor js;

    public void setWebDriver(WebDriver driver) {
        Homepage.driver = driver;
    } // end manual setter setWebDriver

    By dismissBtn_home = By.className("a-button-inner");
    By navLinks1_home = By.xpath("//a[contains(text(),\"Today's Deals\")]");
    By navLinks2_home = By.xpath("//a[contains(text(),'Customer Service')]");
    By navLinks3_home = By.xpath("//a[contains(text(),'Gift Cards')]");
    By navLinks4_home = By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[4]");
    By navLinks5_home = By.xpath("//a[contains(text(),'Registry')]");
    By navHamMenu_home = By.id("nav-hamburger-menu");
    By navHamMenuTitle1_home = By.xpath("//div[contains(text(),'digital content & devices')]");
    By navHamMenuTitle2_home = By.xpath("//div[contains(text(),'shop by department')]");
    By navHamMenuTitle3_home = By.xpath("//div[contains(text(),'programs & features')]");
    By navHamMenuTitle4_home = By.xpath("//div[contains(text(),'help & settings')]");
    By navHamMenuClose_home = By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas-background']/div[1]");
    By sectionShopCategory_home = By.xpath("//h2[contains(text(),'Shop by Category')]");
    By sectionShopCategories_home = By.xpath("//h2[contains(text(),'Shop top categories')]");
    By sectionDiscoverSite_home = By.xpath("//span[contains(text(),'Discover Amazon')]");
    By sectionTopBeautyProd_home = By.xpath("//span[contains(text(),'Top Beauty & Personal Care products')]");
    By sectionTopSellers_home = By.xpath("//span[contains(text(),'Amazon Top Sellers')]");
    By sectionComfyStyles_home = By.xpath("//h2[contains(text(),'Comfy styles for her')]");
    By sectionGifts_home = By.xpath("//span[contains(text(),'Gifts in Video Games under $30')]");
    By sectionMustHave_home = By.xpath("//span[contains(text(),'Must have Wireless products')]");
    By sectionStuffedToys_home = By.xpath("//span[contains(text(),'Stuffed Animals & Toys under $10')]");
    By sectionBestSellers_home = By.xpath("//span[contains(text(),'Best Sellers in Baby')]");
    By sectionFavToys_home = By.xpath("//span[contains(text(),'Our favorite Toys')]");

    public void viewHomepage(){

        // Page title
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
        System.out.println("Page title: " + actualTitle);

    } // end method viewHomepage()

    public void clickDismissBtnHome() {

        driver.findElement(dismissBtn_home).click();
        System.out.println("Shipping Address Dismiss Button is clicked.");

    } // end method clickDismissBtnHome

    public void clickNavLinks() {

        element = driver.findElement(navLinks1_home);
        String actualTitle1 = element.getText();
        String expectedTitle1 = "Today's Deals";
        Assert.assertEquals(actualTitle1, expectedTitle1, "Title does not match!");
        System.out.println("First navigation title is: " + actualTitle1);

        element = driver.findElement(navLinks2_home);
        String actualTitle2 = element.getText();
        String expectedTitle2 = "Customer Service";
        Assert.assertEquals(actualTitle2, expectedTitle2, "Title does not match!");
        System.out.println("Second navigation title is: " + actualTitle2);

        element = driver.findElement(navLinks3_home);
        String actualTitle3 = element.getText();
        String expectedTitle3 = "Gift Cards";
        Assert.assertEquals(actualTitle3, expectedTitle3, "Title does not match!");
        System.out.println("Third navigation title is: " + actualTitle3);

        element = driver.findElement(navLinks4_home);
        String actualTitle4 = element.getText();
        String expectedTitle4 = "Sell";
        Assert.assertEquals(actualTitle4, expectedTitle4, "Title does not match!");
        System.out.println("Fourth navigation title is: " + actualTitle4);

        element = driver.findElement(navLinks5_home);
        String actualTitle5 = element.getText();
        String expectedTitle5 = "Registry";
        Assert.assertEquals(actualTitle5, expectedTitle5, "Title does not match!");
        System.out.println("Fifth navigation title is: " + actualTitle5);

    } // end method clickNavLinks()

    public void clickNavHamMenu() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(navHamMenu_home).click();
        System.out.println("\nHamburger menu is clicked.");

        String expectedTitle1 = "Digital Content & Devices";
        try{
            element = driver.findElement(navHamMenuTitle1_home);
            String actualTitle1 = element.getText();
            Assert.assertEquals(actualTitle1, expectedTitle1, "Title does not match!");
            System.out.println("Navigation menu title is: " + actualTitle1);
        }catch (Exception e){
            System.out.println(expectedTitle1 + " navigation menu title is not available at the moment.");
        }

        String expectedTitle2 = "Shop By Department";
        try{
            element = driver.findElement(navHamMenuTitle2_home);
            String actualTitle2 = element.getText();
            Assert.assertEquals(actualTitle2, expectedTitle2, "Title does not match!");
            System.out.println("Navigation menu title is: " + actualTitle2);
        }catch (Exception e){
            System.out.println(expectedTitle2 + " navigation menu title is not available at the moment.");
        }

        //js = (JavascriptExecutor) driver;
        //((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,350)", element);
        String expectedTitle3 = "Programs & Features";
        try{
            element = driver.findElement(navHamMenuTitle3_home);
            String actualTitle3 = element.getText();
            Assert.assertEquals(actualTitle3, expectedTitle3, "Title does not match!");
            System.out.println("Navigation menu title is: " + actualTitle3);
        }catch (Exception e){
            System.out.println(expectedTitle3 + " navigation menu title is not available at the moment.");
        }

        String expectedTitle4 = "Help & Settings";
        try{
            element = driver.findElement(navHamMenuTitle4_home);
            String actualTitle4 = element.getText();
            Assert.assertEquals(actualTitle4, expectedTitle4, "Title does not match!");
            System.out.println("Navigation menu title is: " + actualTitle4);
        }catch (Exception e){
            System.out.println(expectedTitle4 + " navigation menu title is not available at the moment.");
        }

        element = wait.until(ExpectedConditions.elementToBeClickable(navHamMenuClose_home));
        element.click();
        System.out.println("Hamburger menu close button is clicked.");

    } // end method clickNavHamMenu

    public void viewSections() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;

        String expectedTitle1 = "Shop by Category";
        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(sectionShopCategory_home));
            String actualTitle1 = element.getText();
            Assert.assertEquals(actualTitle1, expectedTitle1, "Title does not match!");
            System.out.println("\nSection title is: " + actualTitle1);
        }catch (Exception e){
            System.out.println(expectedTitle1 + " section title is not available at the moment.");
        }

        String expectedTitle2 = "Shop top categories";
        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(sectionShopCategories_home));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            String actualTitle2 = element.getText();
            Assert.assertEquals(actualTitle2, expectedTitle2, "Title does not match!");
            System.out.println("Section title is: " + actualTitle2);
        }catch (Exception e){
            System.out.println(expectedTitle2 + " section title is not available at the moment.");
        }

        String expectedTitle3 = "Discover Amazon";
        try{
            element = driver.findElement(sectionDiscoverSite_home);
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            String actualTitle3 = element.getText();
            Assert.assertEquals(actualTitle3, expectedTitle3, "Title does not match!");
            System.out.println("Section title is: " + actualTitle3);
        }catch (Exception e){
            System.out.println(expectedTitle3 + " section title is not available at the moment");
        }

        String expectedTitle4 = "Top Beauty & Personal Care products";
        try{
            element = driver.findElement(sectionTopBeautyProd_home);
            String actualTitle4 = element.getText();
            Assert.assertEquals(actualTitle4, expectedTitle4, "Title does not match!");
            System.out.println("Section title is: " + actualTitle4);
        }catch (Exception e){
            System.out.println(expectedTitle4 + " section is not available at the moment.");
        }

        String expectedTitle5 = "Amazon Top Sellers";
        try{
            element = driver.findElement(sectionTopSellers_home);
            String actualTitle5 = element.getText();
            Assert.assertEquals(actualTitle5, expectedTitle5, "Title does not match!");
            System.out.println("Section title is: " + actualTitle5);
        }catch (Exception e){
            System.out.println(expectedTitle5 + " section is not available at the moment.");
        }

        String expectedTitle6 = "Comfy styles for her";
        try{
            element = driver.findElement(sectionComfyStyles_home);
            String actualTitle6 = element.getText();
            Assert.assertEquals(actualTitle6, expectedTitle6, "Title does not match!");
            System.out.println("Section title is: " + actualTitle6);
        }catch (Exception e){
            System.out.println(expectedTitle6 + "section is not available at the moment.");
        }

        String expectedTitle7 = "Gifts in Video Games under $30";
        try{
            element = driver.findElement(sectionGifts_home);
            String actualTitle7 = element.getText();
            Assert.assertEquals(actualTitle7, expectedTitle7, "Title does not match!");
            System.out.println("Section title is: " + actualTitle7);
        } catch (Exception e){
            System.out.println(expectedTitle7 + " section is not available at the moment.");
        }

        String expectedTitle8 = "Must have Wireless products";
        try{
            element = driver.findElement(sectionMustHave_home);
            String actualTitle8 = element.getText();
            Assert.assertEquals(actualTitle8, expectedTitle8, "Title does not match!");
            System.out.println("Section title is: " + actualTitle8);
        }catch (Exception e){
            System.out.println(expectedTitle8 + " section is not available at the moment.");
        }

        String expectedTitle9 = "Stuffed Animals & Toys under $10";
        try{
            element = driver.findElement(sectionStuffedToys_home);
            String actualTitle9 = element.getText();
            Assert.assertEquals(actualTitle9, expectedTitle9, "Title does not match!");
            System.out.println("Section title is: " + actualTitle9);
        }catch (Exception e){
            System.out.println(expectedTitle9 + " section is not available at the moment.");
        }

        String expectedTitle10 = "Best Sellers in Baby";
        try{
            element = driver.findElement(sectionBestSellers_home);
            String actualTitle10 = element.getText();
            Assert.assertEquals(actualTitle10, expectedTitle10, "Title does not match!");
            System.out.println("Section title is: " + actualTitle10);
        }catch (Exception e){
            System.out.println(expectedTitle10 + " section is not available at the moment.");
        }

        String expectedTitle11 = "Our favorite Toys";
        try{
            element = driver.findElement(sectionFavToys_home);
            String actualTitle11 = element.getText();
            Assert.assertEquals(actualTitle11, expectedTitle11, "Title does not match!");
            System.out.println("Section title is: " + actualTitle11);
        } catch (Exception e){
            System.out.println(expectedTitle11 + " section is not available at the moment.");
        }

    } // end method viewSections

} // end method Homepage
