package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.time.Duration;

public class Login extends Homepage {

    protected static ReadTextFiles readTextFilesObj;

    By acctListsLink_login = By.cssSelector("#nav-link-accountList");
    By signIn_login = By.xpath("//h1[contains(text(),'Sign-In')]");
    By emailOrPhoneNum_login = By.xpath("//label[contains(text(),'Email or mobile phone number')]");
    By emailOrPhoneNumInput_login = By.xpath("//input[@id='ap_email']");
    By continueBtn_login = By.xpath("//input[@id='continue']");
    By legalTxt_login = By.xpath("//div[@id='legalTextRow']");
    By needHelpLink_login = By.xpath("//span[contains(text(),'Need help?')]");
    By createAcctTxt_login = By.xpath("//h5[contains(text(),'New to Amazon?')]");
    By createAcctBtn_login = By.xpath("//a[@id='createAccountSubmit']");
    By userData_login = By.cssSelector("body.ap-locale-en_US.a-m-us.a-aui_157141-c.a-aui_158613-c.a-aui_72554-c.a-aui_dropdown_187959-c.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_tnr_v2_180836-c.a-aui_ux_145937-c.a-meter-animate:nth-child(2) div.a-section.a-padding-medium.auth-workflow:nth-child(2) div.a-section:nth-child(2) div.a-section div.a-section.auth-pagelet-container:nth-child(2) div.a-section.a-spacing-base div.a-box div.a-box-inner.a-padding-extra-large div.a-row.a-spacing-base > span:nth-child(1)");
    By changeClaimLink_login = By.xpath("//a[@id='ap_change_login_claim']");
    By passwordTxt_login = By.xpath("//label[contains(text(),'Password')]");
    By userPasswordInput_login = By.xpath("//input[@id='ap_password']");
    By signInSubmitBtn_login = By.xpath("//input[@id='signInSubmit']");
    By forgotPasswordLink_login = By.xpath("//a[@id='auth-fpp-link-bottom']");
    By rememberMeChkbox_login = By.name("rememberMe");
    By rememberMeTxt_login = By.className("a-checkbox-label");
/*
    public void clickAccountList(){

        driver.findElement(acctListsLink_login).click();

    } // end method clickAccountList()
*/
    public void viewLoginUsername(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(signIn_login));
        String actualSignIn = element.getText();
        String expectedSignIn = "Sign-In";
        Assert.assertEquals(actualSignIn, expectedSignIn, "Title does not match!");
        System.out.println("Section title is: " + actualSignIn);

        // Page title
        String expectedTitle = "Amazon Sign-In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
        System.out.println("Page title: " + actualTitle);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(legalTxt_login));
        String actualLegal = element.getText();
        String expectedLegal = "By continuing, you agree to Amazon's Conditions of Use and Privacy Notice.";
        Assert.assertEquals(actualLegal, expectedLegal, "Legal text does not match!");
        System.out.println("Legal text is: " + actualLegal);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(needHelpLink_login));
        String actualNeedHelp = element.getText();
        String expectedNeedHelp = "Need help?";
        Assert.assertEquals(actualNeedHelp, expectedNeedHelp, "Need Help link does not match!");
        System.out.println("Link is: " + actualNeedHelp);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(createAcctTxt_login));
        String actualCreateAcctTxt = element.getText();
        String expectedCreateAcctTxt = "New to Amazon?";
        Assert.assertEquals(actualCreateAcctTxt, expectedCreateAcctTxt, "Text does not match!");
        System.out.println("Create new account text is: " + actualCreateAcctTxt);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(createAcctBtn_login));
        System.out.println("Create your amazon account button is available.");

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailOrPhoneNum_login));
        String actualEmailOrPhoneNum = element.getText();
        String expectedEmailOrPhoneNum = "Email or mobile phone number";
        Assert.assertEquals(actualEmailOrPhoneNum, expectedEmailOrPhoneNum, "Input label does not match!");
        System.out.println("Input title is: " + actualEmailOrPhoneNum);

    } // end method viewLoginUsername()

    public void inputUserCredentials() throws FileNotFoundException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        readTextFilesObj = new ReadTextFiles();

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailOrPhoneNumInput_login));
        element.sendKeys(readTextFilesObj.getUsername());
        System.out.println("Email or phone number input field is available and data is entered.");

        element = wait.until(ExpectedConditions.elementToBeClickable(continueBtn_login));
        element.click();
        System.out.println("Continue button is clicked.");

    } // end method inputUserCredentials()

    public void viewLoginPassword() throws FileNotFoundException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        readTextFilesObj = new ReadTextFiles();

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(signIn_login));
        String actualSignIn = element.getText();
        String expectedSignIn = "Sign-In";
        Assert.assertEquals(actualSignIn, expectedSignIn, "Title does not match!");
        System.out.println("Section title is: " + actualSignIn);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(userData_login));
        String actualUserData = element.getText();
        String expectedUserData = readTextFilesObj.getUsername();
        Assert.assertEquals(actualUserData, expectedUserData, "Username does not match!");
        System.out.println("Username is: " + actualUserData);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(changeClaimLink_login));
        String actualChangeClaimLink = element.getText();
        String expectChangeClaimLink = "Change";
        Assert.assertEquals(actualChangeClaimLink, expectChangeClaimLink, "Link does not match!");
        System.out.println("Link is: " + actualChangeClaimLink);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPasswordLink_login));
        String actualForgotPasswordLink = element.getText();
        String expectForgotPasswordLink = "Forgot your password?";
        Assert.assertEquals(actualForgotPasswordLink, expectForgotPasswordLink, "Link does not match!");
        System.out.println("Link is: " + actualForgotPasswordLink);

    } // end method viewLoginPassword()

    public void inputPasswordCredentials() throws FileNotFoundException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        readTextFilesObj = new ReadTextFiles();

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTxt_login));
        String actualPasswordTxt = element.getText();
        String expectPasswordTxt = "Password";
        Assert.assertEquals(actualPasswordTxt, expectPasswordTxt, "Label does not match!");
        System.out.println("Label is: " + actualPasswordTxt);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(userPasswordInput_login));
        element.sendKeys(readTextFilesObj.getPassword());
        System.out.println("Password is entered.");

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(rememberMeChkbox_login));
        System.out.println("Keep me signed in checkbox is available.");

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(rememberMeTxt_login));
        String actualRememberMeTxt = element.getText();
        String expectedRememberMeTxt = "Keep me signed in.";

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(signInSubmitBtn_login));
        element.click();
        System.out.println("Sign in submit button is clicked.");

    } // end method inputPasswordCredentials()

} // end method Login
