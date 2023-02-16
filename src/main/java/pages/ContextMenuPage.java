package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotSpotBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }


    public void moveToHotSpot() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(hotSpotBox)).perform();
    }

    public String getAlertMessage() {
        return driver.switchTo().alert().getText();
    }

    public void performRightClick() {
        Actions action = new Actions(driver);
        action.contextClick().perform();
    }
}
