package com.demoqa.pages.Forms;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.JavaScriptUtility.clickJS;

import org.openqa.selenium.By;

public class PracticeFormPage extends FormsPage{

    private By femaleRadioButton = By.id("gender-radio-2");
     private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By submitButton = By.id("submit");

    //method to select a radio button
    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    //method to check if the rado button is selected
    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }

    //method to select sports hobby checkbox
    public void clickSportsCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    //method to select reading hobby checkbox
    public void clickReadingCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    //method to select music hobby checkbox
    public void clickMusicCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    //method to unselect reading hobby checkbox
    public void unclickReadingCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }
    
    //checks if the reading hobby checkbox is not selected 
    public boolean isReadingSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }

    //method to click the submit button
    public void clickSubmitButton() {
        // scrollToElementJS(submitButton);
        click(submitButton);
    }
}
