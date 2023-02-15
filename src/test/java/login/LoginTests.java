package login;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import testBase.TestBase;

import static org.testng.Assert.assertTrue;

public class LoginTests extends TestBase {
    @Test
    public void testSuccessfulLogin () {

        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        assertTrue(secureAreaPage.getBannerAlert().contains("You logged into a secure area!") ,"Text alert mismatch");
    }
}
