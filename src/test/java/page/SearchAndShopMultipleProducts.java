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

    public void searchForLaptopAccessories(String text){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = driver.findElement(searchField_home);
        element.sendKeys(text);

        element = driver.findElement(searchBtn_home);
        element.click();

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



} // end SearchAndShopMultipleProducts
