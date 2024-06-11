package com.tutorialsninja.pages;

import com.tutorialsninja.propertyreader.PropertyReader;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {

    String nameAToZ = PropertyReader.getInstance().getProperty("nameAToZ");


    By sortBy = By.xpath("//select[@id='input-sort']");
    By sortByNameZToA = By.xpath("//option[normalize-space()='Name: Z to A']");
    By sortByNameAToZ = By.xpath("//option[normalize-space()='Name: A to Z']");
    By currencyDropDown = By.xpath("//span[normalize-space()='Currency']");
    By poundSterling = By.xpath("//span[normalize-space()='Currency']");
    By clickOnProduct = By.xpath("//a[normalize-space()='HP LP3065']");
    By textFromProductTitle = By.xpath("//h1[normalize-space()='HP LP3065']");
    By qtyOfProduct = By.xpath("//input[@id='input-quantity']");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By textFromProductAddedSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartInSuccessMessage = By.xpath("//a[normalize-space()='shopping cart']");
    By textFromShoppingCartTitle = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By textFromCartProductTitle = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By textFromCartModelName = By.xpath("//td[normalize-space()='Product 21']");
    By textFromCartTotalPrice = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]");





    public void clickOnSortBy(){
        clickOnElement(sortBy);
    }
    public void clickOnSortByNameZToA(){
        clickOnElement(sortByNameZToA);
    }
    public void mouseHoverAndClickOnCurrencyDropDown(){
        mouseHoverToElementAndClick(currencyDropDown);
    }
    public void mouseHoverAndClickOnPoundSterling(){
        mouseHoverToElementAndClick(poundSterling);
    }
    public void selectSortByNameAToZFromDropdown(){
        selectByVisibleTextFromDropDown(sortByNameAToZ, nameAToZ);
    }
    public void clickOnProduct(){
        clickOnElement(clickOnProduct);
    }
    public String textFromProductTitle(){
        return getTextFromElement(textFromProductTitle);
    }
    public void clearQtyOfProduct(){
        clearTheText(qtyOfProduct);
    }
    public void addQtyOfProduct(){
        sendTextToElement(qtyOfProduct, "1");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String textFromProductAddedSuccessMessage(){
        return getTextFromElement(textFromProductAddedSuccessMessage);
    }
    public void clickOnShoppingCartInSuccessMessage(){
        clickOnElement(shoppingCartInSuccessMessage);
    }
    public String textFromShoppingCartTitle(){
        return getTextFromElement(textFromShoppingCartTitle);
    }
    public String textFromCartProductTitle(){
        return getTextFromElement(textFromCartProductTitle);
    }
    public String textFromCartModelName(){
        return getTextFromElement(textFromCartModelName);
    }
    public String textFromCartTotalPrice(){
        return getTextFromElement(textFromCartTotalPrice);
    }




}
