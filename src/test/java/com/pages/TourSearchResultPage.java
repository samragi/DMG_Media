package com.pages;

import com.baseTests.PageObject;
import org.openqa.selenium.By;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class TourSearchResultPage extends PageObject{

    private static final By MOREINFOBUTTON= By.cssSelector("#iterator_1_product_custom_more-info-button");
    private static final String TOUR_PAGE_TITLE= "Tour Search | Mail Travel";

    public static void getSearchResultsPageTitle(){
        assertThat("Page title is not the expected one",PageObject.getPageTitle(), containsString(TOUR_PAGE_TITLE));
    }

    public static void userClicksOnMoreInfoButton(){
        PageObject.waitUntilVisibilityOfTheElementToBeClicked(MOREINFOBUTTON,10);
    }
}
