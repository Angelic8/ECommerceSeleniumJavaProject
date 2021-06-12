package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.time.Duration;

public class Login extends Homepage {

    protected static ReadTextFiles readTextFilesObj;

    By acctListsLink_login = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    By signIn_login = By.xpath("//h1[contains(text(),'Sign-In')]");
    By emailOrPhoneNum_login = By.xpath("//label[contains(text(),'Email or mobile phone number')]");
    By emailOrPhoneNumInput_login = By.xpath("//input[@id='ap_email']");
    By continueBtn_login = By.xpath("//input[@id='continue']");
    By legalTxt_login = By.xpath("//div[@id='legalTextRow']");
    By needHelpLink_login = By.xpath("//span[contains(text(),'Need help?')]");
    By createAcctTxt_login = By.xpath("//h5[contains(text(),'New to Amazon?')]");
    By createAcctBtn_login = By.xpath("//a[@id='createAccountSubmit']");
    By userData_login = By.cssSelector("body.ap-locale-en_US.a-m-us.a-aui_72554-c.a-aui_mm_desktop_exp_291916-c.a-aui_mm_desktop_launch_291918-c.a-aui_mm_desktop_targeted_exp_291928-t1.a-aui_mm_desktop_targeted_launch_291922-t1.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-section.a-padding-medium.auth-workflow:nth-child(2) div.a-section:nth-child(2) div.a-section div.a-section.auth-pagelet-container:nth-child(2) div.a-section.a-spacing-base div.a-box div.a-box-inner.a-padding-extra-large div.a-row.a-spacing-base > span:nth-child(1)");
    By changeClaimLink_login = By.xpath("//a[@id='ap_change_login_claim']");
    By passwordTxt_login = By.xpath("//label[contains(text(),'Password')]");
    By userPasswordInput_login = By.xpath("//input[@id='ap_password']");
    By signInSubmitBtn_login = By.xpath("//input[@id='signInSubmit']");
    By forgotPasswordLink_login = By.xpath("//a[@id='auth-fpp-link-bottom']");
    By rememberMeChkbox_login = By.name("rememberMe");
    By rememberMeTxt_login = By.className("a-checkbox-label");


    public void clickAccountList() {

        driver.findElement(acctListsLink_login).click();

    } // end method clickAccountList()

    public void viewLoginUsername() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String expectedSignIn, actualSignIn, expectedTitle, actualTitle, expectedLegal, actualLegal, expectedNeedHelp, actualNeedHelp, expectedCreateAcctTxt, actualCreateAcctTxt, expectedEmailOrPhoneNum, actualEmailOrPhoneNum;

