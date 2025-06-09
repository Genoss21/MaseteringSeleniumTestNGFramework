package com.demoqa.pages;

import org.openqa.selenium.By;

import com.base.BasePage;
import com.demoqa.pages.Forms.FormsPage;
import com.demoqa.pages.alerts_window.Alerts_WindowPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.widgets.WidgetsPage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertsWindowCard = By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements(){
         scrollToElementJS(elementsCard);
         click(elementsCard);
         return new ElementsPage();
    }
    
    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }
    
    public Alerts_WindowPage goToAlertsWindowsCard() {
        scrollToElementJS(alertsWindowCard);
        click(alertsWindowCard);
        return new Alerts_WindowPage();
    }
}
