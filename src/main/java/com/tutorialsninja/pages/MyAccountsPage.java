package com.tutorialsninja.pages;

import com.tutorialsninja.propertyreader.PropertyReader;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {

    String firstName = PropertyReader.getInstance().getProperty("firstName");
    String lastName = PropertyReader.getInstance().getProperty("lastName");
    String email = PropertyReader.getInstance().getProperty("email");
    String phoneNumber = PropertyReader.getInstance().getProperty("phoneNumber");
    String password = PropertyReader.getInstance().getProperty("password");
    String confirmPassword = PropertyReader.getInstance().getProperty("confirmPassword");



    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    By valueOfMyAccountTitle = By.xpath("//h1[contains(text(),'Register Account')]");
    By valueOfReturningCustomerTitle = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By firstNameField = By.id("input-firstname");
    By lastNameField = By.id("input-lastname");
    By emailIdField = By.id("input-email");
    By phoneNumberField = By.name("telephone");
    By passwordField = By.id("input-password");
    By confirmPasswordField = By.name("confirm");
    By subscribeRadioButton = By.cssSelector("input[value='1'][name='newsletter']");
    By privacyPolicyCheckbox = By.name("agree");
    By continueButton = By.xpath("//input[@value='Continue']");
    By accountCreationSuccessMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueButtonAfterAccountCreation = By.linkText("Continue");
    By accountLogout = By.xpath("//h1[contains(text(),'Account Logout')]");
    By loginButton = By.xpath("//input[@value='Login']");
    By textMyAccount = By.xpath("//h2[contains(text(),'My Account')]");




    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }
    public String getValueOfMyAccountTitle(){
        return getTextFromElement(valueOfMyAccountTitle);
    }
    public String getValueOfReturningCustomerTitle(){
        return getTextFromElement(valueOfReturningCustomerTitle);
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
    public void addValueToPasswordField(){
        sendTextToElement(passwordField, password);
    }
    public void addValueToConfirmPasswordField(){
        sendTextToElement(confirmPasswordField, confirmPassword);
    }
    public void clickOnSubscribeRadioButton(){
        clickOnElement(subscribeRadioButton);
    }
    public void clickOnPrivacyPolicyCheckbox(){
        clickOnElement(privacyPolicyCheckbox);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public String getValueOfAccountCreationSuccessMessage(){
        return getTextFromElement(accountCreationSuccessMessage);
    }
    public void clickOnContinueButtonAfterAccountCreation(){
        clickOnElement(continueButtonAfterAccountCreation);
    }
    public String getValueOfAccountLogout(){
        return getTextFromElement(accountLogout);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getValueOfMyAccount(){
        return getTextFromElement(textMyAccount);
    }




}
