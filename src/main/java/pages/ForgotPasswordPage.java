package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By formSubmit = By.id("form_submit");

    public ForgotPasswordPage (WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmailID (String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickSubmitFormButton() {
        driver.findElement(formSubmit).click();
    }


    public String getAlertMessage() {
        return null; // incomplete as the site has an issue
    }
}
