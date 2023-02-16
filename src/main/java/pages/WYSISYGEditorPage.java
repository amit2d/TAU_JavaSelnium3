package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSISYGEditorPage {

    private final WebDriver driver;

    private String editorIframe = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By indentButton = By.xpath("//button[@title = 'Increase indent']");

    public WYSISYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextField () {
        switchToEditArea ();
        driver.findElement(textArea).clear();
        switchOutOfEditArea();
    }

    public void increaseIndent () {
        driver.findElement(indentButton).click();
    }

    public void setTextField (String textField) {
        switchToEditArea ();
        driver.findElement(textArea).sendKeys(textField);
        switchOutOfEditArea();
    }

    public String getTextField () {
        switchToEditArea ();
        String text = driver.findElement(textArea).getText();
        switchOutOfEditArea();
        return text;
    }

    private void switchToEditArea () {
        driver.switchTo().frame(editorIframe);
    }

    private void switchOutOfEditArea () {
        driver.switchTo().parentFrame();
    }
}

