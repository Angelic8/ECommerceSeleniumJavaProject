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
    By list_viewResults = By.className("s-line-clamp-2");
    By list_countResults = By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/div[1]/span[1]/h1[1]/div[1]/div[1]/div[1]/div[1]/span[1]");
    By list_searchTerm = By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/div[1]/span[1]/h1[1]/div[1]/div[1]/div[1]/div[1]/span[3]");

    public void enterSearchFieldHome(String text) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = driver.findElement(searchField_home);
        element.sendKeys(text);

        element = driver.findElement(searchBtn_home);
        element.click();

        element = wait.until(ExpectedConditions.visibilityOfElementLocated(list_searchResults));
        String searchList = element.getText();
        System.out.println("\nFirst Search Result: " + searchList);

    } // end method enterSearchFieldHome

    public void viewListResults() {

        List<WebElement> test;
        int countDiv, number;
        WebElement count, searchTerm;
        String countTotal, searchTermText, value;

        number = 1;
        test = driver.findElements(list_viewResults);
        countDiv = test.size();
        count = driver.findElement(list_countResults);
        countTotal = count.getText();
        searchTerm = driver.findElement(list_searchTerm);
        searchTermText = searchTerm.getText();

        System.out.println("Title: " + test);
        System.out.println("Div size: " + countDiv);
        System.out.println("Total count: " + countTotal + " " + searchTermText);
        System.out.println("\nSearch Results: ");

        // Used to print matching results
        for (WebElement results : test) {

            value = results.getText();

            if (value == null || value.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(number++ + " Value: " + value);
            } // end if-else

        } // end for-loop

    } // end method viewListResults()

    public void clearFields() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        element = driver.findElement(searchField_home);
        element.clear();

    } // end method clearFields()

} // end method SearchAndSearchResults
