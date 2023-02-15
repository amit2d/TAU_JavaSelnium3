package login;

import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest extends TestBase {
    @Test
    public void testForgotPassword () {
        ForgotPasswordPage forgotPasswordPage = homePage.clickOnForgotPassword();
        forgotPasswordPage.enterEmailID("tester@email.com");
        forgotPasswordPage.clickSubmitFormButton();
        assertEquals(forgotPasswordPage.getAlertMessage(),"Your e-mail's been sent!","incorrect message");
    }
}
