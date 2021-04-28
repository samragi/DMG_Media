package com.stepDefinition;

import com.pages.TourSearchResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TourSearchResultPageSD {

    @Then("^the user can see the tour search page$")
    public void the_user_can_see_the_tour_search_page() throws Throwable {
        TourSearchResultPage.getSearchResultsPageTitle();
    }

    @When("^the user clicks on More Info on the first result page$")
    public void the_user_clicks_on_More_Info_on_the_first_result_page() throws Throwable {
        TourSearchResultPage.userClicksOnMoreInfoButton();
    }


}
