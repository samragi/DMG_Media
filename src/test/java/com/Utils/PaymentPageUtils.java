package com.Utils;

import com.baseTests.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaymentPageUtils extends PageObject {

    private static final By VERIFYPRICEONPAYMENTPAGE =By.cssSelector("#nbf_product_pricingsummary div.nbf_grid--padtop div.nbf_grid_item.nbf_w20");

    public static WebElement getPayment(){
        return driver.findElement(VERIFYPRICEONPAYMENTPAGE);
    }
}
