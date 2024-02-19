package tema_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 extends BaseEight {


@Test(groups = "desktop")
    public void test1() throws InterruptedException {
    driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement dropDown1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select#combo1")));
    Select select1 = new Select(dropDown1);
    select1.selectByVisibleText("Desktop");
    Thread.sleep(3000);
    WebElement dropDown2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("combo2")));
    Select select2 = new Select(dropDown2);
    select2.selectByVisibleText("C");
    driver.findElement(By.cssSelector("input.styled-click-button[type='submit'][name='submitbutton']")).click();
}

}
