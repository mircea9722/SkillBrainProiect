package tema6.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public final class WebDriverFactory {

    // public static final double pi = 3.14; --- exemplu de constanta

    public static WebDriver createWebDriver(BrowserType browserType) {
        /*final int value;
        value = 0; -- valoarea nu poate fi schimbata odata ce a fost atribuita
        value = 2;*/

        switch (browserType) {
            case EDGE:
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case OPERA:
                WebDriverManager.operadriver().setup();
                return new OperaDriver();
            case SAFARI:
                WebDriverManager.safaridriver().setup();
                return new SafariDriver();
            default:
                // throw new IllegalArgumentException("Unsupported browser type " + browserType);
                 throw new IllegalArgumentException("Unsupported browser type: " + browserType.browserValue); // se printeaza valoarea din paranteza
                //throw new IllegalArgumentException("Unsupported browser type: " + browserType); // se printeaza enumul asa cum se numeste
        }
    }

    public static void main(String[] args) {
        // WebDriver driver = WebDriverFactory.createWebDriver(BrowserType.FIREFOX); // testare rapida a functiei
        // WebDriver driver = WebDriverFactory.createWebDriver(BrowserType.SAFARI); // testare rapida a functiei
    }
}
