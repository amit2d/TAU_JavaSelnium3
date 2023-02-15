package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By jsAlert = By.xpath("//button[text() = 'Click for JS Alert']");
    private By jsConfirm = By.xpath("//button[text() = 'Click for JS Confirm']");
    private By jsPrompt = By.xpath("//button[text() = 'Click for JS Prompt']");
    private By result = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void alert_clickToTrigger() {
        driver.findElement(jsAlert).click();
    }

    public void prompt_clickToTrigger() {
        driver.findElement(jsPrompt).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }
    public void confirm_clickToTrigger() {
        driver.findElement(jsConfirm).click();
    }

    public String getAlertText () {
        return driver.switchTo().alert().getText();
    }

    public void prompt_sendText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult () {
        return driver.findElement(result).getText();
    }
}
