package tema5.demoQaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class WebPageDemo extends HomePageDemo {

    public WebPageDemo(WebDriver driver3) {
        super(driver3);
    }

    public WebElement getFullName(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#userName.mr-sm-2.form-control")));
    }

    public WebElement getEmail(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#userEmail.mr-sm-2.form-control")));
    }

    public WebElement getCurrentAddress(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("textarea#currentAddress.form-control")));
    }

    public WebElement getPermanentAddress(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("textarea#permanentAddress.form-control")));
    }

    public WebElement getSubmitButtonCheckBox(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#submit.btn.btn-primary")));
    }

    public WebElement getHomeButton() {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.rct-title")));
    }

    public WebElement geCheckBox() {
        return getDriver().findElement(By.cssSelector("li#item-1.btn.btn-light\n"));
    }

    public WebElement getCheckBoxButton(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.rct-checkbox")));
    }

    public WebElement getImpressiveOption() {
        // return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#impressiveRadio.custom-control-input")));
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"impressiveRadio\"]")));
    }

    public WebElement getRadioCheckButton(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.custom-control.custom-radio.custom-control-inline")));
    }

    public WebElement getYesOption(){

        WebElement webElement = waitForElement(getDriver(), By.cssSelector("input#yesRadio"));
        return webElement;

    }

    public static WebElement waitForElement(WebDriver driver, By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(org.openqa.selenium.NoSuchElementException.class)
                .ignoring(org.openqa.selenium.StaleElementReferenceException.class);

        return wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }


    public WebElement getAddButton() {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#addNewRecordButton.btn.btn-primary")));
    }
    public WebElement getFirstName(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#firstName.mr-sm-2.form-control")));
    }
    public WebElement getLastName(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#lastName.mr-sm-2.form-control")));
    }
    public WebElement getEmailWebTables(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#userEmail.mr-sm-2.form-control")));
    }
    public WebElement getAge (){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#age.mr-sm-2.form-control")));
    }
    public WebElement getSalary(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#salary.mr-sm-2.form-control")));
    }
    public WebElement getDepartment (){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#department.mr-sm-2.form-control")));
    }
    public WebElement getSubmitButtonWeb(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#submit.btn.btn-primary")));
    }

    public WebElement getDoubleClickButton(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#doubleClickBtn.btn.btn-primary")));
    }
    public WebElement getHomeButtonLinks (){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#simpleLink")));
    }
}
