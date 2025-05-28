package com.demoqa.pages.Forms;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.JavaScriptUtility.clickJS;

import org.openqa.selenium.By;

public class PracticeFormPage extends FormsPage{

    private By femaleRadioButton = By.id("gender-radio-2");


    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }
}
