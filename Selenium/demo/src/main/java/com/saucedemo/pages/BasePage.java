package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//parent class
public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void set(By locator, String text) {
        driver.findElement(locator);
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    //sleep statement 
    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
