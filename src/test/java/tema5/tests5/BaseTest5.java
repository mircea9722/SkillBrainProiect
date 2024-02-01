package tema5.tests5;

import org.example.bonigarciaselenium.setup.BrowserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static org.example.bonigarciaselenium.setup.WebDriverFactory.createWebDriver;
import static org.example.bonigarciaselenium.utils.Constants.DURATION;

public class BaseTest5 {
    public static WebDriver driver5;
    String siteURL5 = "https://testpages.herokuapp.com/styled/index.html";
    static BrowserType browserType5;

    @BeforeAll
    public static void setupBrowser(){
        browserType5 = BrowserType.CHROME;
    }

    @BeforeEach
    public void setupTest(){
        driver5 = createWebDriver(browserType5);
        driver5.manage().window().maximize();
        driver5.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION));
        driver5.get(siteURL5);
    }

    @AfterEach
    public void tearDown(){
        //driver.quit();
    }

}
