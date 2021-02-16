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
    By ddlCountry_shipping = By.xpath("//span[@id='address-ui-widgets-countryCode']");
    By ddlSelectedCountry_shipping = By.cssSelector("div.a-popover.a-dropdown:nth-child(35) div.a-popover-wrapper div.a-popover-inner ul.a-nostyle.a-list-link > li:nth-child(173)");
    By inputFullName_shipping = By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']");
    By inputPhoneNumber_shipping = By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']");
    By inputAddress_shipping = By.id("#address-ui-widgets-enterAddressLine1");
    By inputAddress2_shipping = By.id("#address-ui-widgets-enterAddressLine2");
    By inputCity_shipping = By.id("#address-ui-widgets-enterAddressCity");
    By inputState_shipping = By.cssSelector("div.checkout.checkout-as.checkout-as-desktop:nth-child(7) div.a-container:nth-child(2) div.a-row div.a-span6.a-column div.a-spacing-double-large.a-row.on-imb-scroll-here div.a-span10.a-column.celwidget div.a-section:nth-child(1) div.a-row:nth-child(2) div.a-input-text-group.a-spacing-medium.a-spacing-top-medium div.a-row:nth-child(10) div.a-column.a-span4:nth-child(2) div.a-section.a-spacing-none.adddress-ui-widgets-form-field-container:nth-child(2) span.a-dropdown-container span.a-button.a-button-dropdown.a-spacing-none.address-ui-widgets-desktop-form-field-full-width > span.a-button-inner");
    By inputZipCode_shipping = By.cssSelector("#address-ui-widgets-enterAddressPostalCode");
    By btnUseAddress_shipping = By.cssSelector("div.checkout.checkout-as.checkout-as-desktop:nth-child(7) div.a-container:nth-child(2) div.a-row div.a-span6.a-column div.a-spacing-double-large.a-row.on-imb-scroll-here div.a-span10.a-column.celwidget div.a-section:nth-child(1) span.a-declarative:nth-child(8) span.a-button.a-button-primary span.a-button-inner > input.a-button-input");


    public void viewShipping(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String expectedTitle, expectedText1, actualTitle, actualText1;

        expectedTitle = "Select a shipping address";
        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(title_shipping));
            actualTitle = element.getText();
            Assert.assertEquals(expectedTitle,actualTitle);
            System.out.println("Page title: " + expectedTitle);
        }catch (Exception e){
            e.printStackTrace();
        }

    } // end method viewShipping()

    public void addNewAddress(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(ddlCountry_shipping));
            element.click();
            System.out.println("Dropdown menu is selected.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Dropdown is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(ddlSelectedCountry_shipping));
            element.click();
            System.out.println("Country is selected.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Dropdown is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputFullName_shipping));
            element.sendKeys("Gabbie Neko");
            System.out.println("Full Name is entered.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputAddress_shipping));
            element.sendKeys("899 San Bernardino");
            System.out.println("Street is entered.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputAddress2_shipping));
            element.sendKeys("Viverra Avenue, Rolling Hills");
            System.out.println("Address is entered.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputCity_shipping));
            element.sendKeys("Taguig");
            System.out.println("City is entered.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputState_shipping));
            element.sendKeys("Metro Manila");
            System.out.println("Region is entered.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputZipCode_shipping));
            element.sendKeys("1630");
            System.out.println("Zip Code is entered.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPhoneNumber_shipping));
            element.sendKeys("639161645400");
            System.out.println("Phone Number is entered.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(btnUseAddress_shipping));
            element.click();
            System.out.println("Use this Address button is clicked.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Button is not available at the moment.");
        }

    } // end method addNewAddress()

} // end class Shipping
