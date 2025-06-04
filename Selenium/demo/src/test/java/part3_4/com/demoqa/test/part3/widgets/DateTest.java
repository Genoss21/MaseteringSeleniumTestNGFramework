package part3_4.com.demoqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest{

    @Test
    public void testSelectingData(){

        String month = "May";
        String monthNumber = "05";
        //String monthNumber = "5"; // This will not work as the month is not in 2 digit format
        String day = "31";
        String year = "2030";
        //Sequnce of actions 
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        //Assertion
        Assert.assertEquals(actualDate, expectedDate, "Actual and expected dates Do not Match" +
         "\n Actual Date: " + actualDate + 
         "\n Expected Date: " + expectedDate);

    }

}
