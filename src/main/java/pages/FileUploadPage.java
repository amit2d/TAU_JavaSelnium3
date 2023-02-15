package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {


    private final WebDriver driver;
    private By fileInputField = By.id("file-upload");
    private By fileUploadButton = By.id("file-submit");
    private By uploadFileResult = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendFileAbsolutePath(String absolPath) {
        driver.findElement(fileInputField).sendKeys(absolPath);
    }
    public void clickUploadButton () {
        driver.findElement(fileUploadButton).click();
    }
    public String getUploadedFileName () {
        return driver.findElement(uploadFileResult).getText();
    }

}
