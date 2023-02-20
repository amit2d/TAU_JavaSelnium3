package javaScript;

import org.testng.annotations.Test;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;

public class JavaScriptTest extends TestBase {
    @Test
    public void testJavaScriptScroll() {
        var largeAndDeepDOMPage = homePage.clickOnLargeAndDeepDOMPage();
        largeAndDeepDOMPage.scrollIntoView();
    }

    @Test
    public void testJavaScriptInfiniteScroll() {
        var infiniteScrollPage = homePage.clickOnInfiniteScrollPage();
        infiniteScrollPage.infiniteScroll(5);
        assertEquals(infiniteScrollPage.getNumberOfParaPresent()
                ,5
                ,"incorrect number of para returned");
    }
}
