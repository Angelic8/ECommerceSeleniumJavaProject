package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NegativeLogin extends Homepage {

    By emailOrPhoneNumInput_login = By.xpath("//input[@id='ap_email']");
    By userPasswordInput_login = By.xpath("//input[@id='ap_password']");
    By IMessage_login = By.xpath("//span[contains(text(),'To better protect your account, please re-enter yo')]");


    public void inputIncorrectEmailAndPassword(String text){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailOrPhoneNumInput_login));
            element.click();
            element.sendKeys(text);
        }catch (Exception e){
            e.printStackTrace();
        }
    } // end inputIncorrectEmail()

    public void inputPasswordCredentials(String text){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(userPasswordInput_login));
            element.click();
            element.sendKeys(text);
        }catch (Exception e){
            e.printStackTrace();
        }
    } // end inputPasswordCredentials()

    public void loginMessage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(IMessage_login));
            String actualLoginMessage = element.getText();
            System.out.println("Login message: " + actualLoginMessage);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

} // NegativeLogin
