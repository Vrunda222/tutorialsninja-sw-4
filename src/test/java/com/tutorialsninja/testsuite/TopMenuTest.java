package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    //1.2 This method should click on the menu whatever name is passed as parameter.

    public void selectMenu(String menu){
        homePage.clickOnMenuElement();
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverOnMainMenu();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        selectMenu("Show All Desktops");
        //1.3 Verify the text ‘Desktops’
        Assert.assertEquals(homePage.getTextFromTitle(), "Desktops");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverOnLaptopsAndNotebooksMenuLink();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        selectMenu("Show All Laptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals(homePage.getTextFromLaptopsAndNotebooksTitle(), "Laptops & Notebooks");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        //3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverOnComponentsMenuLink();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        selectMenu("Show All Components");
        //3.3 Verify the text ‘Components’
        Assert.assertEquals(homePage.getTextFromComponentsTitle(), "Components");
    }

}
