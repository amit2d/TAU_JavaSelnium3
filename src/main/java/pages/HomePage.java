package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private By formAuthLink = By.linkText("Form Authentication");


    public HomePage (WebDriver driver) {
        this.driver = driver;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); implicit wait
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

    public FileUploadPage clickOnFileUploadPage () {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickOnContextMenuPage () {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSISYGEditorPage cliclOnWYSISYGEditorPage() {
        clickLink("WYSIWYG Editor");
        return new WYSISYGEditorPage(driver);
    }

    public FramesPage clickOnFramesPage () {
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingPage () {
        clickLink("Dynamic Loading");
        return  new DynamicLoadingPage(driver);
    }

    private void clickLink (String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
