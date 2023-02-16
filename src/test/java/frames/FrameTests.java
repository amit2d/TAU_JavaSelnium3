package frames;

import org.testng.annotations.Test;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;

public class FrameTests extends TestBase {
    @Test
    public void testFrames () {
        String text = "Hello World";
        var wYSISYGEditorPage = homePage.cliclOnWYSISYGEditorPage();
        wYSISYGEditorPage.clearTextField();
        wYSISYGEditorPage.setTextField(text);
        wYSISYGEditorPage.increaseIndent();
        assertEquals(wYSISYGEditorPage.getTextField(),text,"Content in text field OK");
    }
}
