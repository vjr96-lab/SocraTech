package BaseTests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends Base{

    @Test
    public void testSuccessFullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setElementField("tomsmith", loginPage.usernameField);
        loginPage.setElementField("SuperSecretPassword!", loginPage.passwordField);
        SecureAreaPage secureAreaPage = loginPage.clickLogin();
        assertTrue(secureAreaPage.getAlertMessage().contains("You logged into a secure area!"));
    }
}
