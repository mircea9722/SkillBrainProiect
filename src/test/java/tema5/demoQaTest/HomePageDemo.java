package tema5.demoQaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.bonigarciaselenium.utils.Constants.DURATION;

public class HomePageDemo {

    private WebDriver driver3;
    private WebDriverWait wait3;

    public HomePageDemo(WebDriver driver5) {
        this.driver3 = driver5;
        wait3 = new WebDriverWait(driver5, Duration.ofSeconds(DURATION));
    }

    public WebDriver getDriver(){
        return driver3;
    }
    public void setDriver(WebDriver driver5) {
        this.driver3 = driver5;
    }

    public WebDriverWait getWait() {
        return wait3;
    }

    public WebElement getTextBox() {
        return driver3.findElement(By.cssSelector("li#item-0.btn.btn-light\n"));
    }

    public WebElement getCheckBox() {
        return driver3.findElement(By.cssSelector("li#item-1.btn.btn-light\n"));
    }

    public WebElement getRadioButton() {
        return driver3.findElement(By.cssSelector("li#item-2.btn.btn-light\n"));
    }

    public WebElement getWebTables() {
        return driver3.findElement(By.cssSelector("li#item-3.btn.btn-light\n"));
    }

    public WebElement getButtons() {
        return driver3.findElement(By.cssSelector("li#item-4.btn.btn-light\n"));
    }

    public WebElement getLinks() {
        return driver3.findElement(By.cssSelector("li#item-5.btn.btn-light\n"));
    }


}
