package com.stepDefinition;

import com.baseTests.PageObject;
import com.pages.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class HomepageSD extends PageObject {

    @Given("^the user visits mail travel site homepage$")
    public void the_user_visits_mail_travel_site_homepage() throws Throwable {
       Homepage.getHomePageTitle();
    }

    @When("^the user enters \"([^\"]*)\" in the search text box$")
    public void the_user_enters_in_the_search_text_box(String country) throws Throwable {
        Homepage.userEntersSearchTermInTheSearchTextBox(country);
    }

    @When("^the use clicks on the search button$")
    public void the_use_clicks_on_the_search_button() throws Throwable {
        Homepage.userClicksOnTheSearchButton();
    }



}
