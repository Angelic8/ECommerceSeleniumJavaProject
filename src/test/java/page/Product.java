package page;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Product extends Homepage{

    By prodBestSeller_productPage = By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
    By prodTitle_productPage = By.xpath("//span[@id='productTitle']");
    By prodPrice_productPage = By.xpath("//span[@id='price_inside_buybox']");
    By prodShippingImportFees_productPage = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='exports_desktop_buybox']/div[@id='exportsBuybox']/div[@id='exports_desktop_qualifiedBuybox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]");
    By prodDeliveryDate_productPage = By.xpath("//div[@id='deliveryMessageMirId']");
    By prodAvailability_productPage = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='exports_desktop_buybox']/div[@id='exportsBuybox']/div[@id='exports_desktop_qualifiedBuybox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]");
    By prodQuantity_productPage = By.xpath("//span[@id='a-autoid-0-announce']");
    By prodQuantity0_productPage = By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[@id='rightCol']/div[@id='desktop_buybox']/div[@id='buybox']/div[@id='exports_desktop_buybox']/div[@id='exportsBuybox']/div[@id='exports_desktop_qualifiedBuybox']/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[2]");
    By prodQuantity1_productPage = By.xpath("//a[@id='quantity_1']");
    By prodAddToCart_productPage = By.xpath("//input[@id='add-to-cart-button']");
    By prodProceedToCheckout_productPage = By.xpath("//span[@id='attach-sidesheet-checkout-button']");

    public void clickProductBestSeller(){

        driver.findElement(prodBestSeller_productPage).click();
        System.out.println("Best selling product is clicked.");

    } // end method clickProductBestSeller()

    public void viewProductBestSeller(){

        element = driver.findElement(prodTitle_productPage);
        String actualTitle = element.getText();
        String expectedTitle = "Acer Aspire 5 Slim Laptop, 15.6 inches Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, 128GB SSD, Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L, Silver";
        Assert.assertEquals(actualTitle, expectedTitle, "Product title does not match!");
        System.out.println("Product Title is :" + actualTitle);

        element = driver.findElement(prodPrice_productPage);
        String actualPrice = element.getText();
        String expectedPrice = "$364.99";
        Assert.assertEquals(actualPrice, expectedPrice, "Product price does not match!");
        System.out.println("Product Price is: " + actualPrice);

        element = driver.findElement(prodShippingImportFees_productPage);
        String actualShippingImportFees = element.getText();
        String expectedShippingImportFees = "$117.81 Shipping & Import Fees Deposit to Philippines";
        Assert.assertEquals(actualShippingImportFees, expectedShippingImportFees, "Shipping and import fees does not match!");
        System.out.println("Shipping and Import Fees is: " + actualShippingImportFees);

        element = driver.findElement(prodDeliveryDate_productPage);
        String actualDeliveryDate = element.getText();
        String expectedDeliveryDate = "Arrives: Jan 28 - March 9";
        Assert.assertEquals(actualDeliveryDate, expectedDeliveryDate, "Delivery date does not match!");
        System.out.println("Delivery date is: " + expectedDeliveryDate);

        element = driver.findElement(prodAvailability_productPage);
        String actualAvailability = element.getText();
        String expectedAvailability = "In Stock.";
        Assert.assertEquals(actualAvailability, expectedAvailability, "Product availability does not match!");
        System.out.println("Availability is: " + actualAvailability);

        element = driver.findElement(prodQuantity0_productPage);
        String actualDefaultQty = element.getText();
        String expectedDefaultQty = "1";
        Assert.assertEquals(actualDefaultQty, expectedDefaultQty, "Default quantity does not match!");
        System.out.println("Default quantity is: " + actualDefaultQty);

        element.click();
        System.out.println("Quantity dropdown button is clicked.");

        element = driver.findElement(prodQuantity1_productPage);
        String actualQty = element.getText();
        String expectedQty = "2";
        Assert.assertEquals(actualQty, expectedQty, "Quantity does not match!");
        System.out.println("Selected quantity is: " + actualQty);
        element.click();

    } // end method viewProductBestSeller

    public void clickAddToCartBtn(){

        driver.findElement(prodAddToCart_productPage).click();
        System.out.println("Add to cart button is clicked.");

        driver.findElement(prodProceedToCheckout_productPage).click();
        System.out.println("Proceed to checkout button is clicked.");

    } // end method clickAddToCartBtn()

} // end method Product
