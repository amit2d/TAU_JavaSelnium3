package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public void setup () {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        // navigate to site
        driver.get("https://the-internet.herokuapp.com/");

        //Click on the “Shifting Content” link.

        //Click on the “Shifting Content” link.
        //Then click on the first example Menu Element.
        //Then print how many of these menu elements appear.
        driver.manage().window().maximize();
        driver.quit();

    }

    public static void main (String[] args) {
        TestBase test = new TestBase();
        test.setup();
    }
}
