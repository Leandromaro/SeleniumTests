package com.leandroTester.webdriver;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


import static org.junit.Assert.assertTrue;

public class FirstTest {
    @Test
    public void driverIsTheKing(){
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.compendiumdev.co.uk/selenium/");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }
    @Test
    public void firefoxIsSupportedByWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.compendiumdev.co.uk/selenium/");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }
}
