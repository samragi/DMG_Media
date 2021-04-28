package com.pages;

import com.Utils.MailTravelPageUtils;
import com.baseTests.PageObject;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import java.util.Map;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class MailTravelPage extends PageObject {

    private static final String MAIL_TRAVEL_PAGE_TITLE= "Incredible India | Mail Travel";

    private static final By BOOKONLINEBUTTON= By.cssSelector("#book-button-header button[type='submit']");
    private static final By CONTINUEBUTTONTOP= By.cssSelector(".nbf_tpl_pms_buttonarea button[type='submit']");
    private static final By CONTINUEBUTTONBOTTOM= By.cssSelector(".nbf_fancy_paxButton.nbf_fg_pms_button_text");
    private static final By STANDARDROOMDROPDOWN= By.cssSelector("#room-0-numselect");
    private static final By SELECTYOURROOMANDCONTINUE= By.cssSelector("#accomForm-select .nbf_tpl_pms_book_button");
    private static final By CONTINUEWITHOUTEXTRAS= By.cssSelector(".nbf_tpl_pms_bf_extras_selection #extrasButton");
    private static final By CONTACTPHONENUMBER= By.cssSelector("#contact-mobile");
    private static final By CONTACTEMAIL= By.cssSelector("#contact-email");
    private static final By CONTACTADDRESS= By.cssSelector("#contact-address1");
    private static final By CONTACTCITY= By.cssSelector("#contact-city");


    public static void getMailTravelPageTitle(){
        assertThat("Page title is not the expected one",PageObject.getPageTitle(), containsString(MAIL_TRAVEL_PAGE_TITLE));
    }

    public static void getDisplayDay(String day){
        assertThat("The day and price is not displaying", MailTravelPageUtils.getDisplayDay(),is(day));
    }

    public static void getDisplayPrice(String price){
        assertThat("The day and price is not displaying", MailTravelPageUtils.getDisplayPrice(),is(price));
    }

    public static void getDisplayTelephoneNumber(){
        assertThat("The day and price is not displaying", MailTravelPageUtils.getTelephoneNumber(), containsString("0808"));
    }

    public static void clickOnBookOnlineButton() throws InterruptedException {
        PageObject.clickOnButton(BOOKONLINEBUTTON);
    }

    public static void getHighlightedDateSelectedWithDefaultValue() throws InterruptedException {
        PageObject.scrollDown(1500);
        MailTravelPageUtils.getDefaultDateInCalendar();
        PageObject.clickWithWait(CONTINUEBUTTONTOP);
    }

    public static void userSelectStandardRoomDropDown() throws InterruptedException {
        Thread.sleep(16000);
        PageObject.selectByVisibleTextDropDown(STANDARDROOMDROPDOWN,"1");
    }

    public static void UserClicksOnSelectYourRoomAndContinue() throws InterruptedException {
        PageObject.clickOnButton(SELECTYOURROOMANDCONTINUE);
    }

    public static void userClicksOnContinueWithoutExtras() throws InterruptedException {
        PageObject.clickOnButton(CONTINUEWITHOUTEXTRAS);
    }

    public static void userEntersFirstPassengerDetails(String title, String firstName, String lastName, String date, String month, String year) throws InterruptedException {
        Thread.sleep(3000);
        MailTravelPageUtils.fillFirstPassengerDetails(title,firstName,lastName,date,month,year);
    }

    public static void userEntersSecondPassengerDetails(String title, String firstName, String lastName, String date, String month, String year) throws InterruptedException {
        MailTravelPageUtils.fillSecondPassengerDetails(title,firstName,lastName,date,month,year);
    }

    public static void userEntersLeadContactDetails(DataTable contactDetails){
        Map<String, String> passengerContactDetails = contactDetails.asMap(String.class, String.class);

        String phoneNumber=passengerContactDetails.get("phoneNumber");
        String email =passengerContactDetails.get("email");
        String address =passengerContactDetails.get("address");
        String city =passengerContactDetails.get("city");

        PageObject.updateTextBox(CONTACTPHONENUMBER,phoneNumber);
        PageObject.updateTextBox(CONTACTEMAIL,email);
        PageObject.updateTextBox(CONTACTADDRESS,address);
        PageObject.updateTextBox(CONTACTCITY,city);

    }

    public static void userClicksOnContinueBottomButton() throws InterruptedException {
        PageObject.clickOnButton(CONTINUEBUTTONBOTTOM);

    }


}
