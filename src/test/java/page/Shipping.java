package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Shipping extends Homepage {

    By title_shipping = By.xpath("//h1[contains(text(),'Select a shipping address')]");
    By newAddress_shipping = By.xpath("//h2[contains(text(),'Add a new address')]");
    By labelCountry_shipping = By.xpath("//span[contains(text(),'Country/Region')]");
    By ddlCountry_shipping = By.xpath("//span[@id='address-ui-widgets-countryCode']");
    By ddlSelectedCountry_shipping = By.cssSelector("div.a-popover.a-dropdown:nth-child(35) div.a-popover-wrapper div.a-popover-inner ul.a-nostyle.a-list-link > li:nth-child(173)");
    By labelFullName_shipping = By.xpath("//span[contains(text(),'Full name (First and Last name)')]");
    By inputFullName_shipping = By.cssSelector("#address-ui-widgets-enterAddressFullName");
    By labelPhoneNumber_shipping = By.xpath("//span[contains(text(),'Phone number')]");
    By inputPhoneNumber_shipping = By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']");
    By labelAddress_shipping = By.xpath("//span[contains(text(),'Street address')]");
    By inputAddress_shipping = By.cssSelector("#address-ui-widgets-enterAddressLine1");
    By inputAddress2_shipping = By.cssSelector("#address-ui-widgets-enterAddressLine2");
    By labelCity_shipping = By.xpath("//span[contains(text(),'City')]");
    By inputCity_shipping = By.cssSelector("#address-ui-widgets-enterAddressCity");
    By labelState_shipping = By.xpath("//span[contains(text(),'State / Province / Region')]");
    By inputState_shipping = By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion");
    By labelZipCode_shipping = By.xpath("//span[contains(text(),'ZIP Code')]");
    By inputZipCode_shipping = By.cssSelector("#address-ui-widgets-enterAddressPostalCode");
    By btnUseAddress_shipping = By.cssSelector("#address-ui-widgets-form-submit-button");

    By title_shippingOptions = By.xpath("//h1[contains(text(),'Choose your shipping options')]");
    By shipment_shippingOptions = By.xpath("//h2[contains(text(),'Shipment 1 of 1')]");
    By shippingFrom_shippingOptions = By.xpath("//h3[contains(text(),'Shipping from Amazon.com')]");
    By shippingTo_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-info.a-spacing-extra-large:nth-child(1) div.order-header div.shipment-n-of-n > div.a-color-secondary.a-spacing-base:nth-child(3)");
    By product_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-info.a-spacing-extra-large:nth-child(1) div.order-header div.shipment-n-of-n ul.order-level-item-summary-list:nth-child(4) li.a-spacing-base div:nth-child(1) > strong:nth-child(1)");
    By price_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-info.a-spacing-extra-large:nth-child(1) div.order-header div.shipment-n-of-n ul.order-level-item-summary-list:nth-child(4) li.a-spacing-base div:nth-child(1) div:nth-child(2) > span.a-color-price");
    By qty_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-info.a-spacing-extra-large:nth-child(1) div.order-header div.shipment-n-of-n ul.order-level-item-summary-list:nth-child(4) li.a-spacing-base div:nth-child(1) div:nth-child(2) > span.a-color-secondary");
    By soldBy_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-info.a-spacing-extra-large:nth-child(1) div.order-header div.shipment-n-of-n ul.order-level-item-summary-list:nth-child(4) li.a-spacing-base div:nth-child(1) div:nth-child(3) > span.a-size-small");
    By deliveryOpt_shippingOptions = By.xpath("//h3[contains(text(),'Choose a delivery option:')]");
    By deliveryOptDesc_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-options.a-spacing-extra-large:nth-child(2) div.slidable-panel:nth-child(1) div.ship-speed:nth-child(1) > div:nth-child(2)");
    By radio1_shippingOptions = By.cssSelector("#order_0_ShippingSpeed_expd-intl-us-asia-ag");
    By option1_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-options.a-spacing-extra-large:nth-child(2) div.slidable-panel:nth-child(1) div.ship-speed:nth-child(1) div.a-spacing-base.a-box-group:nth-child(3) div.fake-label.a-box.a-first.selected:nth-child(1) div.a-box-inner div.a-accordion-row div.description:nth-child(2) span.displayable-value.a-text-normal span.a-color-success.upsell-messaging:nth-child(1) > strong:nth-child(1)");
    By option1Desc_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-options.a-spacing-extra-large:nth-child(2) div.slidable-panel:nth-child(1) div.ship-speed:nth-child(1) div.a-spacing-base.a-box-group:nth-child(3) div.fake-label.a-box.a-first.selected:nth-child(1) div.a-box-inner div.a-accordion-row div.description:nth-child(2) span.displayable-value.a-text-normal > span.a-color-secondary:nth-child(3)");
    By radio2_shippingOptions = By.cssSelector("#order_0_ShippingSpeed_pri-intl-us-asia-ag");
    By option2_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-options.a-spacing-extra-large:nth-child(2) div.slidable-panel:nth-child(1) div.ship-speed:nth-child(1) div.a-spacing-base.a-box-group:nth-child(3) div.fake-label.a-box.a-last:nth-child(2) div.a-box-inner div.a-accordion-row div.description:nth-child(2) span.displayable-value.a-text-normal span.a-color-success.upsell-messaging:nth-child(1) > strong:nth-child(1)");
    By option2Desc_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-options.a-spacing-extra-large:nth-child(2) div.slidable-panel:nth-child(1) div.ship-speed:nth-child(1) div.a-spacing-base.a-box-group:nth-child(3) div.fake-label.a-box.a-last:nth-child(2) div.a-box-inner div.a-accordion-row div.description:nth-child(2) span.displayable-value.a-text-normal > span.a-color-secondary:nth-child(3)");
    By learnMoreLink_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.order-display:nth-child(5) div.one-shipment.a-spacing-extra-large.first-shipment div.one-shipment-options.a-spacing-extra-large:nth-child(2) div.slidable-panel:nth-child(1) div.ship-speed:nth-child(1) div:nth-child(2) > a:nth-child(1)");
    By changeLink_shippingOptions = By.xpath("//a[contains(text(),'Change quantities or delete')]");
    By continueBtn_shippingOptions = By.cssSelector("div.notouch:nth-child(6) div.checkout.sosp.checkout-sosp-desktop:nth-child(1) div.a-container.celwidget:nth-child(2) div.a-container:nth-child(1) div.a-spacing-base.clearfix form.a-spacing-base.checkout-page-form div.a-row:nth-child(6) div.save-sosp-button-box.a-column.a-span4.a-span-last.a-box.a-color-alternate-background.a-right div.a-box-inner span.sosp-continue-button.a-button.a-button-primary.a-button-span12.a-padding-none.continue-button > span.a-button-inner");

    public void viewShipping() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String expectedTitle, expectedText1, actualTitle, actualText1;

        expectedTitle = "Select a shipping address";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(title_shipping));
            actualTitle = element.getText();
            Assert.assertEquals(expectedTitle, actualTitle);
            System.out.println("Page title: " + expectedTitle);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle + " is not available at the moment.");
        }

        expectedText1 = "Add a new address";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(newAddress_shipping));
            actualText1 = element.getText();
            Assert.assertEquals(expectedText1, actualText1);
            System.out.println("Form title: " + expectedText1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedText1 + " is not available at the moment.");
        }

    } // end method viewShipping()

    public void addNewAddress() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String expectedLabel, actualLabel, expectedLabel1, actualLabel1, expectedLabel2, actualLabel2, expectedLabel3, actualLabel3, expectedLabel4, actualLabel4, expectedLabel5, actualLabel5, expectedLabel6, actualLabel6;

        expectedLabel = "Country/Region";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(labelCountry_shipping));
            actualLabel = element.getText();
            System.out.println("Label: " + actualLabel);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedLabel + " is not available at the moment.");
        }

        Thread.sleep(2000);
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(ddlCountry_shipping));
            element.click();
            System.out.println("Dropdown menu is selected.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Dropdown is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(ddlSelectedCountry_shipping));
            element.click();
            System.out.println("Country is selected.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Dropdown is not available at the moment.");
        }

        Thread.sleep(2000);
        expectedLabel1 = "Full name (First and Last name)";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(labelFullName_shipping));
            actualLabel1 = element.getText();
            System.out.println("Label: " + actualLabel1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedLabel1 + " is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputFullName_shipping));
            element.clear();
            element.click();
            element.sendKeys("Gabbie Neko");
            System.out.println("Full Name is entered.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        expectedLabel2 = "Street address";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(labelAddress_shipping));
            actualLabel2 = element.getText();
            System.out.println("Label: " + actualLabel2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedLabel2 + " is not available at this moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputAddress_shipping));
            element.sendKeys("899 San Bernardino");
            System.out.println("Street is entered.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputAddress2_shipping));
            element.sendKeys("Viverra Avenue, Rolling Hills");
            System.out.println("Address is entered.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        expectedLabel3 = "City";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(labelCity_shipping));
            actualLabel3 = element.getText();
            System.out.println("Label: " + actualLabel3);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedLabel3 + " is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputCity_shipping));
            element.sendKeys("Taguig");
            System.out.println("City is entered.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        expectedLabel4 = "State / Province / Region";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(labelState_shipping));
            actualLabel4 = element.getText();
            System.out.println("Label: " + actualLabel4);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedLabel4 + " is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputState_shipping));
            element.sendKeys("Metro Manila");
            System.out.println("Region is entered.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        expectedLabel5 = "ZIP Code";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(labelZipCode_shipping));
            actualLabel5 = element.getText();
            System.out.println("Label: " + actualLabel5);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedLabel5 + " is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputZipCode_shipping));
            element.sendKeys("1630");
            System.out.println("Zip Code is entered.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        expectedLabel6 = "Phone number";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(labelPhoneNumber_shipping));
            actualLabel6 = element.getText();
            System.out.println("Label: " + actualLabel6);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedLabel6 + " is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPhoneNumber_shipping));
            element.sendKeys("639161645400");
            System.out.println("Phone Number is entered.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(btnUseAddress_shipping));
            element.click();
            System.out.println("Use this Address button is clicked.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Button is not available at the moment.");
        }

    } // end method addNewAddress()

    public void viewShippingOptions() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actualText, actualText1, actualText2, actualText3, actualText4, actualText5, actualText6, actualText7, actualText8, actualText9, actualText10, actualText11, actualText12, actualText13, radioBtn1, radioBtn2;

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(title_shippingOptions));
        actualText = element.getText();
        System.out.println("\nTitle: " + actualText);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(shipment_shippingOptions));
        actualText1 = element.getText();
        System.out.println("Shipment: " + actualText1);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(shippingFrom_shippingOptions));
        actualText2 = element.getText();
        System.out.println("From: " + actualText2);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(shippingTo_shippingOptions));
        actualText3 = element.getText();
        System.out.println("To: " + actualText3);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(product_shippingOptions));
        actualText4 = element.getText();
        System.out.println("Product: " + actualText4);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(price_shippingOptions));
        actualText5 = element.getText();
        System.out.println("Price: " + actualText5);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(qty_shippingOptions));
        actualText6 = element.getText();
        System.out.println("Quantity: " + actualText6);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(soldBy_shippingOptions));
        actualText7 = element.getText();
        System.out.println("Sold By: " + actualText7);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(deliveryOpt_shippingOptions));
        actualText8 = element.getText();
        System.out.println("Delivery Option: " + actualText8);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(deliveryOptDesc_shippingOptions));
        actualText9 = element.getText();
        System.out.println("Delivery Description: " + actualText9);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(option1_shippingOptions));
        actualText10 = element.getText();
        System.out.println("Option 1: " + actualText10);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(option1Desc_shippingOptions));
        actualText11 = element.getText();
        System.out.println("Option 1 Description: " + actualText11);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(option2_shippingOptions));
        actualText12 = element.getText();
        System.out.println("Option 2: " + actualText12);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(option2Desc_shippingOptions));
        actualText13 = element.getText();
        System.out.println("Option 2 Description: " + actualText13);

        radioBtn1 = driver.findElement(radio1_shippingOptions).getAttribute("checked");
        if (radioBtn1.equalsIgnoreCase("true")) {
            System.out.println("Option 1: averages 5-10 business days radio button is checked.");
        } else if (radioBtn1.equalsIgnoreCase("false")) {
            System.out.println("Option 1: averages 5-10 business days radio button is not checked.");
        } // end if-else

        radioBtn2 = driver.findElement(radio1_shippingOptions).getAttribute("checked");
        if (radioBtn2.equalsIgnoreCase("true")) {
            System.out.println("Option 2: Tuesday, Feb. 23 - Tuesday, Mar. 2 is checked.");
        } else if (radioBtn2.equalsIgnoreCase("false")) {
            System.out.println("Option 2: Tuesday, Feb. 23 - Tuesday, Mar. 2 radio button is not checked.");
        } // end if-else

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(continueBtn_shippingOptions));
        } catch (Exception e) {
            System.out.println("Continue button is clicked.");
        }

    } // end method viewShippingOptions()

} // end class Shipping
