package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import page.ShoppingBill;

public class Product extends Homepage {

    //ShoppingBill shoppingBillObj;
    protected String expectedTitle1, expectedQty, actualTitle1, expectedTitle2, actualTitle2, actualPrice, expectedShippingImportFees, actualShippingImportFees, expectedDeliveryDate, actualDeliveryDate, actualDefaultQty, actualQty, expectedCartSubtotal, actualCartSubtotal, actualCartSubtotalPrice, expectedTitle, actualTitle;
    protected String expectedPrice, expectedDefaultQty;

    By prodBestSeller_product = By.xpath("//span[contains(text(),'Acer Aspire 5 Slim Laptop, 15.6 inches Full HD IPS')]");
    By prodTitle_product = By.xpath("//span[@id='productTitle']");
    By prodPrice_product = By.xpath("//span[@id='price_inside_buybox']");
    By prodShippingImportFees_product = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='exports_desktop_buybox']/div[@id='exportsBuybox']/div[@id='exports_desktop_qualifiedBuybox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]");
    By prodDeliveryDate_product = By.xpath("//div[@id='deliveryMessageMirId']");
    By prodAvailability_product = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='exports_desktop_buybox']/div[@id='exportsBuybox']/div[@id='exports_desktop_qualifiedBuybox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]");
    By prodQuantity_product = By.xpath("//span[@id='a-autoid-0-announce']");
    By prodQuantity0_product = By.cssSelector("#a-autoid-0-announce");

    By prodQuantity1_product = By.cssSelector("#quantity_1");
    By prodAddToCartBtn_product = By.xpath("//input[@id='add-to-cart-button']");
    By prodCartSubtotal_product = By.xpath("//span[@id='attach-accessory-cart-total-string']");
    By prodCartSubtotalPrice_product = By.xpath("//span[@id='attach-accessory-cart-subtotal']");
    By prodProcToCheckoutBtn_product = By.xpath("//span[@id='attach-sidesheet-checkout-button']");

    public void viewProduct() {

        // Page title
        expectedTitle = "Amazon.com";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
        System.out.println("Page title: " + actualTitle);

    } // end method viewProduct()

    public void clickProductBestSeller() {

        try {
            driver.findElement(prodBestSeller_product).click();
            System.out.println("Best selling product is clicked.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Best selling product is not available at the moment.");
        }

    } // end method clickProductBestSeller()

    public void viewProductBestSeller() {

        //shoppingBillObj = new ShoppingBill();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Product Page title
        expectedTitle1 = "Amazon.com: Acer Aspire 5 Slim Laptop, 15.6 inches Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, 128GB SSD, Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L, Silver";
        try {
            actualTitle1 = driver.getTitle();
            Assert.assertEquals(actualTitle1, expectedTitle1, "Product page title does not match!");
            System.out.println("Product page title: " + actualTitle1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle1 + " is not available at the moment.");
        }

        expectedTitle2 = "Acer Aspire 5 Slim Laptop, 15.6 inches Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, 128GB SSD, Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L, Silver";
        try {
            element = driver.findElement(prodTitle_product);
            actualTitle2 = element.getText();
            Assert.assertEquals(actualTitle2, expectedTitle2, "Product title does not match!");
            System.out.println("Product Title is :" + actualTitle2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle2 + " is not available at the moment.");
        }

        expectedPrice = "$439.00";

        try {
            element = driver.findElement(prodPrice_product);
            actualPrice = element.getText();
            Assert.assertEquals(actualPrice, expectedPrice, "Product price does not match!");
            System.out.println("Product Price is: " + actualPrice);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedPrice + " is not available at the moment.");
        }

        expectedShippingImportFees = "$221.60 Shipping & Import Fees Deposit to Philippines";
        try {
            element = driver.findElement(prodShippingImportFees_product);
            actualShippingImportFees = element.getText();
            Assert.assertEquals(actualShippingImportFees, expectedShippingImportFees, "Shipping and import fees does not match!");
            System.out.println("Shipping and Import Fees is: " + actualShippingImportFees);
        } catch (Exception e) {
            System.out.println("Shipping and Import Fees have been changed.");
        }

        expectedDeliveryDate = "Arrives: March 26 - April 28";
        try {
            element = driver.findElement(prodDeliveryDate_product);
            actualDeliveryDate = element.getText();
            Assert.assertEquals(actualDeliveryDate, expectedDeliveryDate, "Delivery date does not match!");
            System.out.println("Delivery date is: " + expectedDeliveryDate);
        } catch (Exception e) {
            System.out.println("Delivery date has changed.");
        }

        expectedDefaultQty = "Qty:1";
        try {
            element = driver.findElement(prodQuantity0_product);
            actualDefaultQty = element.getText();
            Assert.assertEquals(actualDefaultQty, expectedDefaultQty, "Default quantity does not match!");
            System.out.println("Default quantity is: " + actualDefaultQty);
            element.click();
            System.out.println("Quantity dropdown button is clicked.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedDefaultQty + " is not available at the moment.");
        }

        expectedQty = "2";
        try {
            element = driver.findElement(prodQuantity1_product);
            actualQty = element.getText();
            Assert.assertEquals(actualQty, expectedQty, "Quantity does not match!");
            System.out.println("Selected quantity is: " + actualQty);
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedQty + " is not available at the moment.");
        }

        try {
            driver.findElement(prodAddToCartBtn_product).click();
            System.out.println("Add to cart button is clicked.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Add to cart button is not available at the moment.");
        }

        expectedCartSubtotal = "Cart subtotal (2 items):";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(prodCartSubtotal_product));
            actualCartSubtotal = element.getText();
            Assert.assertEquals(actualCartSubtotal, expectedCartSubtotal, "Cart Subtotal does not match!");
            System.out.println("Cart Subtotal is: " + actualCartSubtotal);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(expectedCartSubtotal + " is not available at the moment.");
        }

        String newTotalAmt = "$878.00";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(prodCartSubtotalPrice_product));
            actualCartSubtotalPrice = element.getText();
            Assert.assertEquals(actualCartSubtotalPrice,newTotalAmt, "Cart Subtotal price does not match!");
            System.out.println("Cart Subtotal price is: " + actualCartSubtotalPrice);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(newTotalAmt + " is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(prodProcToCheckoutBtn_product));
            element.click();
            System.out.println("Proceed to checkout button is clicked on Add to Cart Confirmation window.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Proceed to checkout button is not available at the moment.");
        }

    } // end method viewProductBestSeller

} // end method Product