        expectedSignIn = "Sign-In";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(signIn_login));
            actualSignIn = element.getText();
            Assert.assertEquals(actualSignIn, expectedSignIn, "Title does not match!");
            System.out.println("Section title is: " + actualSignIn);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedSignIn + " is not available at the moment.");
        }

        // Page title
        expectedTitle = "Amazon Sign-In";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
        System.out.println("Page title: " + actualTitle);

        expectedLegal = "By continuing, you agree to Amazon's Conditions of Use and Privacy Notice.";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(legalTxt_login));
            actualLegal = element.getText();
            Assert.assertEquals(actualLegal, expectedLegal, "Legal text does not match!");
            System.out.println("Legal text is: " + actualLegal);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedLegal + " is not available at the moment.");
        }

        expectedNeedHelp = "Need help?";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(needHelpLink_login));
            actualNeedHelp = element.getText();
            Assert.assertEquals(actualNeedHelp, expectedNeedHelp, "Need Help link does not match!");
            System.out.println("Link is: " + actualNeedHelp);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedNeedHelp + " is not available at the moment.");
        }

        expectedCreateAcctTxt = "New to Amazon?";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(createAcctTxt_login));
            actualCreateAcctTxt = element.getText();
            Assert.assertEquals(actualCreateAcctTxt, expectedCreateAcctTxt, "Text does not match!");
            System.out.println("Create new account text is: " + actualCreateAcctTxt);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedCreateAcctTxt + " is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(createAcctBtn_login));
            System.out.println("Create your amazon account button is available.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Create your amazon account button is not available at the moment.");
        }

        expectedEmailOrPhoneNum = "Email or mobile phone number";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailOrPhoneNum_login));
            actualEmailOrPhoneNum = element.getText();
            Assert.assertEquals(actualEmailOrPhoneNum, expectedEmailOrPhoneNum, "Input label does not match!");
            System.out.println("Input title is: " + actualEmailOrPhoneNum);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedEmailOrPhoneNum + " is not available at the moment.");
        }

    } // end method viewLoginUsername()

    public void inputUserCredentials() throws FileNotFoundException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        readTextFilesObj = new ReadTextFiles();

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailOrPhoneNumInput_login));
            element.sendKeys(readTextFilesObj.getUsername());
            System.out.println("Email or phone number input field is available and data is entered.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Email or phone number input field is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(continueBtn_login));
            element.click();
            System.out.println("Continue button is clicked.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Continue button is not available at the moment.");
        }

    } // end method inputUserCredentials()

    public void viewLoginPassword() throws FileNotFoundException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String expectedSignIn, actualSignIn, expectedUserData, actualUserData, expectedChangeClaimLink, actualChangeClaimLink, expectedForgotPasswordLink, actualForgotPasswordLink;

        expectedSignIn = "Sign-In";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(signIn_login));
            actualSignIn = element.getText();
            Assert.assertEquals(actualSignIn, expectedSignIn, "Title does not match!");
            System.out.println("Section title is: " + actualSignIn);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedSignIn + " is not available at the moment.");
        }

        expectedUserData = readTextFilesObj.getUsername();
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(userData_login));
            actualUserData = element.getText();
            Assert.assertEquals(actualUserData, expectedUserData, "Username does not match!");
            System.out.println("Username is: " + actualUserData);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Username is not available at the moment.");
        }

        expectedChangeClaimLink = "Change";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(changeClaimLink_login));
            actualChangeClaimLink = element.getText();
            Assert.assertEquals(actualChangeClaimLink, expectedChangeClaimLink, "Link does not match!");
            System.out.println("Link is: " + actualChangeClaimLink);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedChangeClaimLink + " is not available at the moment.");
        }

        expectedForgotPasswordLink = "Forgot your password?";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPasswordLink_login));
            actualForgotPasswordLink = element.getText();
            Assert.assertEquals(actualForgotPasswordLink, expectedForgotPasswordLink, "Link does not match!");
            System.out.println("Link is: " + actualForgotPasswordLink);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedForgotPasswordLink + " is not available at the moment.");
        }

    } // end method viewLoginPassword()

    public void inputPasswordCredentials() throws FileNotFoundException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String expectedPasswordTxt, actualPasswordTxt, expectedRememberMeTxt, actualRememberMeTxt;

        expectedPasswordTxt = "Password";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTxt_login));
            actualPasswordTxt = element.getText();
            Assert.assertEquals(actualPasswordTxt, expectedPasswordTxt, "Label does not match!");
            System.out.println("Label is: " + actualPasswordTxt);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedPasswordTxt + " is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(userPasswordInput_login));
            element.sendKeys(readTextFilesObj.getPassword());
            System.out.println("Password is entered.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Password is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(rememberMeChkbox_login));
            System.out.println("Keep me signed in checkbox is available.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Keep me signed in checkbox is not available at the moment.");
        }

        expectedRememberMeTxt = "Keep me signed in.";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(rememberMeTxt_login));
            actualRememberMeTxt = element.getText();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedRememberMeTxt + " is not available at the moment.");
        }

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(signInSubmitBtn_login));
            element.click();
            System.out.println("Sign in submit button is clicked.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sign in submit button is not available at the moment.");
        }

    } // end method inputPasswordCredentials()

} // end method Login
