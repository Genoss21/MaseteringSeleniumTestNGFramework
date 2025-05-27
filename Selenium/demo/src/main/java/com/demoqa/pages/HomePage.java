package com.demoqa.pages;

import org.openqa.selenium.By;

import com.demoqa.pages.Forms.FormsPage;
import com.saucedemo.pages.BasePage;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    
    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    
    
}
