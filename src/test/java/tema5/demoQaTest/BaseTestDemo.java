package tema5.demoQaTest;

import org.example.bonigarciaselenium.setup.BrowserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static org.example.bonigarciaselenium.setup.WebDriverFactory.createWebDriver;
import static org.example.bonigarciaselenium.utils.Constants.DURATION;

public class BaseTestDemo {

    public static WebDriver driver3;

    String siteURL = "https://demoqa.com/elements";

    static BrowserType browserType3;


    @BeforeAll
    public static void setupBrowser(){
        browserType3 = BrowserType.CHROME;
    }

    @BeforeEach
    public void setupTest(){
        driver3 = createWebDriver(browserType3);
        driver3.manage().window().maximize();
        driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION));
        driver3.get(siteURL);

    }
    @AfterEach
    public void tearDown(){
        //driver2.quit();
    }
}


