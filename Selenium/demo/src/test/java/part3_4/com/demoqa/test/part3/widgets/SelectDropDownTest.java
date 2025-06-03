package part3_4.com.demoqa.test.part3.widgets;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class SelectDropDownTest extends BaseTest{

    @Test
    public void testMultiSelectDropDown() {

        var selectMenuPage =  homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("saab");
        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"), "Saab should not be selected");
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }

}
