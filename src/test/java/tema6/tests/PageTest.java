package tema6.tests;

import org.apache.commons.io.FileUtils;
import org.example.tema6.testPage.BaseTestPage;
import org.example.tema6.testPage.WebPageTest;
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

public class PageTest extends BaseTestPage {
    WebPageTest webPageTest;

    @BeforeMethod
    public void setWebTest() {
       driver.get("https://testpages.eviltester.com/styled/index.html");
        webPageTest = new WebPageTest(driver);
    }

    @Test
    public void takeScreenshotAlert() {
        webPageTest.getAlertButton().click();
        try {
            WebElement element = driver.findElement(By.cssSelector("#element"));
            element.click();

        } catch (Exception e) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddHH-mm-ss");
            String currentDateTime = dateFormat.format(new Date());
            webPageTest.setScreenShotPath("src/test/resources/alertScreenshots/alertpage_" + currentDateTime);
            File destfile = new File("src/test/resources/alertScreenshots/alertpage_" + currentDateTime + ".png");
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
    public void takeScreenshotFakeAlert() {
        webPageTest.getFakeAlertButton().click();
        try {
            WebElement element = driver.findElement(By.cssSelector("#element"));
            element.click();

        } catch (Exception e) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddHH-mm-ss");
            String currentDateTime = dateFormat.format(new Date());
            webPageTest.setScreenShotPath("src/test/resources/alertScreenshots/alertpage_" + currentDateTime);
            File destfile = new File("src/test/resources/alertScreenshots/alertpage_" + currentDateTime + ".png");
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
    public void takeScreenshotHtmlForm() {
        webPageTest.getHtmlFormExempleButton().click();
        try {
            WebElement element = driver.findElement(By.cssSelector("#element2"));
            element.click();
        } catch (Exception e) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddHH-mm-ss");
            String currentDateTime = dateFormat.format(new Date());
            webPageTest.setScreenShotPath("src/test/resources/htmlForm/htmlform_" + currentDateTime);
            File destfile = new File("src/test/resources/htmlForm/htmlform_" + currentDateTime + ".png");
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
    public void takeScreenshotHtml5Form(){
        webPageTest.getHtml5ElementFormTestExempleButton().click();
        try {
            WebElement element = driver.findElement(By.cssSelector("#element2"));
            element.click();
        } catch (Exception e) {
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddHH-mm-ss");
            String currentDateTime = dateFormat.format(new Date());
            webPageTest.setScreenShotPath("src/test/resources/htmlForm/html5form_" + currentDateTime);
            File destfile = new File("src/test/resources/htmlForm/html5form_" + currentDateTime + ".png");
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




