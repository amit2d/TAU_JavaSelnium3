package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalScrollSliderPage {
    private WebDriver driver;
    private By sliderElement = By.cssSelector(".sliderContainer input");
    private By range = By.id("range");

    public HorizontalScrollSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSlider(int times) {
        for (int i = 1; i <= times; i++)
            driver.findElement(sliderElement).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getRange () {
        return driver.findElement(range).getText();
    }
}
