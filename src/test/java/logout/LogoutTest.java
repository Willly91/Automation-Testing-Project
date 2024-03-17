package logout;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LogoutTest extends BaseTests {

    @Test (dependsOnMethods = "Valid_Test_Registration")
    public void Logout_Successful()  {
        LoginPage loginPage = navBarPage.clickLoginButton_HomePage();
        loginPage.setEmail("mohamedwaleed9@gmail.com");
        loginPage.setPassword("123456");
        loginPage.clickLoginButton_LoginPage();
        assertTrue(navBarPage.getCheckLoginConfirm().contains("My account"), "Failed Login");

        navBarPage.clickLogoutButton_HomePage();
        assertEquals(navBarPage.checkLogoutConfirm(), "Log in", "Failed Logout");
    }
}
