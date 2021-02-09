package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class SearchAndSearchResults extends Homepage {

    By searchField_home = By.id("twotabsearchtextbox");
    By searchBtn_home = By.id("nav-search-submit-button");
    By list_searchResults = By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']");


    public void enterSearchFieldHome(String text) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = driver.findElement(searchField_home);
        element.sendKeys(text);

        element = driver.findElement(searchBtn_home);
        element.click();

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(list_searchResults));
        String searchList = element.getText();
        System.out.println("Result: " + searchList);

    } // end method enterSearchFieldHome

    public void viewListResults(){

        List<WebElement> test = driver.findElements(By.className("s-line-clamp-2"));
        int countDiv = test.size();

        System.out.println("Div size: " + countDiv);
        System.out.println("Title: " + test);
        System.out.println("\nSearch Results: ");

        // Used to print matching results
        for (WebElement results: test){

            String value = results.getText();
            System.out.println("Value: " + value);

        } // end for-loop

    } // end method viewListResults()


} // end method SearchAndSearchResults
