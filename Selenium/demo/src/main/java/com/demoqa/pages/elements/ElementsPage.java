package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import com.demoqa.pages.HomePage;

public class ElementsPage extends HomePage {

    private By webTalbesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    //method 
    public WebTablesPage clickWebTables() {
        click(webTalbesMenuItem);
        return new WebTablesPage();
    }
}
