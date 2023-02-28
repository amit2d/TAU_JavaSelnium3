package util;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private final WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager (WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void back() {
        navigate.back();
    }

    public void forward() {
        navigate.forward();
    }

    public void refresh() {
        navigate.refresh();
    }

    public void goTo(String path) {
        navigate.to(path);
    }

    public void switchToTab (String windowTitle) {
        var windows = driver.getWindowHandles();
        for (String window: windows) {
            driver.switchTo().window(window);
            if (windowTitle.equals(driver.getTitle())) {
                break;
            }
        }
    }

    public String getWindowTitle() {
        return driver.getTitle();
    }
}
