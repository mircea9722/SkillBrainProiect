package tema6.testPage;

import org.example.bonigarciaselenium.setup.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static org.example.bonigarciaselenium.setup.WebDriverFactory.createWebDriver;
import static org.example.bonigarciaselenium.utils.Constants.DURATION;

public class BaseTestPage {

    public static WebDriver driver;

    String siteURL1 = "";
    String siteURL2 = "";

    static org.example.bonigarciaselenium.setup.BrowserType browserType;


    @BeforeClass
    public static void setupBrowser(){
        browserType = BrowserType.CHROME;
    }

    @BeforeMethod
    public void setupTest(){
        driver = createWebDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION));

    }
    @AfterMethod
    public void tearDown(){
        //driver2.quit();
    }
}


