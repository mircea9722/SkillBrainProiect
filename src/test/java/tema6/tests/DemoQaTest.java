package tema6.tests;

import org.apache.commons.io.FileUtils;
import org.example.tema6.testPage.BaseTestPage;
import org.example.tema6.testPage.WebDemoQa;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class DemoQaTest extends BaseTestPage {

    WebDemoQa webDemoQa;

    @BeforeMethod
    public void setWebTest() {
        driver.get("https://demoqa.com/browser-windows");
        webDemoQa = new WebDemoQa(driver);
    }

    @Test
    public void takeScreenshotNewTabButton() throws InterruptedException {
        webDemoQa.getCookiesButton().click();
        webDemoQa.getNewTabButton().click();
        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }
        try {
            WebElement element = driver.findElement(By.cssSelector("#element"));
            element.click();

        } catch (Exception e) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddHH-mm-ss");
            String currentDateTime = dateFormat.format(new Date());
            webDemoQa.setScreenShotPath("src/test/resources/demoqa/newtab_" + currentDateTime);
            File destfile = new File("src/test/resources/demoqa/newtab_" + currentDateTime + ".png");
            try {
                FileUtils.copyFile(file, destfile);
            } catch (IOException exception) {
                throw new RuntimeException(e);
            }
        } finally {
            driver.quit();
        }
    }

    @Test
    public void takeScreenshotNewWindowButton() throws InterruptedException {
        webDemoQa.getCookiesButton().click();
        webDemoQa.getNewWindowButton().click();
        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }
        try {
            WebElement element = driver.findElement(By.cssSelector("#element"));
            element.click();

        } catch (Exception e) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddHH-mm-ss");
            String currentDateTime = dateFormat.format(new Date());
            webDemoQa.setScreenShotPath("src/test/resources/demoqa/newWindow_" + currentDateTime);
            File destfile = new File("src/test/resources/demoqa/newWindow_" + currentDateTime + ".png");
            try {
                FileUtils.copyFile(file, destfile);
            } catch (IOException exception) {
                throw new RuntimeException(e);
            }
        } finally {
            driver.quit();
        }
    }

    @Test
    public void takeScreenshotNewWinsowMessageButton() throws InterruptedException {
        webDemoQa.getCookiesButton().click();
        webDemoQa.getNewWindowMessageButton().click();
        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }
        try {
            WebElement element = driver.findElement(By.cssSelector("#element"));
            element.click();

        } catch (Exception e) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddHH-mm-ss");
            String currentDateTime = dateFormat.format(new Date());
            webDemoQa.setScreenShotPath("src/test/resources/demoqa/newWindowMessage_" + currentDateTime);
            File destfile = new File("src/test/resources/demoqa/newWindowMessage_" + currentDateTime + ".png");
            try {
                FileUtils.copyFile(file, destfile);
            } catch (IOException exception) {
                throw new RuntimeException(e);
            }
        } finally {
            driver.quit();
        }
    }

}

