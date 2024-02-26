package tema7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;

public class Tests extends BaseTestKatalon {

    @BeforeClass
    public static void setupDragAndDrop() {
        siteURL = "https://katalon-demo-cura.herokuapp.com";
    }

    @Test
    public void PossitiveTestLogin() {

        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")).click();
        driver.findElement(By.id("txt-username")).sendKeys(
                "John Doe");
        driver.findElement(By.id("txt-password")).sendKeys(
                "ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
    }

    @Test
    public void NegativeTestLogin() {

        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")).click();
        driver.findElement(By.id("txt-username")).sendKeys("Mircea Vasile");
        driver.findElement(By.id("txt-password")).sendKeys("Mircea123456");
        driver.findElement(By.id("btn-login")).click();
    }

    @Test
    public void MakeAppointmentTest() {
        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Parker");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
    }

    @Test
    public void ReservationPositiveTest() {
        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Vill");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        driver.findElement(By.cssSelector("#combo_facility > option:nth-child(3)")).click();
        driver.findElement(By.id("txt_visit_date")).click();
        driver.findElement(By.cssSelector("body > div > div.datepicker-days > table > tbody > tr:nth-child(3) > td:nth-child(5)")).click();
        driver.findElement(By.id("txt_comment")).sendKeys("Thank you!");
        driver.findElement(By.id("btn-book-appointment")).click();
    }

    @Test
    public void HomeButtonTest() {
        driver.findElement(By.id("btn-make-appointment")).click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        driver.findElement(By.cssSelector("#combo_facility > option:nth-child(3)")).click();
        driver.findElement(By.id("txt_visit_date")).click();
        driver.findElement(By.cssSelector("body > div > div.datepicker-days > table > tbody > tr:nth-child(3) > td:nth-child(5)")).click();
        driver.findElement(By.id("txt_comment")).sendKeys("Thank you!");
        driver.findElement(By.id("btn-book-appointment")).click();
        driver.findElement(By.id("menu-toggle")).click();
        driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[2]/a")).click();
    }

}
