package tema5.tests5;

import org.example.tema5.objectPage5.PageWeb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PageWebTest extends BaseTest5 {

    PageWeb pageWeb;

    @BeforeEach
    public void setPageWeb() {
        pageWeb = new PageWeb(driver5);
    }

    @Test
    public void getBasicWebPageTest() {
        pageWeb.getBasicWebPageExample().click();
        String textDeAfisat = pageWeb.getParagraph().getText();
        System.out.println(textDeAfisat);
    }

    @Test
    public void getParagraphDynamicTest() {
        pageWeb.getElementAttributesExemple().click();
        String textDeAfisat = pageWeb.getParagraphDynamic().getText();
        System.out.println(textDeAfisat);
        pageWeb.getAddAnotherAttributeButton().click();
    }

    @Test
    public void getFindByPlaygroudTest() {
        pageWeb.getLocatorsFindByPlaygrounTestPage().click();
        String textDeAfisat = pageWeb.getFindByPlayground().getText();
        System.out.println(textDeAfisat);
        pageWeb.getFindByPlaygroundLink().click();
    }

    @Test
    public void getInputText(){
        pageWeb.getWebDriverExemplePage().click();
        pageWeb.getInputText().click();
        pageWeb.getInputText().sendKeys("29");
        pageWeb.getProcessOnServerButton().click();
        String textDeAfisat = pageWeb.getMessage().getText();
        System.out.println(textDeAfisat);

    }

}

