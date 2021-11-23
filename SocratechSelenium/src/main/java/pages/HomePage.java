package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //Elementos de Homepage
    public By formAuthenticationLink = By.linkText("Form Authentication");
    public By shiftingContentLink = By.linkText("Shifting Content");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Acciones sobre Homepage
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public ShiftingContentPage clickShiftingContent(){
        driver.findElement(shiftingContentLink).click();
        return new ShiftingContentPage(driver);
    }

    public void scrollIntoView(By element){
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


}
