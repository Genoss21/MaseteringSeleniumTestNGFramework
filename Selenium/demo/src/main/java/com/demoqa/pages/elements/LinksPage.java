package com.demoqa.pages.elements;

import static utilities.JavaScriptUtility.scrollToElementJS;

import org.openqa.selenium.By;

public class LinksPage extends ElementsPage{

    //fields
    private By badRequestLink = By.id("bad-request");
    private By respomseLink = By.id("linkResponse");

    //methods
    public void clickBadRequestLink() {
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getResponse() {
        delay(2000);
        return find(respomseLink).getText();
    }

}
