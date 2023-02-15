package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By textField = By.id("target");
    private By result = By.id("result");
    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getDisplayedResult() {
        return driver.findElement(result).getText();
    }

    public void enterText (String text) {
        driver.findElement(textField).sendKeys(text);
    }
}
