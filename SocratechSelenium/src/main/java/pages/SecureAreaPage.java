package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    private By loginOkMessage = By.id("flash");

    public String getAlertMessage(){
        return driver.findElement(loginOkMessage).getText();
    }
}
