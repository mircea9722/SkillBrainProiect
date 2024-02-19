package tema6.objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.bonigarciaselenium.utils.Constants.DURATION;

public abstract class HomePageTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private String screenShotPath;
    public HomePageTest(WebDriver driver) {
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

    public WebElement getAlertButton(){ return driver.findElement(By.cssSelector("a#alerttest"));}

    public WebElement getFakeAlertButton(){return driver.findElement(By.cssSelector("a#fakealerttest"));}

    public WebElement getHtmlFormExempleButton(){return  driver.findElement(By.cssSelector("a#htmlformtest"));}

    public WebElement getHtml5ElementFormTestExempleButton(){return  driver.findElement(By.cssSelector("a#html5formtest"));}
}