package page;

import org.apache.xmlbeans.GDuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Product extends Homepage{

    By prodBestSeller_product = By.xpath("//h2[contains(text(),'Acer Aspire 5 Slim Laptop, 15.6 inches Full HD IPS')]");
    By prodTitle_product = By.xpath("//span[@id='productTitle']");
    By prodPrice_product = By.xpath("//span[@id='price_inside_buybox']");
    By prodShippingImportFees_product = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='exports_desktop_buybox']/div[@id='exportsBuybox']/div[@id='exports_desktop_qualifiedBuybox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]");
    By prodDeliveryDate_product = By.xpath("//div[@id='deliveryMessageMirId']");
    By prodAvailability_product = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='exports_desktop_buybox']/div[@id='exportsBuybox']/div[@id='exports_desktop_qualifiedBuybox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]");
    By prodQuantity_product = By.xpath("//span[@id='a-autoid-0-announce']");
    By prodQuantity0_product = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='exports_desktop_buybox']/div[@id='exportsBuybox']/div[@id='exports_desktop_qualifiedBuybox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[2]");
    By prodQuantity1_product = By.xpath("//a[@id='quantity_1']");
    By prodAddToCartBtn_product = By.xpath("//input[@id='add-to-cart-button']");
    By prodCartSubtotal_product = By.xpath("//span[@id='attach-accessory-cart-total-string']");
    By prodCartSubtotalPrice_product = By.xpath("//span[@id='attach-accessory-cart-subtotal']");
    By prodProcToCheckoutBtn_product = By.xpath("//span[@id='attach-sidesheet-checkout-button']");

    public void viewProduct(){

        // Page title
        String expectedTitle = "International Shopping: Shop Computers that Ship Internationally";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
        System.out.println("Page title: " + actualTitle);

    } // end method viewProduct()

    public void clickProductBestSeller(){

        driver.findElement(prodBestSeller_product).click();
        System.out.println("Best selling product is clicked.");

    } // end method clickProductBestSeller()

    public void viewProductBestSeller(){

        // Product Page title
        String expectedTitle1 = "Amazon.com: Acer Aspire 5 Slim Laptop, 15.6 inches Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, 128GB SSD, Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L, Silver: Computers & Accessories";
        String actualTitle1 = driver.getTitle();
        Assert.assertEquals(actualTitle1, expectedTitle1, "Product page title does not match!");
        System.out.println("Product page title: " + actualTitle1);

        element = driver.findElement(prodTitle_product);
        String actualTitle2 = element.getText();
        String expectedTitle2 = "Acer Aspire 5 Slim Laptop, 15.6 inches Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, 128GB SSD, Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L, Silver";
        Assert.assertEquals(actualTitle2, expectedTitle2, "Product title does not match!");
        System.out.println("Product Title is :" + actualTitle2);

        element = driver.findElement(prodPrice_product);
        String actualPrice = element.getText();
        String expectedPrice = "$364.99";
        Assert.assertEquals(actualPrice, expectedPrice, "Product price does not match!");
        System.out.println("Product Price is: " + actualPrice);

        try{
            element = driver.findElement(prodShippingImportFees_product);
            String actualShippingImportFees = element.getText();
            String expectedShippingImportFees = "$171.60 Shipping & Import Fees Deposit to Philippines";
            Assert.assertEquals(actualShippingImportFees, expectedShippingImportFees, "Shipping and import fees does not match!");
            System.out.println("Shipping and Import Fees is: " + actualShippingImportFees);
        } catch (Exception e){
            System.out.println("Shipping and Import Fees had changed.");
        }

        try{
            element = driver.findElement(prodDeliveryDate_product);
            String actualDeliveryDate = element.getText();
            String expectedDeliveryDate = "Arrives: Feb 24 - April 12";
            Assert.assertEquals(actualDeliveryDate, expectedDeliveryDate, "Delivery date does not match!");
            System.out.println("Delivery date is: " + expectedDeliveryDate);
        } catch (Exception e){
            System.out.println("Delivery date has changed.");
        }

        element = driver.findElement(prodAvailability_product);
        String actualAvailability = element.getText();
        String expectedAvailability = "In Stock.";
        Assert.assertEquals(actualAvailability, expectedAvailability, "Product availability does not match!");
        System.out.println("Availability is: " + actualAvailability);

        element = driver.findElement(prodQuantity0_product);
        String actualDefaultQty = element.getText();
        String expectedDefaultQty = "1";
        Assert.assertEquals(actualDefaultQty, expectedDefaultQty, "Default quantity does not match!");
        System.out.println("Default quantity is: " + actualDefaultQty);

        element.click();
        System.out.println("Quantity dropdown button is clicked.");

        element = driver.findElement(prodQuantity1_product);
        String actualQty = element.getText();
        String expectedQty = "2";
        Assert.assertEquals(actualQty, expectedQty, "Quantity does not match!");
        System.out.println("Selected quantity is: " + actualQty);
        element.click();

    } // end method viewProductBestSeller

    public void clickAddToCartConfirmWindow(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(prodAddToCartBtn_product).click();
        System.out.println("Add to cart button is clicked.");

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(prodCartSubtotal_product));
        String actualCartSubtotal = element.getText();
        String expectedCartSubtotal = "Cart subtotal (2 items):";
        Assert.assertEquals(actualCartSubtotal, expectedCartSubtotal, "Cart Subtotal does not match!");
        System.out.println("Cart Subtotal is: " + actualCartSubtotal);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(prodCartSubtotalPrice_product));
        String actualCartSubtotalPrice = element.getText();
        String expectedCartSubtotalPrice = "$729.98";
        Assert.assertEquals(actualCartSubtotalPrice, expectedCartSubtotalPrice, "Cart Subtotal price does not match!");
        System.out.println("Cart Subtotal price is: " + actualCartSubtotalPrice);

        element = wait.until(ExpectedConditions.elementToBeClickable(prodProcToCheckoutBtn_product));
        element.click();
        System.out.println("Proceed to checkout button is clicked on Add to Cart Confirmation window.");

    } // end method clickAddToCartBtn()

} // end method Product
