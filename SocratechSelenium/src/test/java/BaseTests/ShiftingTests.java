package BaseTests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import pages.ShiftingContentPage;

import static org.testng.Assert.assertTrue;

public class ShiftingTests extends Base {

    @Test
    public void testSuccessShiftingTests(){
        homePage.scrollIntoView( homePage.shiftingContentLink);
        ShiftingContentPage shiftingPage = homePage.clickShiftingContent();
        shiftingPage.setElementField("tomsmith", loginPage.usernameField);
        shiftingPage.setElementField("SuperSecretPassword!", loginPage.passwordField);
        SecureAreaPage secureAreaPage = loginPage.clickLogin();
        assertTrue(secureAreaPage.getAlertMessage().contains("You logged into a secure area!"));
    }
}
