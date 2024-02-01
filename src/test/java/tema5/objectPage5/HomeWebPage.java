package tema5.objectPage5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.bonigarciaselenium.utils.Constants.DURATION;

public abstract class HomeWebPage {
    private WebDriver driver5;
    private WebDriverWait wait5;

    public HomeWebPage(WebDriver driver5) {
        this.driver5 = driver5;
        wait5 = new WebDriverWait(driver5, Duration.ofSeconds(DURATION));
    }

    public WebDriver getDriver() {
        return driver5;
    }

    public void setDriver(WebDriver driver5) {
        this.driver5 = driver5;
    }

    public WebDriverWait getWait() {
        return wait5;
    }

    public WebElement getBasicWebPageExample() {
        return driver5.findElement(By.cssSelector("a#basicpagetest"));
    }

    public WebElement getElementAttributesExemple() {
        return driver5.findElement(By.cssSelector("a#elementattributestest"));
    }

    public WebElement getLocatorsFindByPlaygrounTestPage() {
        return driver5.findElement(By.cssSelector("a#findbytest"));
    }

    public WebElement getWebDriverExemplePage() {
        return driver5.findElement(By.cssSelector("a#webdriverexamplepage"));
    }
}

