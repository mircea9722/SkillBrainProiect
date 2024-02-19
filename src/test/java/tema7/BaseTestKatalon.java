package tema7;

import org.example.bonigarciaselenium.setup.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static org.example.bonigarciaselenium.setup.WebDriverFactory.createWebDriver;
import static org.example.bonigarciaselenium.utils.Constants.DURATION;

public abstract class BaseTestKatalon {

  public static WebDriver driver;
  public static String siteURL = "\"https://katalon-demo-cura.herokuapp.com\"";
          public static BrowserType browserType;

  @BeforeClass
  public static void setupBrowser(){browserType = BrowserType.CHROME;}

    @BeforeMethod
    public void beforeMethod() {
        driver = createWebDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION));
        driver.get(siteURL);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        //driver.quit();
        }
    }
