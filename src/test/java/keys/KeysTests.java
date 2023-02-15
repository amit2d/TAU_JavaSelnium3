package keys;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testBase.TestBase;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeysTests extends TestBase {
    @Test
    public void testBackspace() {
    var keyPressPage = homePage.clickOnKeypressesPage();
    keyPressPage.enterText("A" + Keys.BACK_SPACE);

    assertTrue(keyPressPage.getDisplayedResult().contains("BACK_SPACE"),"invalid output");
    }

    @Test
    public void testHorizontalSlider () {
        var horizontalScrollSliderPage = homePage.clickOnHorizontalScrollSlider();
        horizontalScrollSliderPage.moveSlider(8);
        assertEquals(horizontalScrollSliderPage.getRange(),"4","Range incorrect!!");
    }
}
