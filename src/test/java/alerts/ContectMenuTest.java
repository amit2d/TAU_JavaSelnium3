package alerts;

import org.testng.annotations.Test;
import testBase.TestBase;

import static org.testng.Assert.assertTrue;

public class ContectMenuTest extends TestBase {

    @Test
    public void testContextMenuClick () {
        String result = "You selected a context menu";
        var contextMenuPage = homePage.clickOnContextMenuPage();
        contextMenuPage.moveToHotSpot();
        contextMenuPage.performRightClick();
        assertTrue(contextMenuPage.getAlertMessage().contains(result),
                "incorrect message displayed");
    }
}
