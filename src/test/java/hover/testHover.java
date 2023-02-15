package hover;

import org.testng.annotations.Test;
import pages.HoversPage;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class testHover extends TestBase {

    @Test
    public void testHoverFeature() {
        HoversPage hoversPage = homePage.clickonHoversPage();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption Not Displayed");
        assertEquals(caption.getTitle(),"name: user1","caption title invalid");
        assertEquals(caption.getLinkText(),"View profile","caption link text invalid");
        assertTrue(caption.getLink().contains("/users/1"),"caption link text invalid");
    }
}
