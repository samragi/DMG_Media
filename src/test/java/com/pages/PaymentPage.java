package com.pages;

import com.Utils.MailTravelPageUtils;
import com.Utils.PaymentPageUtils;
import com.baseTests.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class PaymentPage extends PageObject {

    private static final String PAYMENT_PAGE_TITLE= "Mail Travel";

    public static void verifyPaymentAsPerAccommodationSelected() {
        assertThat("Page title is not the expected one", PageObject.getPageTitle(), containsString(PAYMENT_PAGE_TITLE));
        assertThat("The price of the accommodation is not selected", PaymentPageUtils.getPayment().getText(), containsString("£2,395"));
    }

}
