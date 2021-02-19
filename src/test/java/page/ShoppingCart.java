package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCart extends Homepage {

    By title_shoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By linkDeselectItems_shoppingCart = By.xpath("//a[@id='deselect-all']");
    By productTitle_shoppingCart = By.cssSelector("body.a-m-us.a-aui_149818-c.a-aui_152852-c.a-aui_157141-c.a-aui_160684-c.a-aui_57326-c.a-aui_72554-c.a-aui_accessibility_49860-c.a-aui_attr_validations_1_51371-c.a-aui_bolt_62845-c.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_tnr_v2_180836-c.a-aui_ux_113788-c.a-aui_ux_114039-c.a-aui_ux_138741-c.a-aui_ux_145937-c.a-aui_ux_60000-c:nth-child(2) div.a-container.sc-background-dark:nth-child(5) div.a-section.a-spacing-none div.a-fixed-right-flipped-grid:nth-child(7) div.a-fixed-right-grid-inner div.a-fixed-right-grid-col.sc-retail-cart-column-spacing.a-col-left:nth-child(2) div.a-cardui.sc-card-style.sc-list.sc-java-remote-feature.celwidget.sc-card-spacing-top-none:nth-child(4) div.a-cardui-body div.a-row.a-spacing-mini.sc-list-body.sc-java-remote-feature:nth-child(7) div.a-row.sc-list-item.sc-list-item-border.sc-java-remote-feature div.sc-list-item-content div.a-row.a-spacing-base.a-spacing-top-base div.a-column.a-span10:nth-child(1) div.a-fixed-left-grid div.a-fixed-left-grid-inner div.a-fixed-left-grid-col.a-col-right:nth-child(2) ul.a-unordered-list.a-nostyle.a-vertical.a-spacing-mini li:nth-child(1) span.a-list-item a.a-link-normal.sc-product-link > span.a-size-medium.sc-product-title.a-text-bold");
    By inStock_shoppingCart = By.xpath("//primary[contains(text(),'In Stock')]");
    By qty_shoppingCart = By.cssSelector("body.a-m-us.a-aui_149818-c.a-aui_152852-c.a-aui_157141-c.a-aui_160684-c.a-aui_57326-c.a-aui_72554-c.a-aui_accessibility_49860-c.a-aui_attr_validations_1_51371-c.a-aui_bolt_62845-c.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_tnr_v2_180836-c.a-aui_ux_113788-c.a-aui_ux_114039-c.a-aui_ux_138741-c.a-aui_ux_145937-c.a-aui_ux_60000-c:nth-child(2) div.a-container.sc-background-dark:nth-child(5) div.a-section.a-spacing-none div.a-fixed-right-flipped-grid:nth-child(7) div.a-fixed-right-grid-inner div.a-fixed-right-grid-col.sc-retail-cart-column-spacing.a-col-left:nth-child(2) div.a-cardui.sc-card-style.sc-list.sc-java-remote-feature.celwidget.sc-card-spacing-top-none:nth-child(4) div.a-cardui-body div.a-row.a-spacing-mini.sc-list-body.sc-java-remote-feature:nth-child(7) div.a-row.sc-list-item.sc-list-item-border.sc-java-remote-feature div.sc-list-item-content div.a-row.a-spacing-base.a-spacing-top-base div.a-column.a-span10:nth-child(1) div.a-fixed-left-grid div.a-fixed-left-grid-inner div.a-fixed-left-grid-col.a-col-right:nth-child(2) div.a-row.sc-action-links span.sc-action-quantity:nth-child(1) span.sc-invisible-when-no-js:nth-child(1) span.a-dropdown-container span.a-button.a-button-dropdown.quantity:nth-child(3) span.a-button-inner span.a-button-text.a-declarative > span.a-dropdown-prompt");
    By productPrice_shoppingCart = By.cssSelector("body.a-m-us.a-aui_149818-c.a-aui_152852-c.a-aui_157141-c.a-aui_160684-c.a-aui_57326-c.a-aui_72554-c.a-aui_accessibility_49860-c.a-aui_attr_validations_1_51371-c.a-aui_bolt_62845-c.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_tnr_v2_180836-c.a-aui_ux_113788-c.a-aui_ux_114039-c.a-aui_ux_138741-c.a-aui_ux_145937-c.a-aui_ux_60000-c:nth-child(2) div.a-container.sc-background-dark:nth-child(5) div.a-section.a-spacing-none div.a-fixed-right-flipped-grid:nth-child(7) div.a-fixed-right-grid-inner div.a-fixed-right-grid-col.sc-retail-cart-column-spacing.a-col-left:nth-child(2) div.a-cardui.sc-card-style.sc-list.sc-java-remote-feature.celwidget.sc-card-spacing-top-none:nth-child(4) div.a-cardui-body div.a-row.a-spacing-mini.sc-list-body.sc-java-remote-feature:nth-child(7) div.a-row.sc-list-item.sc-list-item-border.sc-java-remote-feature div.sc-list-item-content div.a-row.a-spacing-base.a-spacing-top-base div.a-column.a-span2.a-text-right.sc-item-right-col.a-span-last:nth-child(2) p.a-spacing-small > span.a-size-medium.a-color-base.sc-price.sc-white-space-nowrap.sc-product-price.a-text-bold");
    By productSubtotal_shoppingCart = By.cssSelector("body.a-m-us.a-aui_149818-c.a-aui_152852-c.a-aui_157141-c.a-aui_160684-c.a-aui_57326-c.a-aui_72554-c.a-aui_accessibility_49860-c.a-aui_attr_validations_1_51371-c.a-aui_bolt_62845-c.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_tnr_v2_180836-c.a-aui_ux_113788-c.a-aui_ux_114039-c.a-aui_ux_138741-c.a-aui_ux_145937-c.a-aui_ux_60000-c:nth-child(2) div.a-container.sc-background-dark:nth-child(5) div.a-section.a-spacing-none div.a-fixed-right-flipped-grid:nth-child(7) div.a-fixed-right-grid-inner div.a-fixed-right-grid-col.sc-retail-cart-column-spacing.a-col-left:nth-child(2) div.a-cardui.sc-card-style.sc-list.sc-java-remote-feature.celwidget.sc-card-spacing-top-none:nth-child(4) div.a-cardui-body form:nth-child(3) div.a-row.a-spacing-mini.sc-subtotal.sc-subtotal-activecart.sc-java-remote-feature:nth-child(8) span.a-color-price.sc-price-container.a-text-bold > span.a-size-medium.a-color-base.sc-price.sc-white-space-nowrap");
    By subtotalItemsActive_shoppingCart = By.cssSelector("#sc-subtotal-label-activecart");
    By subtotalItemsBuy_shoppingCart = By.cssSelector("#sc-subtotal-label-buybox");
    By proceedToCheckoutBtn_shoppingCart = By.cssSelector("body.a-m-us.a-aui_149818-c.a-aui_152852-c.a-aui_157141-c.a-aui_160684-c.a-aui_57326-c.a-aui_72554-c.a-aui_accessibility_49860-c.a-aui_attr_validations_1_51371-c.a-aui_bolt_62845-c.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_tnr_v2_180836-c.a-aui_ux_113788-c.a-aui_ux_114039-c.a-aui_ux_138741-c.a-aui_ux_145937-c.a-aui_ux_60000-c:nth-child(2) div.a-container.sc-background-dark:nth-child(5) div.a-section.a-spacing-none div.a-fixed-right-flipped-grid:nth-child(7) div.a-fixed-right-grid-inner div.a-fixed-right-grid-col.a-col-right:nth-child(1) div.a-cardui.sc-card-style.sc-java-remote-feature.celwidget.sc-card-spacing-top-none:nth-child(2) div.a-cardui-body div.a-box-group.sc-buy-box-group:nth-child(1) div.a-section.sc-buy-box-inner-box:nth-child(2) span.a-button.a-button-normal.a-button-span12.a-button-primary:nth-child(3) span.a-button-inner > input.a-button-input");

    public void viewShoppingCart(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actualTitle, actualText1, actualText2, actualText3, actualText4, actualText5, actualText6, actualText7, actualText8;

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(title_shoppingCart));
        actualTitle = element.getText();
        System.out.println("Title: " + actualTitle);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle_shoppingCart));
        actualText1 = element.getText();
        System.out.println("Product Title: " + actualText1);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(inStock_shoppingCart));
        actualText2 = element.getText();
        System.out.println("Product Availability: " + actualText2);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(qty_shoppingCart));
        actualText3 = element.getText();
        System.out.println("Product Quantity: " + actualText3);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(productPrice_shoppingCart));
        actualText4 = element.getText();
        System.out.println("Product Price: " + actualText4);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(productSubtotal_shoppingCart));
        actualText5 = element.getText();
        System.out.println("Product Subtotal: " + actualText5);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(subtotalItemsActive_shoppingCart));
        actualText6 = element.getText();
        System.out.println("Items in Active Box: " + actualText6);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(subtotalItemsBuy_shoppingCart));
        actualText7 = element.getText();
        System.out.println("Items in Buy Box: " + actualText7);

    } // end method viewShoppingCart()

    public void proceedToCheckout(){

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckoutBtn_shoppingCart));
            element.click();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Proceed to checkout button is clicked on Shopping Cart.");
        }

    } // end method proceedToCheckout()

} // end class ShoppingCart
