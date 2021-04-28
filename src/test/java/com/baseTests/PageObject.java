package com.baseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObject {

    public static WebDriver driver;

    public static void updateTextBox(By element, String searchTerm) {
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(searchTerm);
    }

    public static void clickWithWait(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(element).click();
    }

    public static void clickOnButton(By element) throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(element).click();
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }

    public static void waitUntilVisibilityOfTheElementToBeClicked(By locator, int Time) {
        WebDriverWait wait = new WebDriverWait(driver, Time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }

    public static void javaScriptHighlight(By locator){
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 3px solid green')",locator);
    }

    public static void selectByVisibleTextDropDown(By element, String text) {
        Select sizeDropDown = new Select(driver.findElement(element));
        sizeDropDown.selectByVisibleText(text);
    }

    public static void scrollDown(int pixels ) {
        ((JavascriptExecutor) driver).executeScript("scrollTo(0," + pixels +");");

    }
}