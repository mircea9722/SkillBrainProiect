package tema5.objectPage5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageWeb extends HomeWebPage{
    public PageWeb(WebDriver driver5) {
        super(driver5);
    }

    public WebElement getParagraph(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#para1.main")));
    }

    public WebElement getParagraphDynamic(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#jsattributes")));

    }

    public WebElement getAddAnotherAttributeButton(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.styled-click-button")));
    }

    public WebElement getFindByPlayground(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#p1.normal")));
    }

    public WebElement getFindByPlaygroundLink(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#a26.normal")));
    }
    public WebElement getInputText(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#numentry")));
    }
    public WebElement getProcessOnServerButton(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#submit-to-server")));
    }
    public WebElement getMessage(){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message.message")));
    }
}


