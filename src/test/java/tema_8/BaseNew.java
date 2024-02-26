package tema_8;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseNew {
    protected static WebDriver driver;

    @BeforeClass(groups = "desktop")
    public void setupDesktop() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod(groups = "mobile")
    public void setUpMobile() {
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-mobile-emulation");
        options.addArguments("--window-size=414,896");
        options.addArguments("--user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 14_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0 Mobile/15E148 Safari/604.1");
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(414,896));
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}