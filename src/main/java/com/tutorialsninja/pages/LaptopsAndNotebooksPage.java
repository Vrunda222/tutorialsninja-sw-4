package com.tutorialsninja.pages;

import com.tutorialsninja.propertyreader.PropertyReader;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility {

    String firstName = PropertyReader.getInstance().getProperty("firstName");
    String lastName = PropertyReader.getInstance().getProperty("lastName");
    String email = PropertyReader.getInstance().getProperty("email");
    String phoneNumber = PropertyReader.getInstance().getProperty("phoneNumber");
    String address = PropertyReader.getInstance().getProperty("address");
    String city = PropertyReader.getInstance().getProperty("city");
    String zipCode = PropertyReader.getInstance().getProperty("zipCode");
    String expiryYear = PropertyReader.getInstance().getProperty("expiryYear");
    String expiryDate = PropertyReader.getInstance().getProperty("expiryDate");


    By sortBy = By.xpath("//select[@id='input-sort']");
    By sortByPriceHighToLow = By.xpath("");
    By productName = By.xpath("//a[normalize-space()='MacBook']");
    By getProductName = By.xpath("//h1[normalize-space()='MacBook']");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By qtyOfProduct = By.xpath("//input[@name='quantity']");
    By updateTab = By.xpath("//i[@class='fa fa-refresh']");
    By productUpdateSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By totalFromCartPage = By.xpath("//tbody//tr//td[6]");
    By checkoutButton = By.xpath("//a[@class='btn btn-primary']");
    By textFromCheckoutPage = By.xpath("//h1[normalize-space()='Checkout']");
    By textFromNewCustomerTitle = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckoutRadioButton = By.xpath("//input[@value='guest']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By firstNameField = By.xpath("//input[@id='input-payment-firstname']");
    By lastNameField = By.xpath("//input[@id='input-payment-lastname']");
    By emailIdField = By.xpath("//input[@id='input-payment-email']");
    By phoneNumberField = By.xpath("//input[@id='input-payment-telephone']");
    By addressField = By.xpath("//input[@id='input-payment-address-1']");
    By cityField = By.xpath("//input[@id='input-payment-city']");
    By zipCodeField = By.xpath("//input[@id='input-payment-postcode']");
    By expiryYearDropdown = By.xpath("//select[@id='ExpireYear']");
    By expiryMonthDropdown = By.xpath("//select[@id='ExpireMonth']");
    By continueButtonGuest = By.xpath("//input[@id='button-guest']");
    By commentAboutYourOrder = By.xpath("//textarea[@name='comment']");
    By shippingMethodButton = By.xpath("//input[@id='button-shipping-method']");
    By comment = By.xpath("//div[@id='collapse-payment-method']//textarea[@name='comment']");
    By checkboxTermsAndConditions = By.xpath("//input[@name='agree']");
    By paymentMethodContinueButton = By.xpath("//input[@id='button-payment-method']");






    public void clickOnSortBy(){
        clickOnElement(sortBy);
    }
    public void clickOnSortByPriceHighToLow(){
        clickOnElement(sortByPriceHighToLow);
    }
    public void clickOnProductName(){
        clickOnElement(productName);
    }
    public String getProductName(){
        return getTextFromElement(getProductName);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void clearQtyOfProduct(){
        clearTheText(qtyOfProduct);
    }
    public void addQtyOfProduct(){
        sendTextToElement(qtyOfProduct, "2");
    }
    public void clickOnUpdateTab(){
        clickOnElement(updateTab);
    }
    public String getProductUpdateSuccessMessage(){
        return getTextFromElement(productUpdateSuccessMessage);
    }
    public String getTotalFromCartPage(){
        return getTextFromElement(totalFromCartPage);
    }
    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
    }
    public String getTextFromCheckoutPage(){
        return getTextFromElement(textFromCheckoutPage);
    }
    public String getTextFromNewCustomerTitle(){
        return getTextFromElement(textFromNewCustomerTitle);
    }
    public void clickOnGuestCheckoutRadioButton(){
        clickOnElement(guestCheckoutRadioButton);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void addValueToFirstNameField(){
        sendTextToElement(firstNameField, firstName);
    }
    public void addValueToLastNameField(){
        sendTextToElement(lastNameField, lastName);
    }
    public void addValueToEmailIdField(){
        sendTextToElement(emailIdField, email);
    }
    public void addValueToPhoneNumberField(){
        sendTextToElement(phoneNumberField, phoneNumber);
    }
    public void addValueToAddressField(){
        sendTextToElement(addressField, address);
    }
    public void addValueToCityField(){
        sendTextToElement(cityField, city);
    }
    public void addValueToZipCodeField(){
        sendTextToElement(zipCodeField, zipCode);
    }
    public void selectValueOfExpiryYear(){
        selectByVisibleTextFromDropDown(expiryYearDropdown, "2050");
    }
    public void selectValueOfExpiryMonth(){
        selectByVisibleTextFromDropDown(expiryMonthDropdown, "06");
    }
    public void clickOnContinueButtonGuest(){
        clickOnElement(continueButtonGuest);
    }
    public void addCommentAboutYourOrder(){
        sendTextToElement(commentAboutYourOrder, "Hello Hi Product is good.");
    }
    public void clickOnShippingMethodButton(){
        clickOnElement(shippingMethodButton);
    }
    public void addComment(){
        sendTextToElement(comment, "Hello Hi Product is good.");
    }
    public void clickOnCheckboxTermsAndConditions(){
        clickOnElement(checkboxTermsAndConditions);
    }
    public void clickOnPaymentMethodContinueButton(){
        clickOnElement(paymentMethodContinueButton);
    }



}
