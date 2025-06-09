package com.demoqa.pages.alerts_window;

import org.openqa.selenium.By;

public class ModalDialogsPage extends Alerts_WindowPage {

    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private By closeButton = By.id("closeSmallModal");

    //methods to do actions on the field of page 
    public void clickSmallModalButton() {
        click(smallModalButton);
    }

    public String getSmallModalText() {
        return find(smallModalText).getText();
    }

    public void clickCloseButton() {
        click(closeButton);
    }
     
}
