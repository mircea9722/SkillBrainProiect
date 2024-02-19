package tema6.objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.bonigarciaselenium.utils.Constants.DURATION;

public abstract class HomeDemoQa {

    private WebDriver driver;
    private WebDriverWait wait;
    private String screenShotPath;
    public HomeDemoQa(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(DURATION));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public String getScreenShotPath() {
        return screenShotPath;
    }

    public void setScreenShotPath(String screenShotPath) {
        this.screenShotPath = screenShotPath;
    }

    public WebElement getNewTabButton(){return driver.findElement(By.id("tabButton"));}

    public WebElement getNewWindowButton(){return driver.findElement(By.id("windowButton"));}

    public WebElement getNewWindowMessageButton(){return driver.findElement(By.id("messageWindowButton"));}

    public WebElement getCookiesButton() {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.fc-button.fc-cta-consent.fc-primary-button")));
    }
}
