package dropDown;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends TestBase {

    @Test
    public void testSelectOption () {
        var dropDownPage = homePage.clickOnDropDown();
        String option = "Option 1";
        dropDownPage.selectFormDropDown(option);
        var selectedOption = dropDownPage.getSelectedOptions();

        assertEquals(selectedOption.size(),1,"incorrect number of Option selected");
        assertTrue(selectedOption.contains(option),"incorrect option selected");
    }
}
