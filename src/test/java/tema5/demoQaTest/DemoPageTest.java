package tema5.demoQaTest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoPageTest extends BaseTestDemo {
    WebPageDemo webPageDemo;

    @BeforeEach
    public void setWebTest() {
        webPageDemo = new WebPageDemo(driver3);
    }

    @Test
    public void textBoxTest() {
        webPageDemo.getTextBox().click();
        webPageDemo.getFullName().sendKeys("Bobanga Radu");
        webPageDemo.getEmail().sendKeys("radu.bobanga@gmail.com");
        webPageDemo.getCurrentAddress().sendKeys("Str. Luptei");
        webPageDemo.getPermanentAddress().sendKeys("Str. Vasile Aaron");
        webPageDemo.getSubmitButtonCheckBox().click();
    }

    @Test
    public void checkBox() {
        webPageDemo.geCheckBox().click();
        webPageDemo.getCheckBoxButton().click();
    }

    @Test
    public void radioButton(){
        webPageDemo.getRadioButton().click();
        webPageDemo.getRadioCheckButton().click();
    }

    @Test
    public void WebTables(){
        webPageDemo.getWebTables().click();
        webPageDemo.getAddButton().click();
    }
}
