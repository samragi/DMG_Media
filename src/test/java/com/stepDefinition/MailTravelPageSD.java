package com.stepDefinition;

import com.pages.MailTravelPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MailTravelPageSD {

    @Then("^the user can see mail travel page with the details of the tour selected$")
    public void the_user_can_see_mail_travel_page_with_the_details_of_the_tour_selected() throws Throwable {
        MailTravelPage.getMailTravelPageTitle();
    }

    @Then("^the user can see \"([^\"]*)\" days from message on the page$")
    public void the_user_can_see_days_from_message_on_the_page(String day) throws Throwable {
        MailTravelPage.getDisplayDay(day);
    }

    @Then("^the user can see \"([^\"]*)\" price messsage on the the page$")
    public void the_user_can_see_price_messsage_on_the_the_page(String price) throws Throwable {
        MailTravelPage.getDisplayPrice(price);
    }

    @Then("^the user can see the telephone number on the page$")
    public void the_user_can_see_the_telephone_number_on_the_page() throws Throwable {
        MailTravelPage.getDisplayTelephoneNumber();
    }

    @When("^the user clicks on Book Online button$")
    public void the_user_clicks_on_Book_Online_button() throws Throwable {
        MailTravelPage.clickOnBookOnlineButton();
    }

    @Then("^the user see the highlighted date selected in the calender with default values$")
    public void the_user_see_the_highlighted_date_selected_in_the_calender_with_default_values() throws Throwable {
         MailTravelPage.getHighlightedDateSelectedWithDefaultValue();
    }

    @When("^the user selects Standard Room dropdown options$")
    public void the_user_selects_Standard_Room_dropdown_options() throws Throwable {
         MailTravelPage.userSelectStandardRoomDropDown();
    }

    @When("^the user clicks on the Select your room and continue button$")
    public void the_user_clicks_on_the_Select_your_room_and_continue_button() throws Throwable {
        MailTravelPage.UserClicksOnSelectYourRoomAndContinue();
    }

    @When("^the user clicks on Continue without Extras button$")
    public void the_user_clicks_on_Continue_without_Extras_button() throws Throwable {
        MailTravelPage.userClicksOnContinueWithoutExtras();
    }

    @When("^the user enters first passenger details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void the_user_enters_first_passenger_details(String title, String firstName, String lastName, String date, String month, String year) throws Throwable {
        MailTravelPage.userEntersFirstPassengerDetails(title,firstName,lastName,date,month,year);
    }

    @When("^the user enters second passenger details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void the_user_enters_second_passenger_details(String title, String firstName, String lastName, String date, String month, String year) throws Throwable {
        MailTravelPage.userEntersSecondPassengerDetails(title,firstName,lastName,date,month,year);
    }

    @When("^the user enters the lead contact details$")
    public void the_user_enters_the_lead_contact_details(DataTable contactDetails) throws Throwable {
        MailTravelPage.userEntersLeadContactDetails(contactDetails);
    }

    @When("^the user clicks on the continue button$")
    public void the_user_clicks_on_the_continue_button() throws Throwable {
        MailTravelPage.userClicksOnContinueBottomButton();
    }


}
