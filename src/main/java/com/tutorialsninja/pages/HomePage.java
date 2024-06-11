package com.tutorialsninja.pages;

import com.tutorialsninja.propertyreader.PropertyReader;
import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    String menu = PropertyReader.getInstance().getProperty("menu");
    String optionValue = PropertyReader.getInstance().getProperty("optionValue");


    By menuLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']");
    By option = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']");
    By textFromTitle = By.xpath("//h2[normalize-space()='Desktops']");
    By laptopsAndNotebooksMenuLink = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By textFromLaptopsAndNotebooksTitle = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");
    By componentsMenuLink = By.xpath("//a[normalize-space()='Components']");
    By textFromComponentsTitle = By.xpath("//h2[normalize-space()='Components']");
    By ShowAllDesktops = By.xpath("//a[normalize-space()='Show AllComponents']");
    By showAllLaptopsAndNotebooks = By.xpath("");


    public void clickOnMenuElement(){
        clickOnElement(menuLink);
    }
    public void mouseHoverOnMainMenu() {
        mouseHoverToElement(menuLink);
    }
    public String getTextFromTitle() {
        return getTextFromElement(textFromTitle);
    }
    public void mouseHoverOnLaptopsAndNotebooksMenuLink(){
        mouseHoverToElement(laptopsAndNotebooksMenuLink);
    }
    public String getTextFromLaptopsAndNotebooksTitle(){
        return getTextFromElement(textFromLaptopsAndNotebooksTitle);
    }
    public void mouseHoverOnComponentsMenuLink(){
        mouseHoverToElement(componentsMenuLink);
    }
    public String getTextFromComponentsTitle(){
        return getTextFromElement(textFromComponentsTitle);
    }
    public void clickOnShowAllDesktops(){
        clickOnElement(ShowAllDesktops);
    }
    public void clickOnShowAllLaptopsAndNotebooks(){
        clickOnElement(showAllLaptopsAndNotebooks);
    }
    public void clickOnOption(){
        selectByContainsTextFromDropDown(option, optionValue);
    }


}
