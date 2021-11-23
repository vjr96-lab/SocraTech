package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver  driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public By usernameField = By.id("username");
    public By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    public void setElementField(String textField, By element){
        driver.findElement(element).sendKeys(textField);
    }

    public SecureAreaPage clickLogin(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
