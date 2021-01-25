package page;

import org.openqa.selenium.By;

public class SearchAndSearchResults extends Homepage {

    By searchField_home = By.id("twotabsearchtextbox");

    public void enterSearchFieldHome(String text) {

        element = driver.findElement(searchField_home);
        element.sendKeys(text);

        
    } // end method enterSearchFieldHome

} // end method SearchAndSearchResults
