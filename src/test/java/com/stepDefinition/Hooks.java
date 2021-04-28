package com.stepDefinition;

import com.baseTests.PageObject;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks extends PageObject{

    String URL="https://www.mailtravel.co.uk/";

    @Before
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @After
    public void close() {
        driver.quit();

    }
}
