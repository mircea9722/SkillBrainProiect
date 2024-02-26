package tema_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test4 extends BaseNew {
    @Test
    public static void test4(){
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement clickFirstButton = driver.findElement(By.id("button00"));
        clickFirstButton.click();
        WebElement clickSecondButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button01")));
        clickSecondButton.click();
        WebElement clickThirdButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button02")));
        clickThirdButton.click();
        WebElement clickForthButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button03")));
        clickForthButton.click();
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonmessage")));
        String message = messageElement.getText();
        Assert.assertEquals(message, "All Buttons Clicked");
    }
}
