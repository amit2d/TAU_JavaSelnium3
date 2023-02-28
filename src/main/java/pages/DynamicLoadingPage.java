package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class DynamicLoadingPage {

    private final WebDriver driver;
    private By elementOnPageHidden = By.linkText("Example 1: Element on page that is hidden");

    private By elementOnPageAfterLoad = By.linkText("Example 2: Element rendered after the fact");
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");


    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnFirstLink() {
        driver.findElement(elementOnPageHidden).click();
    }

    public void clickOnSecondLink() {
        driver.findElement(elementOnPageAfterLoad).click();
    }

    public void clickOnStartButton () {
        driver.findElement(startButton).click();
//        Explicit wait
//        WebDriverWait wait = new WebDriverWait(driver,
//                Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(loadingIndicator)));

//        Fluent wait
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndicator)));
    }

    public String getResult () {
        return driver.findElement(loadedText).getText();
    }


}
