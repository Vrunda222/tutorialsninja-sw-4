package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder(){
        //1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverOnMainMenu();
        //1.2 Click on “Show All Desktops”
        homePage.clickOnShowAllDesktops();
        //1.3 Select Sort By position "Name: Z to A"
        desktopsPage.clickOnSortBy();
        desktopsPage.clickOnSortByNameZToA();
        //1.4 Verify the Product will arrange in Descending order.

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Mouse hover on Currency Dropdown and click
        desktopsPage.mouseHoverAndClickOnCurrencyDropDown();
        //2.2 Mouse hover on £Pound Sterling and click
        desktopsPage.mouseHoverAndClickOnPoundSterling();
        //2.3 Mouse hover on Desktops Tab.
        homePage.mouseHoverOnMainMenu();
        //2.4 Click on “Show All Desktops”
        homePage.clickOnShowAllDesktops();
        //2.5 Select Sort By position "Name: A to Z"
        desktopsPage.clickOnSortBy();
        desktopsPage.selectSortByNameAToZFromDropdown();
        //2.6 Select product “HP LP3065”
        desktopsPage.clickOnProduct();
        //2.7 Verify the Text "HP LP3065"
        Assert.assertEquals(desktopsPage.textFromProductTitle(),"HP LP3065");
        //2.8 Select Delivery Date "2023-11-27"

        //2.9.Enter Qty "1” using Select class.
        desktopsPage.clearQtyOfProduct();
        desktopsPage.addQtyOfProduct();
        //2.10 Click on “Add to Cart” button
        desktopsPage.clickOnAddToCart();
        Thread.sleep(4000);
        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Assert.assertEquals(desktopsPage.textFromProductAddedSuccessMessage(),"Success: You have added HP LP3065 to your shopping cart!");
        //2.12 Click on link “shopping cart” display into success message
        desktopsPage.clickOnShoppingCartInSuccessMessage();
        //2.13 Verify the text "Shopping Cart"
        Assert.assertEquals(desktopsPage.textFromShoppingCartTitle(), "Shopping Cart");
        //2.14 Verify the Product name "HP LP3065"
        Assert.assertEquals(desktopsPage.textFromCartProductTitle(), "HP LP3065");
        //2.15 Verify the Delivery Date "2023-11-27"

        //2.16 Verify the Model "Product21"
        Assert.assertEquals(desktopsPage.textFromCartModelName(), "Product21");
        //2.17 Verify the Total "£74.73"
        Assert.assertEquals(desktopsPage.textFromCartTotalPrice(), "£74.73");
    }


}
