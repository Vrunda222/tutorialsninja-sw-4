package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {
    HomePage homePage = new HomePage();
    MyAccountsPage myAccountsPage = new MyAccountsPage();

    //1.1 create method with name "selectMyAccountOptions" it has one parameter name "option" of type string
    //1.2 This method should click on the options whatever name is passed as parameter.
    //(Hint: Handle List of Element and Select options)

    public void selectMyAccountOptions(String option){
        homePage.clickOnOption();
    }
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //1.1 Click on My Account Link
        myAccountsPage.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
        Assert.assertEquals(myAccountsPage.getValueOfMyAccountTitle(), "Register Account");
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //2.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”.
        Assert.assertEquals(myAccountsPage.getValueOfReturningCustomerTitle(), "Returning Customer");
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        //3.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        selectMyAccountOptions("Register");
        //3.3 Enter First Name
        myAccountsPage.addValueToFirstNameField();
        //3.4 Enter Last Name
        myAccountsPage.addValueToLastNameField();
        //3.5 Enter Email
        myAccountsPage.addValueToEmailIdField();
        //3.6 Enter Telephone
        myAccountsPage.addValueToPhoneNumberField();
        //3.7 Enter Password
        myAccountsPage.addValueToPasswordField();
        //3.8 Enter Password Confirm
        myAccountsPage.addValueToConfirmPasswordField();
        //3.9 Select Subscribe Yes radio button
        myAccountsPage.clickOnSubscribeRadioButton();
        //3.10 Click on Privacy Policy check box
        myAccountsPage.clickOnPrivacyPolicyCheckbox();
        //3.11 Click on Continue button
        myAccountsPage.clickOnContinueButton();
        //3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals(myAccountsPage.getValueOfAccountCreationSuccessMessage(), "Your Account Has Been Created!");
        //3.13 Click on Continue button
        myAccountsPage.clickOnContinueButtonAfterAccountCreation();
        //3.14 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”
        Assert.assertEquals(myAccountsPage.getValueOfAccountLogout(), "Account Logout");
        //3.17 Click on Continue button
        myAccountsPage.clickOnContinueButton();
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        //4.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        selectMyAccountOptions("Login");
        //4.3 Enter Email address
        myAccountsPage.addValueToEmailIdField();
        //4.4 Enter Last Name
        myAccountsPage.addValueToLastNameField();
        //4.5 Enter Password
        myAccountsPage.addValueToPasswordField();
        //4.6 Click on Login button
        myAccountsPage.clickOnLoginButton();
        //4.7 Verify text “My Account”
        Assert.assertEquals(myAccountsPage.getValueOfMyAccount(),"My Account");
        //4.8 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        selectMyAccountOptions("Logout");
        //4.10 Verify the text “Account Logout”
        Assert.assertEquals(myAccountsPage.getValueOfAccountLogout(), "Account Logout");
        //4.11 Click on Continue button
        myAccountsPage.clickOnContinueButton();
    }












}
