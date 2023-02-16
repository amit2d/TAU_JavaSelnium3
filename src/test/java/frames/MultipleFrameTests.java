package frames;

import org.testng.annotations.Test;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;

public class MultipleFrameTests extends TestBase {
    @Test
    public void testMultipleFrames () {
        String Left = "LEFT", Bottom = "BOTTOM";
        var framesPage = homePage.clickOnFramesPage();
        framesPage.navigateToNestedFrames();
        framesPage.switchToFrameTop();
        framesPage.switchToFrameLeft();
        assertEquals(framesPage.getFrameText(),Left,"incorrect text returned from frame");

        framesPage.switchToMainFrame();
        framesPage.switchToMainFrame();
        framesPage.switchToFrameBottom();
        assertEquals(framesPage.getFrameText(),Bottom,"incorrect text returned from frame");
    }
}
