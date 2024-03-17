package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTests {

    @Test (dependsOnMethods = "Valid_Test_Registration")
    public void Valid_Login() {
        LoginPage ValidloginPage = navBarPage.clickLoginButton_HomePage();
        ValidloginPage.setEmail("mohamedwaleed9@gmail.com");
        ValidloginPage.setPassword("123456");
        ValidloginPage.clickLoginButton_LoginPage();
        assertTrue(navBarPage.getCheckLoginConfirm().contains("My account"), "Failed Login");
    }
    @Test
    public void Invalid_Password_Login() {
        LoginPage InValidloginPage = navBarPage.clickLoginButton_HomePage();
        InValidloginPage.setEmail("mohamedwaleed99@gmail.com");
        InValidloginPage.setPassword("12");
        InValidloginPage.clickLoginButton_LoginPage();
        assertTrue(navBarPage.getLoginFailed().contains("Register"), "Failed Login");
    }
    @Test
    public void Invalid_Email_Login() {
        LoginPage InValidloginPage = navBarPage.clickLoginButton_HomePage();
        InValidloginPage.setEmail("m@gmail.com");
        InValidloginPage.setPassword("123456");
        InValidloginPage.clickLoginButton_LoginPage();
        assertTrue(navBarPage.getLoginFailed().contains("Register"), "Failed Login");
    }
    @Test
    public void Forget_Password_With_Valid_Email_Login() {
        LoginPage InValidloginPage = navBarPage.clickLoginButton_HomePage();
        InValidloginPage.clickForgetPasswordButton_LoginPage();
        InValidloginPage.setForgetPassword("mohamedwaleed9@gmail.com");
        InValidloginPage.RecoverEmailButton_LoginPage();
        InValidloginPage.CloseButton_LoginPage();
        assertTrue(InValidloginPage.CheckMessage().contains("Email with instructions has been sent to you."), "Failed Login");
    }
    @Test
    public void Forget_Password_With_InValid_Email_Login() {
        LoginPage InValidloginPage = navBarPage.clickLoginButton_HomePage();
        InValidloginPage.clickForgetPasswordButton_LoginPage();
        InValidloginPage.setForgetPassword("mohamedwaleed2@gmail.com");
        InValidloginPage.RecoverEmailButton_LoginPage();
        InValidloginPage.CloseButton_LoginPage();
        assertFalse(InValidloginPage.CheckMessage().contains("Email with instructions has been sent to you."), "Failed Login");
    }
}
