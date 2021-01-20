package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Category extends Homepage {

    By linkShopByCat_homePage = By.className("a-cardui-footer");
    By leftNavBrowseBox_catPage = By.xpath("//h3[contains(text(),'Departments')]");
    By leftNavBrowseBoxList1_catPage = By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    By leftNavBrowseBoxList2_catPage = By.xpath("//a[contains(text(),'Amazon International Shopping')]");
    By leftNavBrowseBoxList3_catPage = By.xpath("//a[contains(text(),'Arts & Crafts')]");
    By leftNavBrowseBoxList4_catPage = By.xpath("//a[contains(text(),'Automotive')]");
    By leftNavBrowseBoxList5_catPage = By.xpath("//a[contains(text(),'Baby')]");
    By leftNavBrowseBoxList6_catPage = By.xpath("//a[contains(text(),'Beauty & Personal Care')]");
    By leftNavBrowseBoxList7_catPage = By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[7]/a[1]");
    By leftNavBrowseBoxList8_catPage = By.xpath("//a[contains(text(),'Computers')]");

    public void clickLinkShopByCat() {

        driver.findElement(linkShopByCat_homePage).click();
        System.out.println("\nShop now link of Shop by Category is clicked.");

    } // end method clickLinkShopByCat()

    public void viewLeftNavBrowseBox(){

        element = driver.findElement(leftNavBrowseBox_catPage);
        String actualTitle1 = element.getText();
        String expectedTitle1 = "Departments";
        Assert.assertEquals(actualTitle1, expectedTitle1, "Title does not match!");
        System.out.println("Left Navigation's Browse Box Title is: " + actualTitle1);

        element = driver.findElement(leftNavBrowseBoxList1_catPage);
        String actualListTitle1 = element.getText();
        String expectedListTitle1 = "Deals";
        Assert.assertEquals(actualListTitle1, expectedListTitle1, "List title does not match!");
        System.out.println("Browse Box's List Title is: " + actualListTitle1);

        element = driver.findElement(leftNavBrowseBoxList2_catPage);
        String actualListTitle2 = element.getText();
        String expectedListTitle2 = "Amazon International Shopping";
        Assert.assertEquals(actualListTitle2, expectedListTitle2, "List title does not match!");
        System.out.println("Browse Box's List Title is: " + actualListTitle2);

        element = driver.findElement(leftNavBrowseBoxList3_catPage);
        String actualListTitle3 = element.getText();
        String expectedListTitle3 = "Arts & Crafts";
        Assert.assertEquals(actualListTitle3, expectedListTitle3, "List title does not match!");
        System.out.println("Browse Box's List Title is: " + actualListTitle3);

        element = driver.findElement(leftNavBrowseBoxList4_catPage);
        String actualListTitle4 = element.getText();
        String expectedListTitle4 = "Automotive";
        Assert.assertEquals(actualListTitle4, expectedListTitle4, "List title does not match!");
        System.out.println("Browse Box's List Title is: " + actualListTitle4);

        element = driver.findElement(leftNavBrowseBoxList5_catPage);
        String actualListTitle5 = element.getText();
        String expectedListTitle5 = "Baby";
        Assert.assertEquals(actualListTitle5, expectedListTitle5, "List title does not match!");
        System.out.println("Browse Box's List Title is: " + actualListTitle5);

        element = driver.findElement(leftNavBrowseBoxList6_catPage);
        String actualListTitle6 = element.getText();
        String expectedListTitle6 = "Beauty & Personal Care";
        Assert.assertEquals(actualListTitle6, expectedListTitle6, "List title does not match!");
        System.out.println("Browse Box's List Title is: " + actualListTitle6);

        element = driver.findElement(leftNavBrowseBoxList7_catPage);
        String actualListTitle7 = element.getText();
        String expectedListTitle7 = "Books";
        Assert.assertEquals(actualListTitle7, expectedListTitle7);
        System.out.println("Browse Box's List Title is: " + actualListTitle7);

        element = driver.findElement(leftNavBrowseBoxList8_catPage);
        String actualListTitle8 = element.getText();
        String expectedListTitle8 = "Computers";
        Assert.assertEquals(actualListTitle8, expectedListTitle8, "List title does not match!");
        System.out.println("Browse Box's List Title is: " + actualListTitle8);
        element.click();
        System.out.println("Computers link is clicked.");

    } // end method viewLeftNavBrowseBox()

} // end method Category
