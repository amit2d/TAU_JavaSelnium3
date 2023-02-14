package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestBase {

    static WebDriver driver;
    public void setup () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void main (String[] args) {
        TestBase test = new TestBase();
        test.setup();

        // navigate to site
        driver.get("https://the-internet.herokuapp.com/");

        //Click on the “Shifting Content” link.
        WebElement element = driver.findElement(By.linkText("Shifting Content"));
        element.click();

        //Then click on the first example Menu Element.
        element = driver.findElement(By.linkText("Example 1: Menu Element"));
        element.click();

        //Then print how many of these menu elements appear.
        List<WebElement> elements = driver.findElements(By.xpath("//ul/li//a"));
        System.out.println("number of menu elements: " + elements.size());

        driver.quit();
    }
}
