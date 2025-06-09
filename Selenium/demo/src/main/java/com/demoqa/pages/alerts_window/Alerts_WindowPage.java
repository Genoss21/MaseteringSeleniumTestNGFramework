package com.demoqa.pages.alerts_window;

import static utilities.JavaScriptUtility.scrollToElementJS;

import org.openqa.selenium.By;

import com.demoqa.pages.HomePage;

public class Alerts_WindowPage extends HomePage{

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");

    public ModalDialogsPage clickModalDialogs() {
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
}
