package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private final WebDriver driver;

    private By para = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void infiniteScroll(int index) {
        var jSExecutor =  (JavascriptExecutor)driver;
        String script = "window.scrollTo(0,document.body.scrollHeight)";

        while (getNumberOfParaPresent() < index)
            jSExecutor.executeScript(script);
    }

    public int getNumberOfParaPresent() {
        return driver.findElements(para).size();
    }

}
