package tema_8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class Test5 extends BaseEight {

    @Test
    public void testDynamicButtons() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement button0 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button00")));
        button0.click();

        WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button01")));
        button1.click();

        WebElement button2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button02")));
        button2.click();

        WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button03")));
        button3.click();

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonmessage")));
        assertEquals("All Buttons Clicked", message.getText());
    }
}
