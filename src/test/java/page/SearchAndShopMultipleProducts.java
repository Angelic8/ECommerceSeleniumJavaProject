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
    By USBHeadsetLink_product = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h2[1]/a[1]/span[1]");
    By USBHeadsetTitle_product = By.xpath("//span[@id='productTitle']");
    By size_product = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='centerCol']/div[@id='twister_feature_div']/div[@id='twisterContainer']/div[1]/form[1]/div[1]/span[1]/span[1]/span[1]/span[1]");
    By size1_product = By.cssSelector("#native_dropdown_selected_size_name_1");
    By seeSimilarItems_product = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='exports_desktop_buybox']/div[@id='exportsBuybox']/div[@id='exports_desktop_unqualifiedBuyBox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[2]/div[1]/span[1]/span[1]/input[1]");
    By seeSimilarAddToCartBtn_product = By.xpath("//tbody/tr[8]/td[2]/div[1]/span[2]/span[1]/input[1]");


    public void searchForItems(String text){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            element.clear();
            element = driver.findElement(searchField_home);
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
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(cartBtn_product));
        element.click();
    }

    public void viewUSBHeadset(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(USBHeadsetLink_product));
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
    }

    public void selectSize1Pack(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(size_product));
            element.click();
            System.out.println("Size dropdown menu is clicked.");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(size1_product));
            element.click();
            System.out.println("1 Pack is selected.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void seeSimilarItems(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(seeSimilarItems_product));
            element.click();
            System.out.println("See Similar Items button is clicked");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void seeSimilarItemsAddToCartBtn(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(seeSimilarAddToCartBtn_product));
            element.click();
            System.out.println("Add to cart button on similar items window is clicked.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }




} // end SearchAndShopMultipleProducts
