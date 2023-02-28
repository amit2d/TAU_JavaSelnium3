package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    private final WebDriver driver;
    private By clickHere = By.linkText("Click Here");


    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLink() {
        driver.findElement(clickHere).click();
    }
}
