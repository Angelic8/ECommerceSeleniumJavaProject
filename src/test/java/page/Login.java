package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Login extends Homepage {

    By signIn_login = By.xpath("//h1[contains(text(),'Sign-In')]");
    By emailOrPhoneNum_login = By.xpath("//label[contains(text(),'Email or mobile phone number')]");
    By emailOrPhoneNumInput_login = By.xpath("//input[@id='ap_email']");
    By continueBtn_login = By.xpath("//input[@id='continue']");
    By legalTxt_login = By.xpath("//div[@id='legalTextRow']");
    By needHelpLink_login = By.xpath("//span[contains(text(),'Need help?')]");
    By createAcctTxt_login = By.xpath("//h5[contains(text(),'New to Amazon?')]");
    By createAcctBtn_login = By.xpath("//a[@id='createAccountSubmit']");

    public void viewLogin(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(signIn_login));
        String actualSignIn = element.getText();
        String expectedSignIn = "Sign-In";
        Assert.assertEquals(actualSignIn, expectedSignIn, "Title does not match!");
        System.out.println("Title is: " + actualSignIn);

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
        System.out.println("Text is: " + actualCreateAcctTxt);

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(createAcctBtn_login));
        System.out.println("Create your amazon account button is available.");

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailOrPhoneNum_login));
        String actualEmailOrPhoneNum = element.getText();
        String expectedEmailOrPhoneNum = "Email or mobile phone number";
        Assert.assertEquals(actualEmailOrPhoneNum, expectedEmailOrPhoneNum, "Input label does not match!");
        System.out.println("Title is: " + actualEmailOrPhoneNum);

    } // end method viewLogin()

    public void inputUserCredentials(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailOrPhoneNumInput_login));
        element.sendKeys("gabbieeneko@gmail.com");
        System.out.println("Email or phone number input field is available and data is entered.");

        element = wait.until(ExpectedConditions.elementToBeClickable(continueBtn_login));
        element.click();
        System.out.println("Continue button is clicked.");

    } // end method inputUserCredentials()

} // end method Login
