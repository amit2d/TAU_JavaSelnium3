package navigationTests;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;

public class TestPageNavigation extends TestBase {

    @Test
    public void testNavigator() {
        homePage.clickOnDynamicLoadingPage().clickOnFirstLink();
        getWindowManager().back();
        getWindowManager().refresh();
        getWindowManager().forward();
        getWindowManager().goTo("http://www.google.com");
    }

    @Test
    public void testNewTabNavigation() {
        var multipleWindowsPage = homePage.clickOnMultipleWindowsPage();
        multipleWindowsPage.clickOnLink();
        getWindowManager().switchToTab("New Window");
        assertEquals(getWindowManager().getWindowTitle(),"New Window","");
    }
}

