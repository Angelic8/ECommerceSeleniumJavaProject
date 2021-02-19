package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentMethod extends Homepage {

    By title_paymentMethod = By.xpath("//h1[contains(text(),'Select a payment method')]");
    By subtitle_paymentMethod = By.xpath("//h2[contains(text(),'Add a Payment Method')]");
    By creditDebit_paymentMethod = By.xpath("//span[contains(text(),'Credit or debit cards')]");
    By creditDebitDesc_paymentMethod = By.xpath("//div[contains(text(),'Amazon accepts major credit and debit cards.')]");
    By addCreditDebitCardBtn_paymentMethod = By.cssSelector("div.checkout.desktop.aui-templatized:nth-child(3) div.a-container div.a-section.a-spacing-base:nth-child(2) div.a-section.a-spacing-none.pmts-widget-section.pmts-portal-root-mf5wf5kl9Kll.pmts-portal-component.pmts-portal-components-pp-O9nwUF-1:nth-child(1) div.a-section.pmts-portal-component.pmts-portal-components-pp-O9nwUF-2:nth-child(2) div.a-row.a-relative.aok-relative:nth-child(2) div.a-column.a-span9.pmts-payment-instruments-container-classic.pmts-add-payment-instruments-wrapper:nth-child(1) div.a-section.a-spacing-base.pmts-portal-component.pmts-portal-components-pp-O9nwUF-7 div.a-section.pmts-portal-component.pmts-portal-components-pp-O9nwUF-50:nth-child(2) div.a-row.a-expander-container.a-spacing-base.a-expander-extend-container.pmts-add-cc.add-instrument-form-expander div.a-expander-content.a-spacing-base.a-expander-extend-content div.a-section.pmts-add-credit-card-component-container div.a-row.a-spacing-medium.pmts-portal-component.pmts-portal-components-pp-O9nwUF-51 span.a-declarative span.a-button.a-button-base.apx-secure-registration-content-trigger-js:nth-child(1) > span.a-button-inner");
    By payCashAtLocation_paymentMethod = By.xpath("//span[contains(text(),'Pay with cash at a location near you')]");
    By payCashAtLocationDesc_paymentMethod = By.xpath("//span[contains(text(),'Order ships after you pay')]");
    By linkSetUpAmazonPayCode_paymentMethod = By.xpath("//span[contains(text(),'Set up Amazon PayCode')]");
    By giftCardsVouchersCodes_paymentMethod = By.xpath("//span[contains(text(),'Gift Cards, Vouchers & Promotional Codes')]");
    By linkGiftCardsVouchersCodes_paymentMethod = By.xpath("//span[contains(text(),'Enter a gift card, voucher or promotional code')]");
    By amazonStoreCard_paymentMethod = By.xpath("//span[contains(text(),'Amazon.com Store Card')]");
    By amazonStoreCardDesc_paymentMethod = By.xpath("//div[contains(text(),'Access to exclusive financing offers. No annual fe')]");
    By linkLearnMore_paymentMethod = By.cssSelector("div.checkout.desktop.aui-templatized:nth-child(3) div.a-container div.a-section.a-spacing-base:nth-child(2) div.a-section.a-spacing-none.pmts-widget-section.pmts-portal-root-mf5wf5kl9Kll.pmts-portal-component.pmts-portal-components-pp-O9nwUF-1:nth-child(1) div.a-section.pmts-portal-component.pmts-portal-components-pp-O9nwUF-2:nth-child(2) div.a-row.a-relative.aok-relative:nth-child(2) div.a-column.a-span9.pmts-payment-instruments-container-classic.pmts-add-payment-instruments-wrapper:nth-child(1) div.a-section.a-spacing-base.pmts-portal-component.pmts-portal-components-pp-O9nwUF-7 div.a-row.a-spacing-base.pmts-portal-component.pmts-portal-components-pp-O9nwUF-56:nth-child(8) div.a-column.a-span9:nth-child(1) div.a-row:nth-child(2) > a.a-link-normal.pmts-add-amazon-store-card-learn-more-link");
    By personalCheckingAcct_paymentMethod = By.xpath("//span[contains(text(),'Personal Checking Accounts')]");
    By personalCheckingAcctDesc_paymentMethod = By.xpath("//body/div[@id='checkoutDisplayPage']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]");
    By addPersonalCheckAcctBtn_paymentMethod = By.cssSelector("div.checkout.desktop.aui-templatized:nth-child(3) div.a-container div.a-section.a-spacing-base:nth-child(2) div.a-section.a-spacing-none.pmts-widget-section.pmts-portal-root-mf5wf5kl9Kll.pmts-portal-component.pmts-portal-components-pp-O9nwUF-1:nth-child(1) div.a-section.pmts-portal-component.pmts-portal-components-pp-O9nwUF-2:nth-child(2) div.a-row.a-relative.aok-relative:nth-child(2) div.a-column.a-span9.pmts-payment-instruments-container-classic.pmts-add-payment-instruments-wrapper:nth-child(1) div.a-section.a-spacing-base.pmts-portal-component.pmts-portal-components-pp-O9nwUF-7 div.a-section.pmts-portal-component.pmts-portal-components-pp-O9nwUF-44:nth-child(10) div.a-row.a-expander-container.a-spacing-base.a-expander-extend-container.pmts-add-ba.add-instrument-form-expander div.a-expander-content.a-spacing-base.a-expander-extend-content div.a-row.a-spacing-medium.pmts-portal-component.pmts-portal-components-pp-O9nwUF-45 span.a-declarative span.a-button.a-button-base.apx-secure-registration-content-trigger-js:nth-child(1) > span.a-button-inner");

    public void viewPaymentMethod() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actualTitle1, actualText1, actualText2, actualText3, actualText4, actualText5, actualText6, actualText7, actualText8, actualText9, actualText10, actualText11, actualText12, actualText13, actualText14, actualText15;

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(title_paymentMethod));
        actualTitle1 = element.getText();
        System.out.println("Title: " + actualTitle1);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(subtitle_paymentMethod));
        actualText1 = element.getText();
        System.out.println("Title: " + actualText1);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(creditDebit_paymentMethod));
        actualText2 = element.getText();
        System.out.println("Title: " + actualText2);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(creditDebitDesc_paymentMethod));
        actualText3 = element.getText();
        System.out.println("Title: " + actualText3);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(addCreditDebitCardBtn_paymentMethod));
        actualText4 = element.getText();
        System.out.println("Title: " + actualText4);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(payCashAtLocation_paymentMethod));
        actualText5 = element.getText();
        System.out.println("Title: " + actualText5);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(payCashAtLocationDesc_paymentMethod));
        actualText6 = element.getText();
        System.out.println("Title: " + actualText6);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(linkSetUpAmazonPayCode_paymentMethod));
        actualText7 = element.getText();
        System.out.println("Title: " + actualText7);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(giftCardsVouchersCodes_paymentMethod));
        actualText8 = element.getText();
        System.out.println("Title: " + actualText8);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(linkGiftCardsVouchersCodes_paymentMethod));
        actualText9 = element.getText();
        System.out.println("Title: " + actualText9);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(amazonStoreCard_paymentMethod));
        actualText10 = element.getText();
        System.out.println("Title: " + actualText10);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(amazonStoreCardDesc_paymentMethod));
        actualText11 = element.getText();
        System.out.println("Title: " + actualText11);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(linkLearnMore_paymentMethod));
        actualText12 = element.getText();
        System.out.println("Title: " + actualText12);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(personalCheckingAcct_paymentMethod));
        actualText13 = element.getText();
        System.out.println("Title: " + actualText13);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(personalCheckingAcctDesc_paymentMethod));
        actualText14 = element.getText();
        System.out.println("Title: " + actualText14);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(addPersonalCheckAcctBtn_paymentMethod));
        actualText15 = element.getText();
        System.out.println("Title: " + actualText15);

    } // end method viewPaymentMethod()

} // end class PaymentMethod
