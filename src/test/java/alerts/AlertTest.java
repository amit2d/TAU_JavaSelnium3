package alerts;

import org.testng.annotations.Test;
import testBase.TestBase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTest extends TestBase {
    @Test
    public void testAlerts() {
        var javaScriptAlertsPage = homePage.clickOnJavaScriptsAlerts();
        javaScriptAlertsPage.alert_clickToTrigger();
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResult(),
                "You successfully clicked an alert",
                "alert accepted successfully");
    }

    @Test
    public void testGetTextFromAlerts() {
        var javaScriptAlertsPage = homePage.clickOnJavaScriptsAlerts();
        javaScriptAlertsPage.confirm_clickToTrigger();
        String text = javaScriptAlertsPage.getAlertText();
        javaScriptAlertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","incorrect alert message!!");
    }

    @Test
    public  void testPromptPopUp() {
        String promptText = "AmATester";
        var javaScriptAlertsPage = homePage.clickOnJavaScriptsAlerts();
        javaScriptAlertsPage.prompt_clickToTrigger();
        javaScriptAlertsPage.prompt_sendText(promptText);
        javaScriptAlertsPage.alert_clickToAccept();
        assertTrue(javaScriptAlertsPage.getResult().contains(promptText),"incorrect prompt text");
    }
}
