package dynamicElements;

import org.testng.annotations.Test;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;

public class WaitForDynamicElement extends TestBase {
    @Test
    public void testWaitingDynamicElement() {
        var dynamicLoadingPage = homePage.clickOnDynamicLoadingPage();
        dynamicLoadingPage.clickOnFirstLink();
        dynamicLoadingPage.clickOnStartButton();
        assertEquals(dynamicLoadingPage.getResult(),
                "Hello World!",
                "incorrect message displayed!!");
    }
}
