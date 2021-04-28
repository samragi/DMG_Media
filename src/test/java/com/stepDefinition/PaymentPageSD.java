package com.stepDefinition;

import com.pages.PaymentPage;
import cucumber.api.java.en.Then;

public class PaymentPageSD {

    @Then("^the user can see the payment amount as per the accommodation selected$")
    public void the_user_can_see_the_payment_amount_as_per_the_accommodation_selected() throws Throwable {
        PaymentPage.verifyPaymentAsPerAccommodationSelected();
    }


}
