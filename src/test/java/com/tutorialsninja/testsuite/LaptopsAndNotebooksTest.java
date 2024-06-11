package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.mouseHoverOnLaptopsAndNotebooksMenuLink();
        //1.2 Click on “Show All Laptops & Notebooks”
        homePage.clickOnShowAllLaptopsAndNotebooks();
        //1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.clickOnSortBy();
        laptopsAndNotebooksPage.clickOnSortByPriceHighToLow();
        //1.4 Verify the Product price will arrange in High to Low order.


    }
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        homePage.mouseHoverOnLaptopsAndNotebooksMenuLink();
        //2.2 Click on “Show All Laptops & Notebooks”
        homePage.clickOnShowAllLaptopsAndNotebooks();
        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.clickOnSortBy();
        laptopsAndNotebooksPage.clickOnSortByPriceHighToLow();
        //2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.clickOnProductName();
        //2.5 Verify the text “MacBook”
        Assert.assertEquals(laptopsAndNotebooksPage.getProductName(), "MacBook");
        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNotebooksPage.clickOnAddToCart();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        Assert.assertEquals(desktopsPage.textFromProductAddedSuccessMessage(),"Success: You have added MacBook to your shopping cart!");
        //2.8 Click on link “shopping cart” display into success message
        desktopsPage.clickOnShoppingCartInSuccessMessage();
        //2.9 Verify the text "Shopping Cart"
        Assert.assertEquals(desktopsPage.textFromShoppingCartTitle(), "Shopping Cart");
        //2.10 Verify the Product name "MacBook"
        Assert.assertEquals(desktopsPage.textFromCartProductTitle(), "MacBook");
        //2.11 Change Quantity "2"
        laptopsAndNotebooksPage.clearQtyOfProduct();
        laptopsAndNotebooksPage.addQtyOfProduct();
        //2.12 Click on “Update” Tab
        laptopsAndNotebooksPage.clickOnUpdateTab();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        Assert.assertEquals(laptopsAndNotebooksPage.getProductUpdateSuccessMessage(), "Success: You have modified your shopping cart!");
        //2.14 Verify the Total £737.45
        Assert.assertEquals(laptopsAndNotebooksPage.getTotalFromCartPage(), "£737.45");
        //2.15 Click on “Checkout” button
        laptopsAndNotebooksPage.clickOnCheckoutButton();
        Thread.sleep(4000);
        //2.16 Verify the text “Checkout”
        Assert.assertEquals(laptopsAndNotebooksPage.getTextFromCheckoutPage(), "Checkout");
        //2.17 Verify the Text “New Customer”
        Assert.assertEquals(laptopsAndNotebooksPage.getTextFromNewCustomerTitle(), "New Customer");
        //2.18 Click on “Guest Checkout” radio button
        laptopsAndNotebooksPage.clickOnGuestCheckoutRadioButton();
        //2.19 Click on “Continue” tab
        laptopsAndNotebooksPage.clickOnContinueButton();
        //2.20 Fill the mandatory fields
        //enter first name
        laptopsAndNotebooksPage.addValueToFirstNameField();
        //enter last name
        laptopsAndNotebooksPage.addValueToLastNameField();
        //enter email id
        laptopsAndNotebooksPage.addValueToEmailIdField();
        //enter phone number
        laptopsAndNotebooksPage.addValueToPhoneNumberField();
        //enter address
        laptopsAndNotebooksPage.addValueToAddressField();
        //enter city
        laptopsAndNotebooksPage.addValueToCityField();
        //enter postcode
        laptopsAndNotebooksPage.addValueToZipCodeField();
        //select expiry month
        laptopsAndNotebooksPage.selectValueOfExpiryMonth();
        //select expiry year
        laptopsAndNotebooksPage.selectValueOfExpiryYear();
        //2.21 Click on “Continue” Button
        laptopsAndNotebooksPage.clickOnContinueButtonGuest();
        //2.22 Add Comments About your order into text area
        laptopsAndNotebooksPage.addCommentAboutYourOrder();
        laptopsAndNotebooksPage.clickOnShippingMethodButton();
        //2.23 Check the Terms & Conditions check box
        laptopsAndNotebooksPage.addComment();
        laptopsAndNotebooksPage.clickOnCheckboxTermsAndConditions();
        //2.24 Click on “Continue” button
        laptopsAndNotebooksPage.clickOnPaymentMethodContinueButton();
        //2.25 Verify the message “Warning: Payment method required!”
        Assert.assertEquals("", "Warning: Payment method required!");

        /** message cannot verify because payment method is by default selected **/
    }
}
