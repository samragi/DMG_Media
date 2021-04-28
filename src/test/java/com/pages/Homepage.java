package com.pages;

import com.baseTests.PageObject;
import org.openqa.selenium.By;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class Homepage extends PageObject {

    private static final By SEARCHTEXTBOX= By.cssSelector("#searchtext_freetext_search_form");
    private static final By SEARCHBUTTON= By.cssSelector("#main-bar .nbf_tpl_quicksearch_button");
    private static final By DELETECOOKIESBUTTON= By.cssSelector(".optanon-alert-box-corner-close button[title='Close']");

    private static final String HOMEPAGE_TITLE= "Home Page | Mail Travel";

    public static void deleteCookies(){
        PageObject.waitUntilVisibilityOfTheElementToBeClicked(DELETECOOKIESBUTTON,10);
    }

    public static void getHomePageTitle(){
        assertThat("Page title is not the expected one",PageObject.getPageTitle(), containsString(HOMEPAGE_TITLE));
    }
    public static void userEntersSearchTermInTheSearchTextBox(String country){
        Homepage.deleteCookies();
        PageObject.updateTextBox(SEARCHTEXTBOX,country);
    }

    public static void userClicksOnTheSearchButton() throws InterruptedException {
        PageObject.clickOnButton(SEARCHBUTTON);
    }
}
