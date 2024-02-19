package tema_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test3 extends BaseEight {

    @Test
    public static void test3() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        WebElement refreshText = driver.findElement(By.cssSelector("p#refreshdisplay"));
        refreshText.getText();
        String textBeforeRefresh = refreshText.getText();
        System.out.println("Textul inainte de refresh " + textBeforeRefresh);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        WebElement buttonRefresh = driver.findElement(By.id("button"));
        buttonRefresh.click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#refreshdisplay")));

        WebElement afterrefreshText = driver.findElement(By.cssSelector("p#refreshdisplay"));
        afterrefreshText.getText();
        String textAfterRefresh = afterrefreshText.getText();
        System.out.println("Textul dupa refresh " + textAfterRefresh);


    }

    }
