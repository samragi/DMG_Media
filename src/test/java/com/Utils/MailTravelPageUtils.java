package com.Utils;

import com.baseTests.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class MailTravelPageUtils extends PageObject {

    private static final By DISPLAYDAY= By.cssSelector("#price-pin_days-num-01");
    private static final By DISPLAYPRICE= By.cssSelector(".pin-price-normal");
    private static final By DISPLAYTELEPHONENUMBER= By.cssSelector("#supplier-phone");

    private static final By ADULTONETITLEDROPDOWN= By.cssSelector(".nbf_tpl_pms_bf_paxinfo #pax-a-title-1");
    private static final By ADULTONEFIRSTNAMETEXTBOX= By.cssSelector("#pax-a-first-1");
    private static final By ADULTONELASTNAMETEXTBOX= By.cssSelector("#pax-a-last-1");
    private static final By ADULTONEDATEDROPDOWN= By.cssSelector("#pax-a-dobd-1");
    private static final By ADULTONEMONTHDROPDOWN= By.cssSelector("#pax-a-dobm-1");
    private static final By ADULTONEYEARDROPDOWN= By.cssSelector("#pax-a-doby-1");

    private static final By ADULTTWOTITLEDROPDOWN= By.cssSelector(".nbf_tpl_pms_bf_paxinfo #pax-a-title-2");
    private static final By ADULTTWOFIRSTNAMETEXTBOX= By.cssSelector("#pax-a-first-2");
    private static final By ADULTTWOLASTNAMETEXTBOX= By.cssSelector("#pax-a-last-2");
    private static final By ADULTTWODATEDROPDOWN= By.cssSelector("#pax-a-dobd-2");
    private static final By ADULTTWOMONTHDROPDOWN= By.cssSelector("#pax-a-dobm-2");
    private static final By ADULTTWOYEARDROPDOWN= By.cssSelector("#pax-a-doby-2");

    public static String getDisplayDay(){
        return driver.findElement(DISPLAYDAY).getText();
    }

    public static String getDisplayPrice(){
        return driver.findElement(DISPLAYPRICE).getText();
    }

    public static String getTelephoneNumber(){
        return driver.findElement(DISPLAYTELEPHONENUMBER).getText();
    }

    public static void getDefaultDateInCalendar(){
        WebElement date= driver.findElement(By.cssSelector(".nbf_tpl_pms_calendar_day_available"));
        String backgroundColour= date.getCssValue("background-color");
        String hexBackColour= Color.fromString(backgroundColour).asHex();
        Assert.assertEquals("#abc349",hexBackColour);
    }

    public static void fillFirstPassengerDetails(String title, String firstName, String lastName, String date, String month, String year) {
        PageObject.selectByVisibleTextDropDown(ADULTONETITLEDROPDOWN, title);
        PageObject.updateTextBox(ADULTONEFIRSTNAMETEXTBOX, firstName);
        PageObject.updateTextBox(ADULTONELASTNAMETEXTBOX, lastName);
        PageObject.selectByVisibleTextDropDown(ADULTONEDATEDROPDOWN,date);
        PageObject.selectByVisibleTextDropDown(ADULTONEMONTHDROPDOWN,month);
        PageObject.selectByVisibleTextDropDown(ADULTONEYEARDROPDOWN, year);
    }

    public static void fillSecondPassengerDetails(String title, String firstName, String lastName, String date, String month, String year) {
        PageObject.selectByVisibleTextDropDown(ADULTTWOTITLEDROPDOWN, title);
        PageObject.updateTextBox(ADULTTWOFIRSTNAMETEXTBOX, firstName);
        PageObject.updateTextBox(ADULTTWOLASTNAMETEXTBOX, lastName);
        PageObject.selectByVisibleTextDropDown(ADULTTWODATEDROPDOWN,date);
        PageObject.selectByVisibleTextDropDown(ADULTTWOMONTHDROPDOWN,month);
        PageObject.selectByVisibleTextDropDown(ADULTTWOYEARDROPDOWN, year);
    }

}
