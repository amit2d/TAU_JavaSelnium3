package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthLink = By.linkText("Form Authentication");


    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickOnDropDown () {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickOnForgotPassword () {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickonHoversPage () {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickOnKeypressesPage () {
        clickLink("Key Presses");
        return new KeyPressesPage (driver);
    }

    public HorizontalScrollSliderPage clickOnHorizontalScrollSlider () {
        clickLink("Horizontal Slider");
        return new HorizontalScrollSliderPage (driver);
    }

    public JavaScriptAlertsPage clickOnJavaScriptsAlerts () {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage (driver);
    }

    private void clickLink (String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
