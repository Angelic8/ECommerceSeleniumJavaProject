package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Category extends Homepage {

    By linkShopByCat_homePage = By.xpath("//body[1]/div[1]/div[2]/div[3]/div[1]/div[5]/div[1]/div[3]/a[1]");
    //By linkShopByCat_homePage = By.cssSelector("body.a-m-us.a-aui_72554-c.a-aui_mm_desktop_exp_291916-c.a-aui_mm_desktop_launch_291918-c.a-aui_mm_desktop_targeted_exp_291928-c.a-aui_mm_desktop_targeted_launch_291922-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_tnr_v2_180836-c:nth-child(2) div.a-section.a-spacing-none:nth-child(30) div.a-section.a-spacing-none.aok-relative:nth-child(8) div.a-section.a-spacing-none.gw-card-layout:nth-child(1) div.gw-col.celwidget.csm-placement-id-e5b0c85f-569c-4c90-a58f-0c0a260e45a0.desktop-gateway-atf_c5a5ae71-f3c1-4f61-bf7d-323ae610f968.pd_rd_wg-K81oT.pd_rd_w-X3k7I.pd_rd_r-c94a33b0-41f7-4deb-a381-37c415ba6f8f:nth-child(4) div.a-cardui.quad-label-card.card-lite.quad-image-label:nth-child(2) div.a-cardui-footer > a.a-link-normal.see-more.truncate-1line");
    By bestSellers_catPage = By.xpath("//h2[contains(text(),'Computers & Accessories')]");
    By leftNavBrowseBox_catPage = By.xpath("//h3[contains(text(),'Departments')]");
    By leftNavBrowseBoxList1_catPage = By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    By leftNavBrowseBoxList2_catPage = By.xpath("//a[contains(text(),'Amazon International Shopping')]");
    By leftNavBrowseBoxList3_catPage = By.xpath("//a[contains(text(),'Arts & Crafts')]");
    By leftNavBrowseBoxList4_catPage = By.xpath("//a[contains(text(),'Automotive')]");
    By leftNavBrowseBoxList5_catPage = By.xpath("//a[contains(text(),'Baby')]");
    By leftNavBrowseBoxList6_catPage = By.xpath("//a[contains(text(),'Beauty & Personal Care')]");
    By leftNavBrowseBoxList7_catPage = By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[7]/a[1]");
    By leftNavBrowseBoxList8_catPage = By.xpath("//a[contains(text(),'Computers')]");
    By linkComputersAndTablets_subCatPage = By.xpath("//span[contains(text(),'Computers & Tablets')]");


    public void clickLinkShopByCat() {

        driver.findElement(linkShopByCat_homePage).click();
        System.out.println("\nShop now link of Shop by Category is clicked.");

    } // end method clickLinkShopByCat()

    public void viewCategory() {

        String expectedTitle, actualTitle;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        expectedTitle = "Computers & Accessories";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(bestSellers_catPage));
            actualTitle = element.getText();
            Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match.");
            System.out.println("Page title: " + actualTitle);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle + " is not available at the moment.");
        }

    } // end method viewCategory()

    public void viewLeftNavBrowseBox() {

        String expectedTitle1, expectedTitle2, expectedTitle3, expectedTitle4, expectedTitle5, expectedTitle6, expectedTitle7, expectedTitle8, expectedTitle9, actualTitle1, actualTitle2, actualTitle3, actualTitle4, actualTitle5, actualTitle6, actualTitle7, actualTitle8, actualTitle9;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        expectedTitle1 = "Departments";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavBrowseBox_catPage));
            actualTitle1 = element.getText();
            Assert.assertEquals(actualTitle1, expectedTitle1, "Title does not match!");
            System.out.println("Left Navigation's Browse Box Title is: " + actualTitle1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle1 + " is not available at the moment.");
        }

        expectedTitle2 = "Deals";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavBrowseBoxList1_catPage));
            actualTitle2 = element.getText();
            Assert.assertEquals(actualTitle2, expectedTitle2, "List title does not match!");
            System.out.println("Browse Box's List Title is: " + actualTitle2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle2 + " is not available at the moment.");
        }

        expectedTitle3 = "Amazon International Shopping";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavBrowseBoxList2_catPage));
            actualTitle3 = element.getText();
            Assert.assertEquals(actualTitle3, expectedTitle3, "List title does not match!");
            System.out.println("Browse Box's List Title is: " + actualTitle3);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle3 + " is not available at the moment.");
        }

        expectedTitle4 = "Arts & Crafts";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavBrowseBoxList3_catPage));
            actualTitle4 = element.getText();
            Assert.assertEquals(actualTitle4, expectedTitle4, "List title does not match!");
            System.out.println("Browse Box's List Title is: " + actualTitle4);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle4 + " is not available at the moment.");
        }

        expectedTitle5 = "Automotive";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavBrowseBoxList4_catPage));
            actualTitle5 = element.getText();
            Assert.assertEquals(actualTitle5, expectedTitle5, "List title does not match!");
            System.out.println("Browse Box's List Title is: " + actualTitle5);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle5 + " is not available at the moment.");
        }

        expectedTitle6 = "Baby";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavBrowseBoxList5_catPage));
            actualTitle6 = element.getText();
            Assert.assertEquals(actualTitle6, expectedTitle6, "List title does not match!");
            System.out.println("Browse Box's List Title is: " + actualTitle6);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle6 + " is not available at the moment.");
        }

        expectedTitle7 = "Beauty & Personal Care";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavBrowseBoxList6_catPage));
            actualTitle7 = element.getText();
            Assert.assertEquals(actualTitle7, expectedTitle7, "List title does not match!");
            System.out.println("Browse Box's List Title is: " + actualTitle7);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle7 + " is not available at the moment.");
        }

        expectedTitle8 = "Books";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavBrowseBoxList7_catPage));
            actualTitle8 = element.getText();
            Assert.assertEquals(actualTitle8, expectedTitle8);
            System.out.println("Browse Box's List Title is: " + actualTitle8);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle8 + " is not available at the moment.");
        }

        expectedTitle9 = "Computers";
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavBrowseBoxList8_catPage));
            actualTitle9 = element.getText();
            Assert.assertEquals(actualTitle9, expectedTitle9, "List title does not match!");
            System.out.println("Browse Box's List Title is: " + actualTitle9);
            element.click();
            System.out.println("Computers link is clicked.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(expectedTitle9 + " is not available at the moment.");
        }

    } // end method viewLeftNavBrowseBox()

    public void viewComputersAndTablets(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(linkComputersAndTablets_subCatPage));
            element.click();
        }catch (Exception e){
            e.printStackTrace();
        }

    } // end method viewComputersAndTablets()

} // end method Category
