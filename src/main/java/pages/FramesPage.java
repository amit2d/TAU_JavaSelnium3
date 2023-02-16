package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private final WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");
    String frameTop = "frame-top";
    String frameBottom = "frame-bottom";
    String frameLeft = "frame-left";
    private By body = By.tagName("body");


    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToNestedFrames () {
    driver.findElement(nestedFramesLink).click();
    }

    public void switchToFrameTop() {
        driver.switchTo().frame(frameTop);
    }

    public void switchToFrameBottom() {
        driver.switchTo().frame(frameBottom);
    }

    public void switchToFrameLeft() {
        driver.switchTo().frame(frameLeft);
    }

    public void switchToMainFrame() {
        driver.switchTo().parentFrame();
    }

    public String getFrameText() {
        return driver.findElement(body).getText();
    }


}
