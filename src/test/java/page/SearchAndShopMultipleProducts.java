package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SearchAndShopMultipleProducts extends Homepage {

    By searchField_home = By.id("twotabsearchtextbox");
    By searchBtn_home = By.id("nav-search-submit-button");
    By laptopAccLink_searchResults = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h2[1]");
    By title_product = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h2[1]/a[1]/span[1]");
    By price_product = By.xpath("//span[@id='price_inside_buybox']");
    By qty_product = By.cssSelector("#a-autoid-0-announce");
    By qty3_product = By.cssSelector("#quantity_2");
    By addToCartBtn_product = By.cssSelector("#add-to-cart-button");
    By cartBtn_product = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='attachAccessoryModal_feature_div']/div[@id='attach-dss-placeholder']/div[@id='attach-desktop-sideSheet']/div[@id='attach-accessory-pane']/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]");
    By USBHeadsetLink_product = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h2[1]/a[1]/span[1]");
    By USBHeadsetTitle_product = By.xpath("//span[@id='productTitle']");
    By USBHeadsetBrand_product = By.xpath("//body[1]/div[2]/div[2]/div[9]/div[4]/div[4]/div[36]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]");
    By wifiRouterLink_searchResults = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h2[1]/a[1]/span[1]");
    By wifiRouterPrice_product = By.xpath("//span[@id='price_inside_buybox']");
    By wallChargerTitleLink_product = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h2[1]/a[1]/span[1]");
    By wallChargerTitle_product = By.xpath("//span[@id='productTitle']");
    By wallChargerPrice_product = By.xpath("//span[@id='price_inside_buybox']");
    By wallChargerDDate_product = By.xpath("//div[@id='mir-layout-DELIVERY_BLOCK-slot-DELIVERY_MESSAGE']");


    public void searchForItems(String text){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(searchField_home));
            element.clear();
            element.sendKeys(text);

            element = driver.findElement(searchBtn_home);
            element.click();
            System.out.println("Search for item: " + text);
        }catch (Exception e){
            e.printStackTrace();
        }

    } // end searchForLaptopAccessories()

    public void viewLaptopAccessories(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(laptopAccLink_searchResults));

        element = driver.findElement(title_product);
        String productTitle = element.getText();
        System.out.println("Product Title: " + productTitle);
        element.click();
    } // end viewLaptopAccessories()

    public void laptopPrice(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        String expectedPrice = "$25.99";
        try {
            element = driver.findElement(price_product);
            String actualProductPrice = element.getText();
            Assert.assertEquals(actualProductPrice, expectedPrice,"Price does not match!");
            System.out.println("Product Price: " + actualProductPrice);
        }catch (Exception e){
            e.printStackTrace();
        }
    } // end laptopPrice()

    public void select3Qty(){
        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(qty_product));
            element.click();
            System.out.println("Quantity dropdown menu is clicked.");
            element = driver.findElement(qty3_product);
            element.click();
            System.out.println("Quantity 3 is clicked.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clickAddToCartBtn(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartBtn_product));
            element.click();
            System.out.println("Add to cart button is clicked.");
        }catch (Exception e){
            e.printStackTrace();
        }
    } // end clickAddToCartBtn()

    public void clickCartBtn(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(cartBtn_product));
        element.click();
    }

    public void viewUSBHeadset(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            element = driver.findElement(USBHeadsetLink_product);
            element.click();
            System.out.println("USB Headset Link is clicked.");
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(USBHeadsetTitle_product));
            String actualUSBHeadsetTitle = element.getText();
            System.out.println("Product Title is: " + actualUSBHeadsetTitle);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(USBHeadsetBrand_product));
            String actualUSBHeadsetBrand = element.getText();
            System.out.println("Features: " + actualUSBHeadsetBrand);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void viewWifiRouter(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(wifiRouterLink_searchResults));
            element.click();
            System.out.println("Wifi Router link is clicked.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Wifi Router link is not available at the moment.");
        }
    }

    public void wifiRouterPrice(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(wifiRouterPrice_product));
        String actualWifiPRice = element.getText();
        System.out.println("Wifi Router Price: " + actualWifiPRice);
    }

    public void viewWallCharger(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(wallChargerTitleLink_product));
            element.click();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(wallChargerTitle_product));
            String actualWallCharger = element.getText();
            System.out.println("Product title: " + actualWallCharger);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(wallChargerPrice_product));
            //element = driver.findElement(wallChargerPrice_product);
            String actualWallChargerPrice = element.getText();
            System.out.println("Wall Charger Price: " + actualWallChargerPrice);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(wallChargerDDate_product));
            String actualWallChargerDate = element.getText();
            System.out.println("Wall Charger Delivery Date: " + actualWallChargerDate);
        }catch (Exception e){
            e.printStackTrace();
        }

    }






} // end SearchAndShopMultipleProducts
