package tema_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

import static org.testng.Assert.assertTrue;

public class Test2 extends BaseNew {

    @Test(groups = "mobile")
    public static void test2() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("delaygotobasic"))).click();
        Thread.sleep(5000);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;
            }
        }
        WebElement newPageContent = driver.findElement(By.cssSelector(".explanation"));
        assertTrue(newPageContent.isDisplayed());

    }


@Test
public static void test21() throws InterruptedException {
    driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(By.id("delaygotobounce"))).click();
    Thread.sleep(2000);
    Set<String> windowHandles = driver.getWindowHandles();
    for (String handle : windowHandles) {
        if (!handle.equals(driver.getWindowHandle())) {
            driver.switchTo().window(handle);
            break;
        }
    }
    WebElement newPageContent = driver.findElement(By.cssSelector(".explanation"));
    assertTrue(newPageContent.isDisplayed());

}
}